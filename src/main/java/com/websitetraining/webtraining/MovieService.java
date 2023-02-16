package com.websitetraining.webtraining;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    // writing the db access method
    @Autowired // will let the framework know to instantiate this variable for us
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){ // Optional : because maybe the movie does not exist, must allow to return a Null/None
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
