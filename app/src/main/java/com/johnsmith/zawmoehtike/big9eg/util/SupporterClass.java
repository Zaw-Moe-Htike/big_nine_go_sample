package com.johnsmith.zawmoehtike.big9eg.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.johnsmith.zawmoehtike.big9eg.R;

/*
    Created at 16/03/19 by Zaw Moe Htike
 */
public class SupporterClass {

    public static void showLog(String logName, String logContent) {
        Log.d(logName, logContent);
    }

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
