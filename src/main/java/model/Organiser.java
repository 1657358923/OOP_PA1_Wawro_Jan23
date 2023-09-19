package model;

public class Organiser {
    private String name;
    private int mainOrganiserCount;

    public Organiser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Organiser{" +
                "name='" + name + '\'' +
                '}';
    }
}
