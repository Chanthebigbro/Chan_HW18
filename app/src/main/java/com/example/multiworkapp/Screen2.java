package com.example.multiworkapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class Screen2 extends AppCompatActivity
{
    private TextView outPut;
    private int n = 0;

    public int factorialCal(int number)
    {
        if (number ==0)
            return 1;
        else
            return (number*factorialCal(number-1));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.screen2);

        this.outPut = this.findViewById(R.id.src2);
        this.outPut.setText("");

        n = Integer.parseInt(InputVal.inputValue);

        String tmpS = String.valueOf(factorialCal(n));
        this.outPut.setText(tmpS);
    }


    public void stopScreenB (View v)
    {
        Intent i = new Intent (this, MainActivity.class);
        InputVal.inputValue = "0";
        this.startActivity(i);
    }
}
