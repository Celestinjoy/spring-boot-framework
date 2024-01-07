package com.celestin.movies.movie;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private MovieService service;

    public MovieController(MovieService service) {
        this.service = service;

    }

    @GetMapping("/api/v1/movies")
    public List<Movie> retrieveAllMovies(){
      return service.getAllMovies();
}

    @GetMapping("/api/v1/movies/{id}")
    public Movie getMovie(@PathVariable int id){
        return service.findById(id);
    }

    @PostMapping("/api/v1/movies")
    public void addReview(@RequestBody Review review){
        service.addNewreview(review);
    }


}
