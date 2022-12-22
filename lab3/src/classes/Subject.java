package classes;

import interfaces.*;

public class Subject extends Entity implements Moving, DoingSmf, ShowingCondition {
    private Place place;

    public Subject(String name) {
        this.name = name;
        System.out.println("Создан предмет " + name);
    }

    @Override
    public void move(Place place) {
        this.place = place;
        if (property == null) {
            System.out.println(name + " переместился в " + place.name);
        } else {
            System.out.println(property + " " + name + " переместился в " + place.name);
        }
    }

    @Override
    public void showCondition(String smf) {
        System.out.print(name + property);
    }

    @Override
    public String getProperty() {
        return property;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public void doingSmf(String doing, String smf) {
        if (property == null) {
            System.out.println(name + " " + doing + " " + smf);
        } else {
            System.out.println(property + " " + name + " " + doing + " " + smf);
        }
    }
}
