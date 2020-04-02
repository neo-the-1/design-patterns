package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private final Map<String, Gadget> gadgets;

    public Registry() {
        gadgets = new HashMap<>();

        Handset handset = new Handset();
        handset.setCpu("otcacore");
        handset.setRam(6);
        handset.setMemory(64);
        handset.setScreen(6.3f);
        handset.setCamera(48);
        gadgets.put("handset", handset);

        Laptop laptop = new Laptop();
        laptop.setCpu("corei5");
        laptop.setRam(8);
        laptop.setMemory(1000);
        laptop.setScreen(14f);
        laptop.setKeyboard("backlit");
        gadgets.put("laptop", laptop);
    }

    public Gadget create(String type) {
        try {
            return (Gadget) gadgets.get(type).clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
