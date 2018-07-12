package com.visionvow.skillvow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.visionvow.skillvow.SmallFragments.DatePickerFrag;

public class PlanActivity extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_plan_activity);
    }

    //Shows the date picker
    public void showDatePickerDialog(View v) {
        DatePickerFrag newFragment = new DatePickerFrag();
        newFragment.setCreatedFrom(this.findViewById(android.R.id.content));
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
}
