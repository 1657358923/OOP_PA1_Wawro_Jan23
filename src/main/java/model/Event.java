package model;

import model.enums.EventTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Event {
    Random rand = new Random();
    private EventTypes typeOfEvent;
    private Organiser chiefOrganiser;
    private List<Helper> helpers;
    private List<Organiser> organisers;
    private List<Guest> guests;

    public Event(EventTypes typeOfEvent, List<Helper> helpers, List<Organiser> organisers, List<Guest> guests) {
        this.typeOfEvent = typeOfEvent;
        this.chiefOrganiser = getChiefOrganiser(organisers);
        this.helpers = helpers;
        this.organisers = organisers;
        this.guests = guests;
    }

    private Organiser getChiefOrganiser(List<Organiser> organisers) {
        return organisers.get(rand.nextInt(organisers.size()));
    };


}