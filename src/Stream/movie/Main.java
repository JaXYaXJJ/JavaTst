package Stream.movie;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {

        List<Movie> movies = new ArrayList<>();

        movies.addAll(MovieExtractor.getMoviesFromAmazon("Movie"));
        movies.addAll(MovieExtractor.getMoviesFromNetflix("Movie"));

        collectToCollection(movies);
    }

    public static void collectToMap(List<Movie> movies) {

        //GROUP BY

        Map<Long,Movie> moviesMap = movies.stream()
                .collect(Collectors.toMap(
                        movie -> movie.getId(),
                        movie -> movie,
                        (movieOne,movieTwo) -> movieOne.getDuration() <= movieTwo.getDuration() ? movieOne : movieTwo
                ));

        for (long key : moviesMap.keySet())
            System.out.println("Key : " + key + " Value : " + moviesMap.get(key));

        System.out.println(moviesMap instanceof  HashMap);

//        Map<Date,List<Movie>> moviesRating = moviesMap.values().stream()
//                .collect(Collectors.groupingBy(Movie::getRating));
    }

    public static void collectToCollection(List<Movie> movies) {

        List <Movie> movieList = movies.stream()
                .filter(movie -> movie.getRating() >= 4.5)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List size " + movieList.stream());
    }

    public static void reduce(List<Movie> movies) {

        movies.stream()
                .filter(movie -> movie.getRating() > 4.5)
                .reduce( (movieOne, movieTwo) -> movieOne.getDuration() <= movieTwo.getDuration() ?
                        movieOne : movieTwo )
                .ifPresent( movie -> System.out.println("Shortest movie " + movie.getDuration()));
    }

    public static void overloadedReduction() {

        String[] letters = {"A", "A", "B"};

        String contact = Arrays.stream(letters)
                .reduce("", (s1,s2) -> s1 + s2);
    }

    public static void slice(List<Movie> movies) {

        List<String> moviesList =  movies.stream()
                .filter(movie -> movie.getRating() > 4)
//                .distinct()
//                .limit(5)
//                .skip(5)
                .map(movie -> movie.getName())
                .collect(Collectors.toList());

        moviesList.forEach(System.out::println);
    }

    //Matching - noneMatch, allMatch, anyMatch
    //Finding
    //Short-Circuit

    //Rating > 4.8 && Duration < 90

    public static void match(List<Movie> movies) {

        boolean anyMatch = movies.stream()
                .anyMatch( movie -> movie.getRating() > 4.8 && movie.getDuration() < 90);

        System.out.println("anyMatch? : " + anyMatch);
    }

    public static void find(List<Movie> movies) {

        Optional<Movie> result = movies.stream()
                .filter(movie -> movie.getRating() > 4.8 && movie.getDuration() < 90)
                .findAny();

        if (result.isPresent())
            System.out.println(result.get());
        else
            System.out.println("Not found");
    }

    public static Movie getDefault() {

        return new Movie(
                -1,
                "Default Movie",
                4,
                94,
                "Netflix"
        );
    }
}
