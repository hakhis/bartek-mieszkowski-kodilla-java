package com.kodilla.good.patterns.challenges.moviestore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreReader {

    public static void main(String[] args) {
        Map<String, List<String>> map = MovieStore.getMovies();
        String movieList = map.entrySet().stream()
                .flatMap(e -> {
                    List<String> names = new ArrayList<>();
                    names.add(e.getKey());
                    names.addAll(e.getValue());
                    return names.stream();
                })
                .collect(Collectors.joining(" ! "));
        System.out.println(movieList);
    }
}
