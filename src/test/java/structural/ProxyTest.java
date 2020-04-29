package structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.proxy.CounterProxy;
import structural.proxy.Service;
import structural.proxy.ServiceImpl;

class ProxyTest {

    @Test
    void testProxy() {
        Service service = new CounterProxy(new ServiceImpl());
        service.serve();
        service.serve();
        Assertions.assertEquals(2, ((CounterProxy) service).getCounter());
    }

}
