package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

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

        DBManager dbm = new DBManager(this);




    }

}
