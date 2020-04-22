package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class HtmlComponent {
    private String name;
    protected List<HtmlComponent> htmlComponents = new ArrayList<>();

    public HtmlComponent(String name) {
        this.name = name;
    }

    public HtmlComponent add(HtmlComponent htmlComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract String toString();

    public String print(HtmlComponent htmlComponent) {
        return "<" + name + ">";
    }

}
