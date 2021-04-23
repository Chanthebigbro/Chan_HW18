package com.example.multiworkapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class Screen3 extends AppCompatActivity
{
    private TextView outPut;
    private int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.screen3);

        this.outPut = this.findViewById(R.id.src3);
        this.outPut.setText("");

        n = Integer.parseInt(InputVal.inputValue);

        String tmpS = String.valueOf(Math.sqrt(n));
        this.outPut.setText(tmpS);
    }


    public void stopScreenB (View v)
    {
        Intent i = new Intent (this, MainActivity.class);
        InputVal.inputValue = "0";
        this.startActivity(i);
    }
}