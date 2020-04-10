package creational;

import creational.factorymethod.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

class FactoryMethodTest {

    @Test
    void createDefaultSet() {
        List<Integer> list = List.of(100, 72, 7, 27, 69);
        Set<Integer> set = Factory.createSet(Factory.SetType.DEFAULT);
        set.addAll(list);
        Assertions.assertTrue(set.contains(list.get(0)));
        Assertions.assertTrue(set.contains(list.get(1)));
        Assertions.assertTrue(set.contains(list.get(2)));
        Assertions.assertTrue(set.contains(list.get(3)));
        Assertions.assertTrue(set.contains(list.get(4)));
    }

    @Test
    void createOrderedSet() {
        List<Integer> list = List.of(100, 72, 7, 27, 69);
        Set<Integer> set = Factory.createSet(Factory.SetType.ORDERED);
        set.addAll(list);
        Assertions.assertIterableEquals(list, set);
    }

    @Test
    void createSortedSet() {
        List<Integer> list = Arrays.asList(100, 72, 7, 27, 69);
        Set<Integer> set = Factory.createSet(Factory.SetType.SORTED);
        set.addAll(list);
        Collections.sort(list);
        Assertions.assertIterableEquals(list, set);
    }

}
