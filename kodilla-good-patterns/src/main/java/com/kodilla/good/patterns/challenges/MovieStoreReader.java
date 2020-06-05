package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreReader {

    public static void main(String[] args) {
        Map<String, List<String>> map = MovieStore.getMovies();
        String movieList = map.entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(movieList);
    }
}
