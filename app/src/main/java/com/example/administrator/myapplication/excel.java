package com.example.administrator.myapplication;

import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


/**
 * Created by Administrator on 2015/9/29.
 *
 * 导入excel表格
 */

public class excel {

    public Course course;
    public Sheet sheet;
    public static final String path = "mnt/sdcard/course.xls";//模拟器sd卡中excel表格的路径

    public  List<Course> readExcel() {//读取excel表格的所有数据
        int rows;
        ArrayList<Course> list = new ArrayList<Course>();
        try {
            Workbook book = Workbook.getWorkbook(new File(path));//工作簿
            sheet = book.getSheet(0);//工作表
            rows = sheet.getRows();//行数

            for(int i=4;i<=rows;i++){
                Course course = new Course();

                course.setGrade(getCell(i,1));//导入课程信息
                course.setMajor(getCell(i, 2));
                course.setSum(getCell(i, 3));
                course.setCourseName(getCell(i, 4));
                course.setType(getCell(i, 5));
                course.setCredit(getCell(i, 6));
                course.setClassHour(getCell(i, 7));
                course.setExperimentHour(getCell(i, 8));
                course.setComputerHour(getCell(i, 9));
                course.setFromToEnd(getCell(i, 10));
                course.setTeacher(getCell(i, 11));
                course.setNote(getCell(i, 12));

                Log.i("Data",getCell(i, 9));
                list.add(course);
            }
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public String getCell(int i,int j){//获取i行j列的单元格的值
        Cell c = sheet.getCell(j-1, i-1);
        return c.getContents().trim();//返回去空格的值
    }

}
