package com.gitlab.arevo.myfirstandroidapp.dto;

import java.util.List;

public class Playlists {
    private String href;
    private List<AlbumItem> items;
    private Integer limit;
    private Object next;
    private Object previous;
    private Integer offset;
    private Integer total;


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<AlbumItem> getItems() {
        return items;
    }

    public void setItems(List<AlbumItem> items) {
        this.items = items;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
