package classes;

import enums.*;

public class Place extends Entity {
    public static TimeOfDay time = TimeOfDay.DAY;

    public Place(String name) {
        this.name = name;
        System.out.printf("Создано место: %s. \n Время: %s \n", name, time.getName());
    }

    public static void setTime() {
        if (time == TimeOfDay.DAY) {
            time = TimeOfDay.EVENING;
            System.out.println("Наступил " + time.getName());
        } else if (time == TimeOfDay.EVENING) {
            time = TimeOfDay.NIGHT;
            System.out.println("Наступила " + time.getName());
        } else if (time == TimeOfDay.NIGHT) {
            time = TimeOfDay.MORNING;
            System.out.println("Наступило " + time.getName());
        } else {
            time = TimeOfDay.DAY;
            System.out.println("Наступил " + time.getName());
        }
    }

    public final static Place NOWHERE = new Place("нигде");
    public final static Place Home = new Place("дом");

    @Override
    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String getProperty() {
        return property;
    }
}
