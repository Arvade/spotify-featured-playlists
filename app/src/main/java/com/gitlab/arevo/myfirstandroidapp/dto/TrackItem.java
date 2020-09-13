package com.gitlab.arevo.myfirstandroidapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class TrackItem {

    @JsonProperty("added_at")
    private LocalDate addedAt;
    @JsonProperty("added_by")
    private Owner addedBy;
    @JsonProperty("is_local")
    private Boolean isLocal;
    @JsonProperty("primary_color")
    private String primaryColor;
    private Track track;
    @JsonProperty("video_thumbnail")
    private VideoThumbnail videoThumbnail;

    public LocalDate getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(LocalDate addedAt) {
        this.addedAt = addedAt;
    }

    public Owner getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Owner addedBy) {
        this.addedBy = addedBy;
    }

    public Boolean getLocal() {
        return isLocal;
    }

    public void setLocal(Boolean local) {
        isLocal = local;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public VideoThumbnail getVideoThumbnail() {
        return videoThumbnail;
    }

    public void setVideoThumbnail(VideoThumbnail videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
    }
}
