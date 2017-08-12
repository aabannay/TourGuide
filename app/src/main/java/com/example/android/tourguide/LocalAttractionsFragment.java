package com.example.android.tourguide;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LocalAttractionsFragment extends Fragment {

    public LocalAttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = (View) inflater.inflate(R.layout.attractions_list, container, false);

        //create the list of attractions
        final ArrayList<Attraction> attractionsList = new ArrayList<>();

        //add the attractions to the list
        attractionsList.add(new Attraction(getString(R.string.tarout_castle), getString(R.string.tarout_island) , 0, null ));
        attractionsList.add(new Attraction(getString(R.string.qatif_castle), getString(R.string.central_qatif), 0, null ));
        attractionsList.add(new Attraction(getString(R.string.abu_lawzah), getString(R.string.toubi), 0, null ));
        attractionsList.add(new Attraction(getString(R.string.mangrove), getString(R.string.mangrove_location), 0, null ));
        attractionsList.add(new Attraction(getString(R.string.ramis), getString(R.string.ramis_location), 0, null ));
        attractionsList.add(new Attraction(getString(R.string.majediyah_cournish), getString(R.string.majediyah_cournish_location), 0, null ));

        attractionsList.add(new Attraction(getString(R.string.aimah_bridge), getString(R.string.aimah_bridge_location), 0, null ));

        AttractionsAdapter theAttractionsAdapter = new AttractionsAdapter((Activity) getActivity(),
                attractionsList, R.color.localAttractionsBackground);

        //get the the attraction list and set the attractions adapter to it
        ListView theListView = (ListView) rootView.findViewById(R.id.attractions_list);
        theListView.setAdapter(theAttractionsAdapter);

        return rootView;

    }//onCreateView method

}//RestaurantFragment class