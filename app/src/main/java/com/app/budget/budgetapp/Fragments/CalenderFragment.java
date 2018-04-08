package com.app.budget.budgetapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ListView;

import com.app.budget.budgetapp.R;

/**
 * Created by Hitesh on 26/03/17.
 */


public class CalenderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public CalenderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calender, container, false);
        CalendarView calenderView = (CalendarView) rootView.findViewById(R.id.calendarView);
        ListView listView=(ListView) rootView.findViewById(R.id.listView);
        return rootView;
    }
}
