package model;

public class Guest {
    private int guestID;
    private boolean hasGoodieBag;

    public Guest(int guestID, boolean hasGoodieBag) {
        this.guestID = guestID;
        this.hasGoodieBag = hasGoodieBag;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestID=" + guestID +
                ", hasGoodieBag=" + hasGoodieBag +
                '}';
    }
}
