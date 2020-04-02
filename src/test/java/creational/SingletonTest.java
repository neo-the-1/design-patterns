package creational;

import creational.singleton.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.*;

class SingletonTest {

    @Test
    void createSingletonInstances() {
        Singleton instance1 = Singleton.getInstance();
        Assertions.assertNotNull(instance1);

        Singleton instance2 = Singleton.getInstance();
        Assertions.assertSame(instance1, instance2);
    }

    @BeforeAll
    static void initialCheckForLazyLoading() throws NoSuchFieldException, IllegalAccessException {
        Field instanceField = Singleton.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        Assertions.assertNull(instanceField.get(null));
    }

    @Test
    void createSingletonInstancesUsingMultipleThreads() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Callable<Singleton>> callableTasks = List.of(Singleton::getInstance, Singleton::getInstance);
        List<Future<Singleton>> futures = executor.invokeAll(callableTasks);
        Assertions.assertSame(futures.get(0).get(), futures.get(1).get());
    }

    @Test
    void createSingletonInstancesUsingPrivateConstructor() throws NoSuchMethodException {
        Singleton.getInstance();
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Assertions.assertThrows(InvocationTargetException.class, () -> constructor.newInstance());
    }

    @Test
    void createSingletonInstancesUsingClone() {
        Singleton instance1 = Singleton.getInstance();
        Assertions.assertThrows(CloneNotSupportedException.class, () -> instance1.clone());
    }

    @Test
    void createSingletonInstancesUsingDeserialization() throws IOException, ClassNotFoundException {
        Singleton instance1 = Singleton.getInstance();

        byte[] data = null;
        try (ByteArrayOutputStream os = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(os);) {
            out.writeObject(instance1);
            data = os.toByteArray();
        }

        Singleton instance2 = null;
        try (InputStream is = new ByteArrayInputStream(data);
             ObjectInputStream in = new ObjectInputStream(is);) {
            instance2 = (Singleton) in.readObject();
        }
        Assertions.assertSame(instance1, instance2);
    }

}
