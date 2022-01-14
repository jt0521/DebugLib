package com.debug.lib;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DebugActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String board = Build.BOARD;
        String brand = Build.BRAND;
        String model = Build.MODEL;
        String product = Build.PRODUCT;

        Log.e("tgl===","board: "+board);
        Log.e("tgl===","brand: "+brand);
        Log.e("tgl===","FINGERPRINT: "+Build.FINGERPRINT);
        Log.e("tgl===","model: "+model);
        Log.e("tgl===","product: "+product);

    }
}
