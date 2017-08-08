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
        attractionsList.add(new Attraction("Restaurants Street", "Qala'ah Area", 0, null ));
        attractionsList.add(new Attraction("Ohud Road", "Links Qatif with main highway - Dhahran to Jubail", 0, null ));
        attractionsList.add(new Attraction("Moheet Road", "Linking Western Qatif with the Eastern Qatif and Sehat", 0, null ));
        attractionsList.add(new Attraction("Tarout Island Road", "Linking Qatif and the rest of the " +
                "world to the most important Saudi Island in the Gulf", 0, null ));
        attractionsList.add(new Attraction("Awamiyah-Safwa Road", "Linking Southern Qatif with Northern Qatif", 0, null ));
        attractionsList.add(new Attraction("Costal Road ", "Road that links all costal attractions", 0, null ));

        AttractionsAdapter theAttractionsAdapter = new AttractionsAdapter((Activity) getActivity(),
                attractionsList, R.color.streetsBackground);

        //get the the attraction list and set the attractions adapter to it
        ListView theListView = (ListView) rootView.findViewById(R.id.attractions_list);
        theListView.setAdapter(theAttractionsAdapter);

        return rootView;

    }//onCreateView method

}//RestaurantFragment class