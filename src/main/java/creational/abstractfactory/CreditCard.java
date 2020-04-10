package creational.abstractfactory;

public abstract class CreditCard {

    private String name;

    protected CreditCard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
