package service;

import model.Helper;
import model.Organiser;

import java.util.List;

public interface EventManager {
    public boolean canEventStart(List<Helper> helpers, List<Organiser> organisers);

    //EventAttendants.HELPERS //EventAttendants.ORGANISERS;
}
