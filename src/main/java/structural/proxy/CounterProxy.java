package structural.proxy;

public class CounterProxy implements Service {

    private Service service;

    private int counter;

    public CounterProxy(Service service) {
        this.service = service;
    }


    @Override
    public void serve() {
        counter++;
        service.serve();
    }

    public int getCounter() {
        return counter;
    }

}
