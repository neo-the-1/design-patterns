package creational.singleton;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton extends NonSingleton {

    private static Lock lock = new ReentrantLock();
    private static volatile Singleton instance;

    private Singleton() {
        if (null != instance)
            throw new IllegalCallerException();
    }

    public static Singleton getInstance() {
        if (null == instance) {
            mockCPUDelay();

            lock.lock();
            if (null == instance) {
                mockCPUDelay();
                instance = new Singleton();
            }
            lock.unlock();
        }
        return instance;
    }

    private static void mockCPUDelay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return instance;
    }

}
