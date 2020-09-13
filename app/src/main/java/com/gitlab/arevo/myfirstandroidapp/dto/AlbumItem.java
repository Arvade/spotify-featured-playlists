package com.gitlab.arevo.myfirstandroidapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AlbumItem {
    private Boolean collaborative;
    private String description;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private List<AlbumImage> images;

    @JsonProperty("public")
    private Object isPublic;

    private String name;
    private Object owner;
    @JsonProperty("primary_color")
    private Object primaryColor;
    private String snapshot_id;
    private AlbumTracks tracks;
    private String type;
    private String uri;

    public Object getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(Object primaryColor) {
        this.primaryColor = primaryColor;
    }

    public Boolean getCollaborative() {
        return collaborative;
    }

    public void setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Object getOwner() {
        return owner;
    }

    public void setOwner(Object owner) {
        this.owner = owner;
    }

    public String getSnapshot_id() {
        return snapshot_id;
    }

    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    public AlbumTracks getTracks() {
        return tracks;
    }

    public void setTracks(AlbumTracks tracks) {
        this.tracks = tracks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
