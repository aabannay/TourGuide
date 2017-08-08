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
        attractionsList.add(new Attraction("Thursday Market", "Qatif Central",
                R.drawable.khamees_souq, null ));
        attractionsList.add(new Attraction("Waqif Market", "Qatif Central", R.drawable.waqif_market, null ));
        attractionsList.add(new Attraction("Moving Markets", "Multiple Locations within Qatif", R.drawable.moving_markets, null ));
        attractionsList.add(new Attraction("Animals (Birds) Market", "Qatif Central", R.drawable.birds_market, null ));
        attractionsList.add(new Attraction("Fish Market", "Qatif Central", R.drawable.qatif_fish_market, null ));
        attractionsList.add(new Attraction("Vegetables Market", "Qatif Central", R.drawable.vigetables_market, null ));
        attractionsList.add(new Attraction("Mias Market", "Qatif Central", R.drawable.mias_market, null ));
        attractionsList.add(new Attraction("Qatif City Mall", "Shatee District - Taroot Island", R.drawable.qatif_city_mall, null ));
        attractionsList.add(new Attraction("Mazaya Hyper Market", "Qudus Road", R.drawable.mazaya_market, null ));


        AttractionsAdapter theAttractionsAdapter = new AttractionsAdapter((Activity) getActivity(),
                attractionsList, R.color.marketsBackground);

        //get the the attraction list and set the attractions adapter to it
        ListView theListView = (ListView) rootView.findViewById(R.id.attractions_list);
        theListView.setAdapter(theAttractionsAdapter);

        return rootView;

    }//onCreateView method

}//RestaurantFragment class