package model;

public class Event {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Dates dates;

    public Dates getDates() {
        return this.dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    private Address _embedded;

    public Address get_embedded() {
        return _embedded;
    }

    public void set_embedded(final Address _embedded) {
        this._embedded = _embedded;
    }




}
