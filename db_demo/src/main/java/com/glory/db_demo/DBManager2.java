package com.glory.db_demo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Create by glorizz on 2018/11/14
 * Describe:
 */
public class DBManager2 {
    String DB_NAME = "exportedData.db";

    public SQLiteDatabase GetDataBasePath(Context context) {

        String packageName = context.getPackageName();
        //Log.i("PackName", packageName);
        // String DB_PATH = String.format("/data/data/%1$s/databases/",
        // packageName);
        String DB_PATH = "/data/data/" + packageName + File.separator + DB_NAME;

        if ((new File(DB_PATH)).exists() == false) {
            try {
                // 如 SQLite 数据库文件不存在，再检查一下 database 目录是否存在
                File f = new File("/data/data/" + packageName + File.separator);
                // 如 database 目录不存在，新建该目录
                if (!f.exists()) {
                    f.mkdir();
                }
                // 得到 assets 目录下我们实现准备好的 SQLite 数据库作为输入流
                InputStream is = context.getAssets().open(DB_NAME);
                // 输出流
                OutputStream os = new FileOutputStream(DB_PATH);
                // 文件写入
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
                // 关闭文件流
                os.flush();
                os.close();
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("glz",e.getMessage());
                Toast.makeText(context,e.getMessage(), Toast.LENGTH_LONG).show();
            }
        }

        return SQLiteDatabase.openOrCreateDatabase(DB_PATH, null);
    }
}
