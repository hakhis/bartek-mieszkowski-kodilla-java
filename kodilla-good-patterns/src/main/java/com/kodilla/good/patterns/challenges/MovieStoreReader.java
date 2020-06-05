package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreReader {

    public static void main(String[] args) {
        Map<String, List<String>> map = MovieStore.getMovies();
        List<String> movieList = map.entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(e -> e + " ! ")
                .collect(Collectors.toList());
        movieList.stream().forEach(System.out::print);

    }
}
