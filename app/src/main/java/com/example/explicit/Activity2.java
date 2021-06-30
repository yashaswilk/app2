package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tvwel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tvwel=findViewById(R.id.tvwel);
        String name=getIntent().getStringExtra("name");
        tvwel.setText(name+"  welcome ");
    }
}