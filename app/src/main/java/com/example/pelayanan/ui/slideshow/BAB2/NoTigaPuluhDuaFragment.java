package com.example.pelayanan.ui.slideshow.BAB2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pelayanan.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoTigaPuluhDuaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoTigaPuluhDuaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NoTigaPuluhDuaFragment() {
    }

    // TODO: Rename and change types and number of parameters
    public static NoTigaPuluhDuaFragment newInstance(String param1, String param2) {
        NoTigaPuluhDuaFragment fragment = new NoTigaPuluhDuaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public static Fragment newInstance(String head) {return null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_no_tiga_puluh_dua, container, false);
    }
}