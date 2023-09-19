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
        this.chiefOrganiser = randomChiefOrganiser(organisers);
        this.helpers = helpers;
        this.organisers = organisers;
        this.guests = guests;
    }

    private Organiser randomChiefOrganiser(List<Organiser> organisers) {
        return organisers.get(rand.nextInt(organisers.size()));
    };

    public Organiser getChiefOrganiser() {
        return chiefOrganiser;
    }

    public EventTypes getTypeOfEvent() {
        return typeOfEvent;
    }

    public List<Helper> getHelpers() {
        return helpers;
    }

    public List<Organiser> getOrganisers() {
        return organisers;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    @Override
    public String toString() {
        return "\nEvent{" +
                ", typeOfEvent=" + typeOfEvent +
                ", chiefOrganiser=" + chiefOrganiser +
                ", helpers=" + helpers +
                ", organisers=" + organisers +
                ", guests=" + guests +
                '}';
    }
}