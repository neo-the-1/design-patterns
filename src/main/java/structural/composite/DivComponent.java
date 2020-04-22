package structural.composite;

public class DivComponent extends HtmlComponent {

    public DivComponent() {
        super("div");
    }

    @Override
    public HtmlComponent add(HtmlComponent htmlComponent) {
        htmlComponents.add(htmlComponent);
        return htmlComponent;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print(this))
                .append(System.lineSeparator());

        for (HtmlComponent htmlComponent : htmlComponents)
            stringBuilder.append(htmlComponent.toString());

        stringBuilder.append(print(this).replace("<", "</"))
                .append(System.lineSeparator());
        return stringBuilder.toString();
    }

}
