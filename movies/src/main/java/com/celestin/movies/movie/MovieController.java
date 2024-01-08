package com.celestin.movies.movie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    public ResponseEntity<Movie>addReview(@RequestBody Review review){
        Review savedReview = service.addNewreview(review);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedReview.getId())
                .toUri();
        return ResponseEntity.created(location).build();
        }






}
