package structural.decorator;

public abstract class AtomicNumber extends Number {

    protected Number value;

    public AtomicNumber(Number value) {
        this.value = value;
    }

    public abstract void incrementBy(Number value);

    public abstract void decrementBy(Number value);

}
