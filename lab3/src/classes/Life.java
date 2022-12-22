package classes;

import enums.Height;
import interfaces.Moving;

public abstract class Life implements Moving {
    protected String name;
    protected Height height;
    protected Place place = Place.NOWHERE;

    @Override
    public void move (Place place){
        System.out.println(name + " покидает " + this.place.name + " и перемещается в " + place.getName() );
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Place getPlace() {
        return place;
    }
}
