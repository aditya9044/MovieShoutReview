package com.gfg.shoutreview.repository;

import com.gfg.shoutreview.model.Genre;
import com.gfg.shoutreview.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    public Movie findByTitle(String title);

    public List<Movie> findByGenre(Genre genre);
}
