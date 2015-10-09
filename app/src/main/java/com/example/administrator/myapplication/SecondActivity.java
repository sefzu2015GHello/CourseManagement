package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/9/29.
 *
 * 显示课程的界面
 */
public class SecondActivity extends Activity{

    private DBOpenHelper helper;
    private SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView tx = (TextView)findViewById(R.id.textView3);

        DBManager dbm = new DBManager(this);
       // Course course = dbm.query("计算机仿真技术");
        //tx.setText(course.getExperimentHour());
        ArrayList list = dbm.allName();
        String[] names =(String[])list.toArray();
        tx.setText(names[5]);





    }

}
