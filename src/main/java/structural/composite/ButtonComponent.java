package structural.composite;

public class ButtonComponent extends HtmlComponent {

    public ButtonComponent() {
        super("button");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print(this))
                .append(print(this).replace("<", "</"))
                .append(System.lineSeparator());
        return stringBuilder.toString();
    }

}
