package model;

import model.enums.eventTypes;

import java.util.ArrayList;
import java.util.List;

public class event {
    private eventTypes typeOfEvent;
    private organiser chiefOrganiser;
    private List<helper> helpers;
    private List<organiser> organisers;
    private List<guests> guests;

    public event(eventTypes typeOfEvent, organiser chiefOrganiser) {
        this.typeOfEvent = typeOfEvent;
        this.chiefOrganiser = chiefOrganiser;
        this.helpers = new ArrayList<helper>();
        this.organisers = new ArrayList<organiser>();
        organisers.add(chiefOrganiser);
        this.guests = new ArrayList<guests>();
    }
}