package structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.composite.*;

class CompositeTest {

    @Test
    void testHtml() {
        HtmlComponent div = new DivComponent();

        HtmlComponent span = new SpanComponent();
        span.add(new InputComponent());
        span.add(new InputComponent());
        div.add(span);

        div.add(new ButtonComponent());

        Assertions.assertEquals("<div>" + System.lineSeparator() +
                "<span>" + System.lineSeparator() +
                "<input></input>" + System.lineSeparator() +
                "<input></input>" + System.lineSeparator() +
                "</span>" + System.lineSeparator() +
                "<button></button>" + System.lineSeparator() +
                "</div>" + System.lineSeparator(), div.toString());
    }

}
