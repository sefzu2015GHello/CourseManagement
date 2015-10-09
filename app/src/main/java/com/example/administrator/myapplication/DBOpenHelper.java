package com.example.administrator.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2015/9/29.
 *
 * 创建数据库
 */
public class DBOpenHelper extends SQLiteOpenHelper{
    private static final int VERSION = 1;// 定义数据库版本号
    private static final String DBNAME = "test.db";// 定义数据库名

    public DBOpenHelper(Context context) {// 定义构造函数

        super(context, DBNAME, null, VERSION);// 重写基类的构造函数
    }

    //数据库第一次被创建时onCreate会被调用
    @Override
    public void onCreate(SQLiteDatabase db) {// 创建课程信息表
        db.execSQL("create table IF NOT EXISTS tb_course ( grade text,major text,sum text,"
                +"courseName text primary key,type text,credit text,classHour text,"
                +"experimentHour text,computerHour text,fromToEnd text,"
                +"teacher text,note text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // 覆写基类的onUpgrade方法，以便数据库版本更新

    }

}
