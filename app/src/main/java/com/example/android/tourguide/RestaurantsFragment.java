package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
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
        attractionsList.add(new Attraction( getString(R.string.tanoor), getString(R.string.tanoor_location), 0, null ));
        attractionsList.add(new Attraction( getString(R.string.hotstop), getString(R.string.qudos_street), 0, null ));
        attractionsList.add(new Attraction( getString(R.string.flame), getString(R.string.bahar_location), 0, null ));
        attractionsList.add(new Attraction( getString(R.string.ghumgham), getString(R.string.ohud), 0, null ));
        attractionsList.add(new Attraction( getString(R.string.spicy_meal), getString(R.string.spicy_meal_location), 0, null ));
        attractionsList.add(new Attraction( getString(R.string.alnoor), getString(R.string.qudaih), 0, null ));
        attractionsList.add(new Attraction( getString(R.string.ayub), getString(R.string.ayob_location), 0, null ));
        attractionsList.add(new Attraction( getString(R.string.shawerma_king), getString(R.string.shawerma_king_location), 0, null ));
        attractionsList.add(new Attraction( getString(R.string.mexican), getString(R.string.mexican_location), 0, null ));
        AttractionsAdapter theAttractionsAdapter = new AttractionsAdapter(getActivity(),
                attractionsList, R.color.restaurantsBackground);

        //get the the attraction list and set the attractions adapter to it
        ListView theListView = (ListView) rootView.findViewById(R.id.attractions_list);
        theListView.setAdapter(theAttractionsAdapter);

        return rootView;

    }//onCreateView method

}//RestaurantFragment class