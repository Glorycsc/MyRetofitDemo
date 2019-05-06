package com.glory.okdownload;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.liulishuo.okdownload.DownloadListener;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;

import java.io.File;
import java.util.List;
import java.util.Map;

import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class MainActivity extends AppCompatActivity {

    private String url = "http://124.205.9.251:8082/static/ibook/201803/bb8644db-59be-4f0e-923e-a9b544fc5e94.dbz";
    private File parentFile;
    private int REQUEST_WRITE_EXTERNAL_STORAGE = 101;
    private DownloadTask task;
    private long length;
    private long total = 58728470;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parentFile = Environment.getExternalStorageDirectory();
        startTask();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestWriteExternalStorage();
        } else {
            startTask();
        }
// cancel
//        task.cancel();


// execute task synchronized
//        task.execute(listener);

    }

    private void startTask() {
        task = new DownloadTask.Builder(url, parentFile)
                .setFilename("glorizizFIle.dbz")
                // the minimal interval millisecond for callback progress
                .setMinIntervalMillisCallbackProcess(30)
                // do re-download even if the task has already been completed in the past.
                .setPassIfAlreadyCompleted(false)
                .build();


        task.enqueue(new DownloadListener() {
            private int percent;

            @Override
            public void taskStart(@NonNull DownloadTask task) {
                Toast.makeText(MainActivity.this, "start download ", Toast.LENGTH_LONG).show();
                Log.d("glz", "taskStart");
            }

            @Override
            public void connectTrialStart(@NonNull DownloadTask task, @NonNull Map<String, List<String>> requestHeaderFields) {
                Log.e("glz", "connectTrialStart");
            }

            @Override
            public void connectTrialEnd(@NonNull DownloadTask task, int responseCode, @NonNull Map<String, List<String>> responseHeaderFields) {
                Log.e("glz", "connectTrialEnd");
            }

            @Override
            public void downloadFromBeginning(@NonNull DownloadTask task, @NonNull BreakpointInfo info, @NonNull ResumeFailedCause cause) {
                Log.d("glz", "downloadFromBeginning");
            }

            @Override
            public void downloadFromBreakpoint(@NonNull DownloadTask task, @NonNull BreakpointInfo info) {
                Log.d("glz", "downloadFromBeginning");
            }

            @Override
            public void connectStart(@NonNull DownloadTask task, int blockIndex, @NonNull Map<String, List<String>> requestHeaderFields) {
                Log.e("glz", "connectStart");
            }

            @Override
            public void connectEnd(@NonNull DownloadTask task, int blockIndex, int responseCode, @NonNull Map<String, List<String>> responseHeaderFields) {
                Log.e("glz", "connectEnd");
            }

            @Override
            public void fetchStart(@NonNull DownloadTask task, int blockIndex, long contentLength) {
                Log.e("glz", "fetchstart");
            }

            @Override
            public void fetchProgress(@NonNull DownloadTask task, int blockIndex, long increaseBytes) {
                percent = (int) ((length += increaseBytes) * 100 / total);
                Log.e("glz", "fetchProgress" + "increaseBytes" + increaseBytes + "--length" + percent);
            }

            @Override
            public void fetchEnd(@NonNull DownloadTask task, int blockIndex, long contentLength) {
                Log.d("glz", contentLength + "contentLength");
            }

            @Override
            public void taskEnd(@NonNull DownloadTask task, @NonNull EndCause cause, @Nullable Exception realCause) {
                Log.d("glz", "over");
                if (percent == 100) {
                    Toast.makeText(MainActivity.this, "下载完成", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    /*
     *6.0以上系统需要手动申请权限
     */
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void requestWriteExternalStorage() {
        switch (checkSelfPermission(WRITE_EXTERNAL_STORAGE)) {
            case PackageManager.PERMISSION_GRANTED:
                // 已有授权
                Log.i("wxl", "已有授权");
                startTask();
                break;
            case PackageManager.PERMISSION_DENIED:
                // 1、没有权限：尚未请求过权限；
                // 2、或者请求授权被拒绝，用shouldShowRequestPermissionRationale判断用户是否拒绝过，如果返回true，表示用户拒绝过，
                // 再次请求权限，将会出现“不再询问”，勾上“不再询问”，只能选择拒绝，再次进入，shouldShowRequestPermissionRationale始终false
                // 3、或者曾经授权过，但用户在设置中禁用权限
                Log.i("wxl", "是否拒绝过=" + shouldShowRequestPermissionRationale(WRITE_EXTERNAL_STORAGE));
                requestPermissions(new String[]{WRITE_EXTERNAL_STORAGE}, REQUEST_WRITE_EXTERNAL_STORAGE);
                break;
            default:
                break;
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == REQUEST_WRITE_EXTERNAL_STORAGE) {
            if (grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // 授权请求被通过
                Log.i("wxl", "onRequestPermissionsResult=授权请求被通过");
                startTask();
            } else {
                Log.i("wxl", "onRequestPermissionsResult=授权请求不被通过");
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (task != null) {
            task.cancel();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        startTask();
    }
}
