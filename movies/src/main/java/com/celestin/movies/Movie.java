package com.celestin.movies;

import java.util.List;

public class Movie {

    private Integer id;

    private Integer imdbID;
    private String title;

    private String releaseDate;

    private String trailerLink;
    private String poster;

    private List<String> genres;

    public Movie(Integer id, Integer imdbID, String title, String releaseDate, String trailerLink, String poster, List<String> genres) {
        this.id = id;
        this.imdbID = imdbID;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.genres = genres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImdbID() {
        return imdbID;
    }

    public void setImdbID(Integer imdbID) {
        this.imdbID = imdbID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", imdbID=" + imdbID +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", trailerLink='" + trailerLink + '\'' +
                ", poster='" + poster + '\'' +
                ", genres=" + genres +
                '}';
    }
}
