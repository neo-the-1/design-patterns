package creational.factorymethod;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Factory {

    public enum SetType {
        DEFAULT, ORDERED, SORTED;
    }

    public static Set createSet(SetType setType) {
        switch (setType) {
            case DEFAULT:
                return new HashSet<>();
            case ORDERED:
                return new LinkedHashSet<>();
            case SORTED:
                return new TreeSet<>();
            default:
                throw new RuntimeException("invalid " + setType);
        }
    }

}
