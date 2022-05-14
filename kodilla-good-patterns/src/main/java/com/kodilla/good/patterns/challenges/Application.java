package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movieTitles = movieStore.getMovies().values().stream()
                .map(strings -> String.join("! ", strings))
                .collect(Collectors.joining("! ", "", "!"));

        System.out.println(movieTitles);





    }
}
