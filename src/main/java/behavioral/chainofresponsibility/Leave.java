package behavioral.chainofresponsibility;

public class Leave {

    public enum Type {
        ANNUAL, CASUAL, MEDICAL
    }

    private Type type;
    private int days;

    public Leave(Type type, int days) {
        this.type = type;
        this.days = days;
    }

    public Type getType() {
        return type;
    }

    public int getDays() {
        return days;
    }

}
