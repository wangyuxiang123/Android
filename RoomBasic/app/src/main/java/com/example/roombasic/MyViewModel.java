package com.example.roombasic;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

/**
 * <pre>
 *     author : wyx
 *     time   : 2021/5/21 22:33
 * </pre>
 */
public class MyViewModel extends AndroidViewModel {
    private WordRepository repository;

    public MyViewModel(@NonNull Application application) {
        super(application);
        repository = new WordRepository(application);

    }
    LiveData<List<Word>> getAllWordsLive() {
        return repository.getAllWordsLive();
    }

    //接口
    void insertWords(Word... words){
        repository.insertWords(words);
    }
    void updateWords(Word... words){
        repository.updateWords(words);
    }
    void deleteWords(Word... words){
        repository.deleteWords(words);
    }
    void deleteAllWords(){
        repository.deleteAllWords();
    }
}
