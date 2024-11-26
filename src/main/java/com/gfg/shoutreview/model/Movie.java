package com.gfg.shoutreview.model;

import com.gfg.shoutreview.service.response.MovieResponse;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "movie_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Movie implements Serializable {
    @Id
    @Column(nullable = false, name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private Double rating;

    @OneToMany(mappedBy = "movie")
    private List<Review> reviews;

    public MovieResponse toMovieResponse(){
        return MovieResponse.builder().
                genre(this.genre).
                title(this.title).
                rating(this.rating).
                reviews(Review.toReviewResponse(this.reviews)).build();
    }
}
