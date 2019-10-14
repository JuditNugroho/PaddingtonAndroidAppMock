package com.example.sisalfamart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MsproportionFragments extends Fragment {


    public MsproportionFragments() {
        // Required empty public constructor
    }

    public static MsproportionFragments newInstance() {
        MsproportionFragments fragment = new MsproportionFragments();
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
        return inflater.inflate(R.layout.fragment_msproportion_fragments, container, false);
    }


}
