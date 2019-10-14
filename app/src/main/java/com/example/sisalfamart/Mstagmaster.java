package com.example.sisalfamart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Mstagmaster extends Fragment {


    public Mstagmaster() {
        // Required empty public constructor
    }

    public static Mstagmaster newInstance() {
        Mstagmaster fragment = new Mstagmaster();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_mstagmaster, container, false);
    }

}
