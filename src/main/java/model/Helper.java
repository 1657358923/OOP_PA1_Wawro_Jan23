package model;

public class Helper {
    private String name;

    public Helper(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Helper{" +
                "name='" + name + '\'' +
                '}';
    }
}
