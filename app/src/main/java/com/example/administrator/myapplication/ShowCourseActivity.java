package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ShowCourseActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_course);

        TextView courseName = (TextView)findViewById(R.id.tV12);
        TextView grade = (TextView)findViewById(R.id.tV22);
        TextView major = (TextView)findViewById(R.id.tV32);
        TextView sum = (TextView)findViewById(R.id.tV42);
        TextView type = (TextView)findViewById(R.id.tV52);
        TextView credit = (TextView)findViewById(R.id.tV62);
        TextView classHour = (TextView)findViewById(R.id.tV72);
        TextView experimentHour = (TextView)findViewById(R.id.tV82);
        TextView computerHour = (TextView)findViewById(R.id.tV92);
        TextView fromToEnd = (TextView)findViewById(R.id.tV102);
        TextView note = (TextView)findViewById(R.id.tV112);

        Intent intent=getIntent();
        String result=intent.getStringExtra("cname");

        DBManager dbm = new DBManager(this);
        Course course=dbm.find(result);

        courseName.setText(course.getCourseName());
        grade.setText(course.getGrade());
        major.setText(course.getMajor());
        sum.setText(course.getSum());
        type.setText(course.getType());
        credit.setText(course.getCredit());
        classHour.setText(course.getClassHour());
        experimentHour.setText(course.getExperimentHour());
        computerHour.setText(course.getComputerHour());
        fromToEnd.setText(course.getFromToEnd());
        note.setText(course.getNote());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_course, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
