package com.example.locationaware2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LocationFragment extends Fragment {
    private TextView coordinatesTextView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_location, container, false);
        coordinatesTextView = view.findViewById(R.id.coordinatesTextView);
        return view;
    }
    public void updateCoordinates(double latitude, double longitude) {
        if (coordinatesTextView != null) {
            coordinatesTextView.setText(String.format("Lat: %.6f, Long: %.6f", latitude, longitude));
        }
    }
}
