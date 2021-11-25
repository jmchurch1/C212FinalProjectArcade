package edu.iu.c212.places;

import edu.iu.c212.Arcade;
import edu.iu.c212.models.User;

public abstract class Place {
    String placeName;
    // reference to the place's name
    Arcade arcade;
    // reference to the arcade that the place is in
    double entryFee;
    // can be 0 for places with no entry fee (i.e. lobby)
    abstract void onEnter(User user);
    // method that is invoked when the place is entered

    public abstract String toString();
    // Intellij made me put a body here, remember to ask about it
}