package com.gmail.maxdiland.daggerdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gmail.maxdiland.daggerdemo.R;

public class MainActivity extends AppCompatActivity {
    private Button btnOne;
    private Button btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnOne = (Button) findViewById(R.id.btn_screen1);
        btnTwo = (Button) findViewById(R.id.btn_screen2);
    }

    public void handleClick(View view) {
        if (view == btnOne) {
            Intent intent = new Intent(this, OneActivity.class);
            startActivity(intent);
        } else if (view == btnTwo) {
            Intent intent = new Intent(this, TwoActivity.class);
            startActivity(intent);
        }
    }
}
