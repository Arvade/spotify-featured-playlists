package com.gitlab.arevo.myfirstandroidapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Track {

    private Album album;

    private List<Owner> artists;

    @JsonProperty("available_markets")
    private List<String> availableMarkets;

    @JsonProperty("disc_number")
    private Integer discNumber;

    @JsonProperty("duration_ms")
    private Integer durationMs;
    private Boolean episode;
    private Boolean explicit;
    @JsonProperty("external_ids")
    private Externalds externalIds;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    @JsonProperty("is_local")
    private Boolean isLocal;
    private String name;
    private Integer popularity;
    @JsonProperty("preview_url")
    private String previewUrl;
    private Boolean track;
    @JsonProperty("track_number")
    private Integer trackNumber;
    private TrackType type;
    private String uri;

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
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

    public Integer getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    public Integer getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    public Boolean getEpisode() {
        return episode;
    }

    public void setEpisode(Boolean episode) {
        this.episode = episode;
    }

    public Boolean getExplicit() {
        return explicit;
    }

    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    public Externalds getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(Externalds externalIds) {
        this.externalIds = externalIds;
    }

    public ExternalUrls getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(ExternalUrls external_urls) {
        this.external_urls = external_urls;
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

    public Boolean getLocal() {
        return isLocal;
    }

    public void setLocal(Boolean local) {
        isLocal = local;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Boolean getTrack() {
        return track;
    }

    public void setTrack(Boolean track) {
        this.track = track;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public TrackType getType() {
        return type;
    }

    public void setType(TrackType type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
