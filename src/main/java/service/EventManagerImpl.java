package service;


import model.Event;
import model.Helper;
import model.Organiser;
import model.enums.EventTypes;
import repository.EventAttendants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EventManagerImpl implements EventManager {
    Random rand = new Random();
    @Override
    public boolean canEventStart(Event event) {
        if(event.getHelpers().size() < 10 || event.getOrganisers().size() < 3) {
            return false;
        }
        if(event.getChiefOrganiser() == null) {
            return false;
        }
        return true;
    }

    @Override
    public List<Event> generateEvents(int numberOfEvents) {
        List<Event> events = new ArrayList<>();
        for (int i = 0; i<numberOfEvents; i++) {
            events.add(new Event(EventTypes.values()[rand.nextInt(3)], EventAttendants.HELPERS, EventAttendants.ORGANISERS, EventAttendants.GUESTS));
        }
//        System.out.println(events);
        return events;
    }
}
