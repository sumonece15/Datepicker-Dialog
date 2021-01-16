package com.example.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button showButton;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textViewid);
        showButton = (Button) findViewById(R.id.buttonId);

        showButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        DatePicker datePicker =new DatePicker(this);
        int currentDay =datePicker.getDayOfMonth();
        int currentMonth =(datePicker.getMonth())+1;
        int currentYear =datePicker.getYear();

     datePickerDialog = new DatePickerDialog(this,

     new DatePickerDialog.OnDateSetListener(){

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                textView.setText("Selected Date : "+dayOfMonth+"/"+(month+1)+"/"+year);
            }
        },currentDay,currentMonth,currentYear);
     datePickerDialog.show();

    }
}