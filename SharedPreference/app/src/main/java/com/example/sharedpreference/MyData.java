package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class MyData {
    public int number;
    private Context context;

    //alt+enter

    public MyData(Context context) {
        this.context = context;
    }

    public void save(){
        String name = context.getResources().getString(R.string.My_DATA);
        SharedPreferences shp = context.getSharedPreferences(name,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shp.edit();
        String key = context.getResources().getString(R.string.KEY);
        editor.putInt(key,number);

        editor.apply();//提交
    }
    public int load(){
        String name = context.getResources().getString(R.string.My_DATA);
        SharedPreferences shp = context.getSharedPreferences(name,Context.MODE_PRIVATE);
        String key = context.getResources().getString(R.string.KEY);

        number = shp.getInt(key,context.getResources().getInteger(R.integer.defValue));

        return number;
    }
}
