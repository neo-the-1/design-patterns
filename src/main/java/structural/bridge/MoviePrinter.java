package structural.bridge;

import java.util.LinkedHashMap;
import java.util.Map;

public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String header() {
        return movie.getTitle();
    }

    @Override
    protected Map<String, Object> details() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("runtime(min)", movie.getRuntimeInMinutes());
        map.put("year", movie.getYear());
        return map;
    }

}
