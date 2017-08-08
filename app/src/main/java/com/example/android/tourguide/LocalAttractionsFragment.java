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
        attractionsList.add(new Attraction("Tarout Castle", "Tarout Island", 0, null ));
        attractionsList.add(new Attraction("Qatif Castle Entertainment Complex", "Qatif Central", 0, null ));
        attractionsList.add(new Attraction("Abu Lawzah Bath", "Toubi Area", 0, null ));
        attractionsList.add(new Attraction("Mangrove Forest", "Covering the undamaged costal areas of Tarout Island", 0, null ));
        attractionsList.add(new Attraction("Ramis Farms", "The only left costal farms in the area " +
                "surrounding Awamiyah on the Eastern side ", 0, null ));
        attractionsList.add(new Attraction("Majedyiah Cornish", "Oldest Cornish in Qatif - Majediah Area", 0, null ));
        attractionsList.add(new Attraction("A'imah Bridge", "Newest Bridge linking majediah with Nasrah and Turkiyah", 0, null ));


        AttractionsAdapter theAttractionsAdapter = new AttractionsAdapter((Activity) getActivity(),
                attractionsList, R.color.localAttractionsBackground);

        //get the the attraction list and set the attractions adapter to it
        ListView theListView = (ListView) rootView.findViewById(R.id.attractions_list);
        theListView.setAdapter(theAttractionsAdapter);

        return rootView;

    }//onCreateView method

}//RestaurantFragment class