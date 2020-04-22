package structural.composite;

public class InputComponent extends HtmlComponent {

    public InputComponent() {
        super("input");
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
