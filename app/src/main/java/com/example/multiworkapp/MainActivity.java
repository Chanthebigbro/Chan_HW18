package com.example.multiworkapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inputText = this.findViewById(R.id.InputEditText);
    }

    public void factorialScreenB(View v)
    {
        Intent i = new Intent (this, Screen2.class);
        InputVal.inputValue = inputText.getText().toString();
        this.startActivity(i);
    }

    public void sqrtScreenB(View v)
    {
        Intent i = new Intent (this, Screen3.class);
        InputVal.inputValue = inputText.getText().toString();
        this.startActivity(i);
    }
}