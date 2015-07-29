package com.github.pires.obd.reader.activity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.pires.obd.reader.R;
import roboguice.fragment.RoboFragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class MapActivityFragment extends RoboFragment {

    public MapActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_map, container, false);
    }
}
