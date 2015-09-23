package com.example.administrator.createactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;

/**
 * Created by Administrator on 2015/8/27.
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);
        Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        Log.d("SecondActivity",data);
    }
}
