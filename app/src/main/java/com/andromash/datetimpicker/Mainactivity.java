package com.andromash.datetimpicker;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mainactivity extends AppCompatActivity {
    TextView datepicker,timepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);
        datepicker=findViewById(R.id.datepicker);
        timepicker=findViewById(R.id.timePicker);
    }

    public void datepicker(View view) {
       DateTimePicker.datePicker(this,datepicker);

    }

    public void timepicker(View view) {

        DateTimePicker.timePicker(this,timepicker);
    }
}
