package com.gfg.shoutreview.service.request;

import com.gfg.shoutreview.model.Genre;
import com.gfg.shoutreview.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieRequest {

    private String title;

    private Genre genre;

    public Movie toMovie(){
        return Movie.builder()
                .title(title)
                .genre(genre)
                .rating(0.0)
                .build();
    }


}
