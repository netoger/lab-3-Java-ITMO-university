package enums;

public enum TimeOfDay {
    NIGHT("ночь"),
    MORNING("утро"),
    DAY("день"),
    EVENING("вечер");
    private final String name;
    private TimeOfDay(String name) {this.name = name;}

    public String getName() {
        return name;
    }
}
