import model.Event;
import service.EventManager;
import service.EventManagerImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, Integer> chiefCounter = new HashMap<>();
        EventManager eventManager = new EventManagerImpl();
        List<Event> events = eventManager.generateEvents(3);
        for(Event event : events) {
            if(eventManager.canEventStart(event)) {
                System.out.println(event.getChiefOrganiser());
                chiefCounter.put(event.getChiefOrganiser().getName(), 1);
            }
        }
    }
}
