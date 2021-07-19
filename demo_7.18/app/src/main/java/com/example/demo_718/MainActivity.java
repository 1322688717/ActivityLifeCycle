package com.example.demo_718;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * @author 阿宅
 * @time 2012.7.19
 * @version 1.0
 * activity的七种生命周期
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String TAG = "MainActivity";
    private Button btn_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"onCreate");
        btn_intent = findViewById(R.id.btn_intent);
        btn_intent.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_intent:
                Intent intent = new Intent(MainActivity.this,DemoActivity.class);
                startActivity(intent);
                break;
        }
    }
}