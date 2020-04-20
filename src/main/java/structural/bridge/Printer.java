package structural.bridge;

import java.util.Map;

public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(header(), details());
    }

    protected abstract String header();

    protected abstract Map<String, Object> details();

}
