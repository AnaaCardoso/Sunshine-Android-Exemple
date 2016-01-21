package com.example.android.sunshine.app;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ListView lvData;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sol - 21/23",
                "Tomorrow - Sol - 25/30",
                "Saturday - Sol - 17/23",
                "Sunday - Sol - 19/27"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray)
        );

        ArrayAdapter<String> mForeCastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textView,
                weekForecast);

        lvData = (ListView) v.findViewById(R.id.listview_forecast);
        lvData.setAdapter(mForeCastAdapter);

        return v;
    }


}
