package structural.decorator;

public class AtomicInteger extends AtomicNumber {

    public AtomicInteger(Integer value) {
        super(value);
    }

    @Override
    public synchronized void incrementBy(Number value) {
        this.value = intValue() + value.intValue();
    }

    @Override
    public synchronized void decrementBy(Number value) {
        this.value = intValue() - value.intValue();
    }

    @Override
    public synchronized int intValue() {
        return this.value.intValue();
    }

    @Override
    public synchronized long longValue() {
        return this.value.longValue();
    }

    @Override
    public synchronized float floatValue() {
        return this.value.floatValue();
    }

    @Override
    public synchronized double doubleValue() {
        return this.value.doubleValue();
    }

}
