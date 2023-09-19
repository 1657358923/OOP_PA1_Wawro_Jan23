package service;

import model.Event;
import model.Helper;
import model.Organiser;

import java.util.List;

public interface EventManager {
    public boolean canEventStart(Event event);
    public List<Event> generateEvents(int numberOfEvents);

    //EventAttendants.HELPERS //EventAttendants.ORGANISERS;
}
