package structural.bridge;

import java.util.Map;

public class ConsoleFormatter implements Formatter {

    @Override
    public String format(String header, Map<String, Object> details) {
        StringBuilder stringBuilder = new StringBuilder(header)
                .append(System.lineSeparator());
        stringBuilder.append("-".repeat(header.length()))
                .append(System.lineSeparator());
        for (Map.Entry<String, Object> entry : details.entrySet())
            stringBuilder.append(entry.getKey())
                    .append('=')
                    .append(entry.getValue())
                    .append(System.lineSeparator());
        return stringBuilder.toString();
    }

}
