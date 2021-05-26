package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyData myData = new MyData(getApplicationContext()); //不能传递this，当设备旋转时候，MainActivity会保留，但是无法被使用，会发生内存泄漏
        myData.number = 10000000;
        myData.save();
        int y = myData.load();
        String TAG = "MyLOG";
        Log.d(TAG,"OnCreate:"+y);


////        SharedPreferences shp = getPreferences(Context.MODE_PRIVATE); //名字默认为这个线程的名字
//        SharedPreferences shp = getSharedPreferences("My_DATA",Context.MODE_PRIVATE);//可自定义名字
//        SharedPreferences.Editor editor = shp.edit();
//        editor.putInt("NUMBER",600);
////        editor.commit();
//        editor.apply(); //非同步方式的提交操作，可以避免冲突
//
//        int x = shp.getInt("NUMBER",0);
//        String TAG = "MyLOG";
//        Log.d(TAG,"OnCreate:"+x);


    }
}