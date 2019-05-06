package com.glory.db_demo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DBManager dbManager;
    private TextView textView;
    private android.os.Handler handler = new android.os.Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //
            textView.setText(msg.getData().getString("key"));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
//        new Thread() {
//
//            private Bundle bundle;
//
//            @Override
//            public void run() {
//                super.run();
//                try {
//                    dbManager = new DBManager(MainActivity.this);
//                    SQLiteDatabase sqLiteDatabase = dbManager.initDatabase(MainActivity.this.getPackageName());
//                    String name = dbManager.getCitys(sqLiteDatabase, "3186");
//                    Message message = new Message();
//                    bundle.putString("key", name);
//                    message.setData(bundle);
//                    handler.sendMessage(message);
//
//                } catch (IOException e) {
//
//                    e.printStackTrace();
//                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
//                }
//            }
//        }.start();

        testDBManager2();
    }

    private void testDBManager2() {
        String name = "";
        DBManager2 dbManager2 = new DBManager2();
        SQLiteDatabase sqLiteDatabase = dbManager2.GetDataBasePath(this);
        Cursor cursor = sqLiteDatabase.rawQuery("select name from areas where uni_id= ?", new String[]{"3186"});
        while (cursor.moveToNext()) {
            name = cursor.getString(cursor.getColumnIndex("name"));
            Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
        }
    }
}
