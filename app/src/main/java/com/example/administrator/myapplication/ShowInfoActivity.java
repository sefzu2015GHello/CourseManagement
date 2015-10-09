package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;


public class ShowInfoActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        final ListView listView=(ListView)findViewById(R.id.listView1);
        //listView.addHeaderView(line());

        DBManager dbm = new DBManager(this);
        String[] ctype=dbm.allName();//获取所有课程名

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,ctype);
        listView.setAdapter(adapter);
       // listView.addFooterView(line());
        listView.setOnItemClickListener(new OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View arg1, int pos, long id){
                String result=parent.getItemAtPosition(pos).toString();//获取选择项的值

                Log.i("string4","点击了----"+result);

                Intent intent=new Intent(ShowInfoActivity.this,ShowCourseActivity.class);
                intent.putExtra("cname",result);
                startActivity(intent);
//                Toast.makeText(ShowInfoActivity.this,result,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_info, menu);
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

    private View line(){
        ImageView image=new ImageView(this);
        image.setImageResource(R.drawable.line1);
        return image;
    }
}
