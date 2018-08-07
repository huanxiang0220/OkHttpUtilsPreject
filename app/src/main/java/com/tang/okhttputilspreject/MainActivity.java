package com.tang.okhttputilspreject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhy.http.okhttp.OkHttpUtils;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OkHttpUtils okHttpUtils = OkHttpUtils.getInstance();
        Log.e(TAG, "okHttpUtils" + okHttpUtils);
    }

}