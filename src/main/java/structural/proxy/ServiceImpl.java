package structural.proxy;

public class ServiceImpl implements Service {

    @Override
    public void serve() {
        System.out.println("served");
    }

}
