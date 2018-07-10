package com.visionvow.skillvow.SmallFragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.visionvow.skillvow.R;

public class DatePicker extends Fragment{
    View view;

    public DatePicker() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.date_picker_fragment, container, false);
        return view;
    }
}
