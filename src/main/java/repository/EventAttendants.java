package repository;

import model.Guest;
import model.Helper;
import model.Organiser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface EventAttendants {
    List<Helper> HELPERS = new ArrayList<>(
            Arrays.asList(
                    new Helper("H1"),
                    new Helper("H2"),
                    new Helper("H3"),
                    new Helper("H4"),
                    new Helper("H5"),
                    new Helper("H6"),
                    new Helper("H7"),
                    new Helper("H8"),
                    new Helper("H9"),
                    new Helper("H10")
            )
    );
    List<Organiser> ORGANISERS = new ArrayList<>(
            Arrays.asList(
                    new Organiser("O1"),
                    new Organiser("O2"),
                    new Organiser("O3")
            )
    );
    List<Guest> GUESTS = new ArrayList<>(
            Arrays.asList(
                    new Guest(1, false),
                    new Guest(2, false),
                    new Guest(3, false),
                    new Guest(4, false),
                    new Guest(5, false),
                    new Guest(6, false),
                    new Guest(7, false),
                    new Guest(8, false),
                    new Guest(9, false),
                    new Guest(10, false)
            )
    );
}

