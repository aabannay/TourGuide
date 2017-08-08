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
        attractionsList.add(new Attraction("Altanoor Restaurant", "Restaurants Road | Qudus Road", 0, null ));
        attractionsList.add(new Attraction("HotStop Mexican Food", "Ohud Road", 0, null ));
        attractionsList.add(new Attraction("Flame Burger", "Bahar District", 0, null ));
        attractionsList.add(new Attraction("Alghumgham Restaurant", "Ohud Road - Lawjam Industrial", 0, null ));
        attractionsList.add(new Attraction("Spicy Meal", "Qudaih | Central Qatif | Qudus Road | Nasirah | Turkiyah | Tarout", 0, null ));
        attractionsList.add(new Attraction("Alnoor Grills", "Qudaih", 0, null ));
        attractionsList.add(new Attraction("Ayub Traditional Kebabs", "Qudaih - Muqaism Area", 0, null ));
        attractionsList.add(new Attraction("Shawerma King", "Qudaih | Imam Ali Round", 0, null ));
        attractionsList.add(new Attraction("Mexican Foodies", "Mexican District", 0, null ));
        AttractionsAdapter theAttractionsAdapter = new AttractionsAdapter(getActivity(),
                attractionsList, R.color.restaurantsBackground);

        //get the the attraction list and set the attractions adapter to it
        ListView theListView = (ListView) rootView.findViewById(R.id.attractions_list);
        theListView.setAdapter(theAttractionsAdapter);

        return rootView;

    }//onCreateView method

}//RestaurantFragment class