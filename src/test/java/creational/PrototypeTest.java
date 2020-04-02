package creational;

import creational.prototype.Gadget;
import creational.prototype.Handset;
import creational.prototype.Laptop;
import creational.prototype.Registry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PrototypeTest {

    private static Registry registry = new Registry();

    @Test
    void createHandsets() {
        Handset handset1 = (Handset) registry.create("handset");
        Handset handset2 = (Handset) registry.create("handset");
        handset2.setRam(4);
        Assertions.assertNotSame(handset1, handset2);
        Assertions.assertEquals(6, handset1.getRam());
        Assertions.assertEquals(4, handset2.getRam());
    }

    @Test
    void createLaptops() {
        Laptop laptop1 = (Laptop) registry.create("laptop");
        Laptop laptop2 = (Laptop) registry.create("laptop");
        laptop2.setKeyboard("touch");
        Assertions.assertNotSame(laptop1, laptop2);
        Assertions.assertEquals("backlit", laptop1.getKeyboard());
        Assertions.assertEquals("touch", laptop2.getKeyboard());
    }

    @Test
    void createGadgetsToCheckPerformance() {
        List<Gadget> gadgets = new ArrayList<>();
        int count = 100000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
            gadgets.add(new Handset());
        long end = System.currentTimeMillis();
        long normalTime = end - start;
        System.out.println(normalTime);

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
            gadgets.add(registry.create("handset"));
        end = System.currentTimeMillis();
        long prototypeTime = end - start;
        System.out.println(prototypeTime);

        Assertions.assertTrue(normalTime > prototypeTime);
    }

}
