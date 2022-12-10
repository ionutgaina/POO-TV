package utilities.filters;

import database.Movie;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterByName implements IFilter {
    @Override
    public ArrayList<Movie> doFilter(ArrayList<Movie> movies, ArrayList<String> filters) {
        return (ArrayList<Movie>) movies
                .stream()
                .filter(movie -> filters
                        .stream()
                        .anyMatch( startsWith -> movie.getName().startsWith(startsWith)))
                .collect(Collectors.toList());
    }
}
