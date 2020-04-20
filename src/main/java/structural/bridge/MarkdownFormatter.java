package structural.bridge;

import java.util.Map;

public class MarkdownFormatter implements Formatter {

    @Override
    public String format(String header, Map<String, Object> details) {
        StringBuilder stringBuilder = new StringBuilder("# ")
                .append(header)
                .append(System.lineSeparator());
        for (Map.Entry<String, Object> entry : details.entrySet())
            stringBuilder.append("- ")
                    .append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append(System.lineSeparator());
        return stringBuilder.toString();
    }

}
