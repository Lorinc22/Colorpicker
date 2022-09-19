package com.example.myapplication;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.lang.Object;
import java.text.NumberFormat;
import java.util.Currency;

import com.google.android.material.slider.LabelFormatter;
import com.google.android.material.slider.Slider;



public class MainActivity extends AppCompatActivity
{

    private TextView szinezettTV;
    private SeekBar seekBarRed;
    private SeekBar seekBarGreen;
    private SeekBar seekBarBlue;
    private TextView TVRed;
    private TextView TVGreen;
    private TextView TVBlue;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        szinezettTV.setBackgroundColor(Color.BLACK);
        seekBarRed.setMax(255);
        seekBarBlue.setMax(255);
        seekBarGreen.setMax(255);
        seekBarRed.setProgress(0);
        seekBarBlue.setProgress(0);
        seekBarGreen.setProgress(0);

        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TVRed.setText("Red: " + i);
                szinezettTV.setBackgroundColor(Color.rgb(seekBarRed.getProgress(), seekBarGreen.getProgress(), seekBarBlue.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TVGreen.setText("Green: " + i);
                szinezettTV.setBackgroundColor(Color.rgb(seekBarRed.getProgress(), seekBarGreen.getProgress(), seekBarBlue.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });
        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TVBlue.setText("Blue: " + i);
                szinezettTV.setBackgroundColor(Color.rgb(seekBarRed.getProgress(), seekBarGreen.getProgress(), seekBarBlue.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private  void init()
    {
        szinezettTV = findViewById(R.id.szinezettTV);
        seekBarRed = findViewById(R.id.sbRed);
        seekBarBlue = findViewById(R.id.sbBlue);
        seekBarGreen = findViewById(R.id.sbGreen);
        TVRed = findViewById(R.id.redTV);
        TVGreen = findViewById(R.id.greenTV);
        TVBlue = findViewById(R.id.blueTV);
    }


}