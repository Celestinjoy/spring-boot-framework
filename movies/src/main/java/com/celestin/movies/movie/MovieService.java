package com.celestin.movies.movie;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

@Component
public class MovieService {

    private static List<Movie> movies = new ArrayList<>();
    static {
        movies.add(new Movie(1, 10, "neru", "2023", "http://neru.com", "www.neru.com", "court room drama",""));
        movies.add(new Movie(2, 20, "kannur squad", "2023", "http://ks.com", "www.ks.com", "crime action", ""));
        movies.add(new Movie(3, 30, "kadhal", "2023", "http://kadhal.com", "www.kadhal.com", "family drama",""));
    }
    public List<Movie> getAllMovies() {
        return movies;
        }

    public Movie findById(int id) {
        Predicate<?super Movie> predicate = movie -> movie.getImdbID().equals(id);
        return movies.stream().filter(predicate).findFirst().orElse(null);
    }

    public void addNewMovie(Movie movie) {
        movies.add(movie);
    }

    public void deleteOne(int id) {
        Predicate<? super Movie> predicate = movie -> movie.getImdbID().equals(id);
        movies.removeIf(predicate);
    }

    public Review addNewreview(Review review) {
        Movie movie = findById(review.getId());
        deleteOne(review.getId());
        movie.setReviews(review.getReview());
        movies.add(movie.getId(),movie);

        Comparator<Movie> idComparator = Comparator.comparingInt(Movie::getId);
        movies.sort(idComparator);

        return review;
    }



}
