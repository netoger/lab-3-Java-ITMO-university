package enums;

public enum Height {
    TALL("очень высокий"),
    SRED("очень средний"),
    SHORT("очень низкий");
    private final String name;
    Height(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
