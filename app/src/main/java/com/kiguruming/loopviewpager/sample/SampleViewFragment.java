package com.kiguruming.loopviewpager.sample;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SampleViewFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SampleViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class SampleViewFragment extends Fragment {

    public static SampleViewFragment newInstance() {
        SampleViewFragment fragment = new SampleViewFragment();
        return fragment;
    }

    public SampleViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample_view, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
