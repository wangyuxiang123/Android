package com.example.roombasic;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * <pre>
 *     author : wyx
 *     time   : 2021/5/21 17:04
 * </pre>
 */

@Database(entities = {Word.class},version = 1,exportSchema = false)
public abstract class WordDatabase extends RoomDatabase {
    private static WordDatabase INSTANCE;

    //单例模式，不然会耗资源,进程同步synchronized
    static synchronized WordDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), WordDatabase.class, "Word_Database")
                    .build();
        }
        return INSTANCE;
    }
    public abstract WordDao getWordDao();
}
