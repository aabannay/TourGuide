package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by towardsfreedom on 7/24/17.
 */

public class AttractionsAdapter extends ArrayAdapter<Attraction> {

    //background color for the list of attractions
    protected int backgroundColorResourceId;

    //constructor method for the attractions adapter.
    public AttractionsAdapter(Activity activity, ArrayList<Attraction> attractionsList, int backgroundColorResourceId) {
        super(activity, 0, attractionsList);
        this.backgroundColorResourceId = backgroundColorResourceId;
    }

    //override the getView method in order to be able to deal with Attraction Object Type.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        //the currently passed word to the adapter
        final Attraction currentAttraction = getItem(position);

        //the name and description textViews of the attraction
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);

        //set the texts from the current attraction to the views to be returned
        nameTextView.setText(currentAttraction.getName());
        descriptionTextView.setText(currentAttraction.getDescription());

        //the image view resource id to hold the attraction image for each attraction
        ImageView theImage = (ImageView) listItemView.findViewById(R.id.attraction_image);

        //set the id for the image to be shown
        if (currentAttraction.getImageResourceId() != 0)
            theImage.setImageResource(currentAttraction.getImageResourceId());
        else
            theImage.setVisibility(View.GONE); //otherwise there is no image and remove it from view

        //Set the background color for the textContainer
        View textContainer = listItemView.findViewById(R.id.info_container);
        //set the color
        int theColor = ContextCompat.getColor(getContext(), backgroundColorResourceId);
        //set this color to the text container
        textContainer.setBackgroundColor(theColor);


        //this is for the location icon to open the right location of each attraction on the list
        ImageView locationIcon = (ImageView) listItemView.findViewById(R.id.location_icon);

        if (currentAttraction.getGeoLocation() != null) {
            locationIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //do what happened when the icon is clicked
                    //i will just create the media player to play the right song by refering to the right file
                    Intent locationIntent = new Intent(Intent.ACTION_VIEW, currentAttraction.getGeoLocation());
                    getContext().startActivity(locationIntent);
                }
            });
        } else
            locationIcon.setVisibility(View.GONE);
        //return the view
        return listItemView;
    }
}
