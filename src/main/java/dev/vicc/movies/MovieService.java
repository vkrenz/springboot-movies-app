package dev.vicc.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepositoty movieRepositoty;

    public List<Movie> allMovies() {
        return movieRepositoty.findAll();
    }

    // public Optional<Movie> singleMovie(ObjectId id) {
    // return movieRepositoty.findById(id);
    // }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepositoty.findMovieByImdbId(imdbId);
    }
}
