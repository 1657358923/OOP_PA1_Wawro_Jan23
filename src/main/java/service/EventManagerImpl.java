package service;


import model.Helper;
import model.Organiser;

import java.util.List;

public class EventManagerImpl implements EventManager {
    @Override
    public boolean canEventStart(List<Helper> helpers, List<Organiser> organisers) {
        return false;
    }
}
