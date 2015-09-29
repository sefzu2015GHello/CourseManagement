package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD
=======
import android.widget.Button;
>>>>>>> f0af7f9dbb05a8692d01addcb34f332bec9f3666

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  login = (Button)findViewById(R.id.button1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);//跳转到SecondActivity
                startActivity(intent);//实现跳转

            }
        });

    }

<<<<<<< HEAD
    public void myclick1(View view){}
    public void myclick2(View view){
        Intent intent=new Intent(MainActivity.this,ShowInfoActivity.class);
        startActivity(intent);
    }
=======





>>>>>>> f0af7f9dbb05a8692d01addcb34f332bec9f3666
}
