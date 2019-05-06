package com.glory.db_demo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Create by glorizz on 2018/11/14
 * Describe: 测试,从assets中获取数据库
 */
public class DBManager {
    private static final String DB_NAME = "exportedData.db";
    private static String TABLE = "areas";
    private Context context;

    public DBManager(Context context) {
        this.context = context;
    }

    //获得数据库
    public SQLiteDatabase initDatabase(String packgeName) throws IOException {
        //需要先将assets中的文件复制到应用私有目录
        String path = "/data/data/" + packgeName + "/databases/" + DB_NAME;
        if (!new File(path).exists()) {
            //如果不存在,需要新建该目录
            new File("/data/data/" + packgeName + "/databases/").mkdirs();
            new File(path).createNewFile();
            FileOutputStream out = new FileOutputStream(path);
            InputStream in = context.getAssets().open(DB_NAME);
            byte[] bytes = new byte[1024];
            int readBytes = 0;
            while ((readBytes = bytes.length) != -1)
                out.write(bytes, 0, readBytes);
            in.close();
            out.close();
        }
        return SQLiteDatabase.openOrCreateDatabase(path, null);
    }

    //数据库查询--根据id查城市,省市
    public String getCitys(SQLiteDatabase db, String id) {
        Cursor cursor = db.rawQuery("select name from areas where uni_id = ?", new String[]{id});
        String name = "";
        while (cursor.moveToNext()) {
            cursor.getString(cursor.getColumnIndex("name"));
        }
        cursor.close();
        return name;
    }
}
