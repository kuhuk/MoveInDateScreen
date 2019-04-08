package com.sharma.kuhuk.moveindatescreen;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    String date, time;
    TextView tvTime, tvDate, tvPropertyName;
    ImageView ivOpenCalendar, ivOpenTimePicker;
    RelativeLayout rlDay, rlTime;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

        private void initView() {

        // Find id(s)
            tvTime = findViewById(R.id.tvTime);
            tvDate = findViewById(R.id.tvDate);
            tvPropertyName = findViewById(R.id.tvPropertyName);
            ivOpenCalendar = findViewById(R.id.ivOpenCalendar);
            ivOpenTimePicker = findViewById(R.id.ivOpenTimePicker);
            rlDay = findViewById(R.id.rlDay);
            rlTime = findViewById(R.id.rlTime);

            // OnClick
            ivOpenCalendar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openCalender();
                    changeBackgroundColor("day");
                }
            });

            ivOpenTimePicker.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openClock();
                    changeBackgroundColor("time");
                }
            });
        }

        private void changeBackgroundColor(String utility) {
            if (utility.equals("day")) {
                rlDay.setBackground(getResources().getDrawable(R.drawable.edittext_round_rect_pink));
            }
            if(utility.equals("time")){
                rlTime.setBackground(getResources().getDrawable(R.drawable.edittext_round_rect_pink));
            }
        }

        private void openClock() {
            // implement clock dialog box
        }

        private void openCalender() {
            // implement calendar dialog box
        }

    }
