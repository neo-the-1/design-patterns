package structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.decorator.AtomicInteger;
import structural.decorator.AtomicNumber;

class DecoratorTest {

    @Test
    void testAtomicInteger() throws InterruptedException {
        AtomicNumber number = new AtomicInteger(20);

        Thread t1 = new Thread(
                () -> {
                    for (int i = 0; i < 100; i++)
                        number.incrementBy(2);
                }
        );
        Thread t2 = new Thread(
                () -> {
                    for (int i = 0; i < 100; i++)
                        number.decrementBy(2);
                }
        );
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Assertions.assertEquals(20, number.intValue());
    }

}
