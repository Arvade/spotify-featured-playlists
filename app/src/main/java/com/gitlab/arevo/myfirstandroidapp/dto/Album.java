package com.gitlab.arevo.myfirstandroidapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Album {

    @JsonProperty("album_type")
    private AlbumType albumType;
    private List<Owner> artists;

    @JsonProperty("available_markets")
    private List<String> availableMarkets;
    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;
    private String href;
    private String id;
    private List<AlbumImage> images;
    private String name;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("release_date_precision")
    private ReleaseDatePrecision releaseDatePrecision;

    @JsonProperty("total_tracks")
    private Integer totalTracks;
    private AlbumType type;
    private String uri;

    public AlbumType getAlbumType() {
        return albumType;
    }

    public void setAlbumType(AlbumType albumType) {
        this.albumType = albumType;
    }

    public List<Owner> getArtists() {
        return artists;
    }

    public void setArtists(List<Owner> artists) {
        this.artists = artists;
    }

    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<AlbumImage> getImages() {
        return images;
    }

    public void setImages(List<AlbumImage> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ReleaseDatePrecision getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    public void setReleaseDatePrecision(ReleaseDatePrecision releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
    }

    public Integer getTotalTracks() {
        return totalTracks;
    }

    public void setTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
    }

    public AlbumType getType() {
        return type;
    }

    public void setType(AlbumType type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
