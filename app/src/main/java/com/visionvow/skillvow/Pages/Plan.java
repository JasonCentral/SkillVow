package com.visionvow.skillvow.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.visionvow.skillvow.PlanActivity;
import com.visionvow.skillvow.R;

public class Plan extends Fragment {
    View view;

    public Plan() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.plan_fragment, container, false);

        //Sets up add button
        FloatingActionButton addButton = view.findViewById(R.id.plus_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PlanActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        //Sets up add button
//        FloatingActionButton addButton = view.findViewById(R.id.plus_button);
//        addButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), PlanActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
}
