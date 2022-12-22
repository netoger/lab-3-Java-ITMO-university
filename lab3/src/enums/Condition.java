package enums;

public enum Condition {
    SAD("грустный"),
    FUN("веселый"),
    REMORSE("раскаивающийся"),
    SHAME("стыдится"),
    NEUTRAL("нейтральный"),
    FAIR("боящийся");
    private final String name;
    Condition(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
