package com.nstd.android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nstd.android.R;

public class MainActivity extends BaseActivity {

    private String helloStr = "Hello World!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
