package com.visionvow.skillvow.SmallFragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import com.visionvow.skillvow.R;

import java.util.Calendar;

public class DatePickerFrag extends DialogFragment implements DatePickerDialog.OnDateSetListener {
//    View view;

    //    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        view = inflater.inflate(R.layout.date_picker_fragment, container, false);
//        return view;
//    }
    View createdFrom;

    //Set which view this dialog would be popped up from
    public void setCreatedFrom(View createdFrom) {
        this.createdFrom = createdFrom;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);


        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(requireActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        // Changes dates on corresponding text views
        //set year
        TextView yearText = createdFrom.findViewById(R.id.year_pick);
        yearText.setText(String.valueOf(year));
        //set month
        TextView monthText = createdFrom.findViewById(R.id.month_pick);
        //Add 1 because months start at 0 for some reason
        monthText.setText(convertMonthToWord(month + 1));
        //set day
        TextView dayText = createdFrom.findViewById(R.id.day_pick);
        dayText.setText(String.valueOf(dayOfMonth));
    }

    /**
     * Converts the numerical representing to its word representation, ex 1 becomes January
     *
     * @param month The numerical representation
     * @return The word representation
     */
    public String convertMonthToWord(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "???";
        }
    }

}
