package com.example.sharedpreferencespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText name,email;
    Button button,button2;
    String nameStr,emailStr;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    name = findViewById(R.id.etname);
    email = findViewById(R.id.etemail);
    button = findViewById(R.id.button);
    button2 = findViewById(R.id.button2);

    sharedPreferences =getSharedPreferences("Mykey",MODE_PRIVATE);


    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            nameStr = name.getText().toString();//text  views for getting user name and email
            emailStr = email.getText().toString();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("name",nameStr);
            editor.putString("email",emailStr);
            editor.commit();
            Toast.makeText(MainActivity.this, "Information Saved", Toast.LENGTH_SHORT).show();
        }
    });

    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(MainActivity.this,OpenActivity.class);
            startActivity(intent);
        }
    });


    }
}