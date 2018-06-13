package com.example.javatest;

/**
 * Created by Glory on 2018/5/9.
 */

public class JavaTestChen {
    private static long mLoadingMinTime = 1000;

    public static void main(String[] args) {
        long last, current;
        last = System.currentTimeMillis() - 3000;
        current = System.currentTimeMillis();
        int delay = (int)
                (mLoadingMinTime - (current - last));

    }
}
