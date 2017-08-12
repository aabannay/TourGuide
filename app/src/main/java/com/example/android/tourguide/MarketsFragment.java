package com.example.android.tourguide;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MarketsFragment extends Fragment {

    public MarketsFragment() {
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
        attractionsList.add(new Attraction(getString(R.string.thursday_market_title), getString(R.string.central_qatif),
                R.drawable.khamees_souq, null ));
        attractionsList.add(new Attraction( getString(R.string.vigetables_market_title), getString(R.string.central_qatif),
                R.drawable.vigetables_market, null ));
        attractionsList.add(new Attraction( getString(R.string.mias_title), getString(R.string.central_qatif),
                R.drawable.mias_market, null ));
        attractionsList.add(new Attraction( getString(R.string.qcc_title), getString(R.string.qcc_location),
                R.drawable.qatif_city_mall, null ));
        attractionsList.add(new Attraction( getString(R.string.mazaya_title), getString(R.string.qudos_street),
                R.drawable.mazaya_market, null ));


        AttractionsAdapter theAttractionsAdapter = new AttractionsAdapter((Activity) getActivity(),
                attractionsList, R.color.marketsBackground);

        //get the the attraction list and set the attractions adapter to it
        ListView theListView = (ListView) rootView.findViewById(R.id.attractions_list);
        theListView.setAdapter(theAttractionsAdapter);

        return rootView;

    }//onCreateView method

}//RestaurantFragment class