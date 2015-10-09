package com.example.administrator.myapplication;

import android.test.InstrumentationTestCase;

import java.util.List;

/**
 * Created by Administrator on 2015/10/4.
 *
 * DBManager类的单元测试
 */
public class DBManagerTest extends InstrumentationTestCase{
    public void test()throws Exception{
        assertEquals(1,1);
    }

    public void testAllName(){
        String expected="分布式系统";
        String real = new DBManager().find("分布式系统").getCourseName();
        assertEquals(expected,real);
    }


}
