package com.example.sharedpreferencespractice;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OpenActivity extends AppCompatActivity {


    TextView tv3,tv4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);


        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);


        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("Mykey",MODE_PRIVATE);

        String name =sharedPreferences.getString("name","");
        String email = sharedPreferences.getString("email","");

        tv3.setText(name);
        tv4.setText(email);

    }
}
