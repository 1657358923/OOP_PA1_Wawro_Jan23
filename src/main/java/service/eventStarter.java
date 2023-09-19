package service;

import model.helper;
import model.organiser;

import java.util.List;

public interface eventStarter {
    public boolean canEventStart(List<helper> helpers, List<organiser> organisers);
}
