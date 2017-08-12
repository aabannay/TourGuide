package com.example.android.tourguide;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class StreetsFragment extends Fragment {

    public StreetsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        //create the list of attractions
        final ArrayList<Attraction> attractionsList = new ArrayList<>();

        //add the attractions to the list
        attractionsList.add(new Attraction(getString(R.string.restaurants_st), getString(R.string.restaurants_st_desc), 0, null ));
        attractionsList.add(new Attraction(getString(R.string.ohud), getString(R.string.ohud_desc), 0, null ));
        attractionsList.add(new Attraction(getString(R.string.moheet), getString(R.string.moheet_desc), 0, null ));
        attractionsList.add(new Attraction(getString(R.string.tarout_st), getString(R.string.taroot_st_desc), 0, null ));
        attractionsList.add(new Attraction(getString(R.string.awamiya_safwa_rd), getString(R.string.awamia_safwa_rd_desc), 0, null ));
        attractionsList.add(new Attraction(getString(R.string.costal_rd), getString(R.string.costal_rd_desc), 0, null ));

        AttractionsAdapter theAttractionsAdapter = new AttractionsAdapter((Activity) getActivity(),
                attractionsList, R.color.streetsBackground);

        //get the the attraction list and set the attractions adapter to it
        ListView theListView = (ListView) rootView.findViewById(R.id.attractions_list);
        theListView.setAdapter(theAttractionsAdapter);

        return rootView;

    }//onCreateView method

}//RestaurantFragment class