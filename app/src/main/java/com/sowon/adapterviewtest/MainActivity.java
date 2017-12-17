package com.sowon.adapterviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AdapterViewTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 4/2;

        Log.d(TAG, "안녕하세요?");

        String str2 = String.format("a = %d",a);
        Log.d(TAG, str2);

    }
}
