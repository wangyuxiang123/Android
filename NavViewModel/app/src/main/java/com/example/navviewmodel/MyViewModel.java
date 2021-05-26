package com.example.navviewmodel;

import android.widget.SeekBar;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * <pre>
 *     author : wyx
 *     time   : 2021/5/8 22:19
 * </pre>
 */
public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> number;

    public MutableLiveData<Integer> getNumber(){
        if(number==null){
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }
    public void add(int x) {
        number.setValue(number.getValue() + x);
        if(number.getValue()<0){
            number.setValue(0);
        }
    }
    public void setNumber(int x){
        number.setValue(0);
    }
}
