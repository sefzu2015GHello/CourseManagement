package com.example.administrator.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/9/29.
 *
 * 对数据库的操作
 */
public class DBManager {
    private DBOpenHelper helper ;
    private SQLiteDatabase db ;
    private static final String TABLE_NAME = "tb_course";//数据库中表的名称

    public DBManager(Context context) {
        helper = new DBOpenHelper(context);
        db = helper.getWritableDatabase();

        init();

    }

    public ArrayList<String> allName(){//返回所有课程名
        String courseName;
        ArrayList<String> list = new ArrayList<String>();
        Cursor cursor = db.query(TABLE_NAME, new String[]{"courseName"},null,null,null,null,null);
        if(cursor.getCount()>0){
            courseName = cursor.getString(cursor.getColumnIndex("courseName"));
            list.add(courseName);
        }
        return list;
    }

    public Course query(String Name){//根据课程名查询数据
        Course course = new Course();
        Cursor cursor = db.query(TABLE_NAME, null,"courseName = ?",new String[]{Name},null,null,null);
        if(cursor.getCount()>0){
            cursor.moveToFirst(); //将游标移动到第一个记录

            course.setGrade(cursor.getString(0));
            course.setMajor(cursor.getString(1));
            course.setCourseName(cursor.getString(3));
            course.setType(cursor.getString(4));
            course.setCredit(cursor.getString(5));
            course.setClassHour(cursor.getString(6));
            course.setExperimentHour(cursor.getString(7));
            course.setComputerHour(cursor.getString(8));
            course.setFromToEnd(cursor.getString(9));
            course.setTeacher(cursor.getString(10));
            course.setNote(cursor.getString(11));

            return course;

        }
        cursor.close();
        return null;
    }

    public void insert(Course course){  //向表插入数据
        ContentValues values = new ContentValues();//ContentValues用来储存数据；

        if(course.getGrade()!=null)
            values.put("grade",course.getGrade());
        if(course.getMajor()!=null)
            values.put("major",course.getMajor());
        if(course.getSum()!=null)
            values.put("sum",course.getSum());
        if(course.getCourseName()!=null)
            values.put("courseName",course.getCourseName());
        if(course.getType()!=null)
            values.put("type",course.getType());
        if(course.getCredit()!=null)
            values.put("credit",course.getCredit());
        if(course.getClassHour()!=null)
            values.put("classHour",course.getClassHour());
        if(course.getExperimentHour()!=null)
            values.put("experimentHour",course.getExperimentHour());
        if(course.getComputerHour()!=null)
            values.put("computerHour",course.getComputerHour());
        if(course.getFromToEnd()!=null)
            values.put("fromToEnd",course.getFromToEnd());
        if(course.getTeacher()!=null)
            values.put("teacher",course.getTeacher());
        if(course.getNote()!=null)
            values.put("note",course.getNote());

        db.insert(TABLE_NAME, null, values);
    }



    public void init(){ //将excel表格中的数据导入数据库
        excel ex = new excel();
        List<Course> list = ex.readExcel();
        for(int i=0;i<list.size();i++){//循环导入数据
            Course course = list.get(i);
            insert(course);
        }
    }


}
