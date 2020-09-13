package com.gitlab.arevo.myfirstandroidapp.service.album;

import android.os.AsyncTask;

import com.gitlab.arevo.myfirstandroidapp.dto.AlbumImage;
import com.gitlab.arevo.myfirstandroidapp.dto.AlbumItem;
import com.gitlab.arevo.myfirstandroidapp.dto.AlbumsDto;
import com.gitlab.arevo.myfirstandroidapp.view.album.AlbumListAdapter;
import com.gitlab.arevo.myfirstandroidapp.view.album.AlbumListItemData;

import java.util.List;
import java.util.stream.Collectors;

public class RetrieveAlbumsTask extends AsyncTask<String, Void, AlbumsDto> {

    private final AlbumsService albumsService;
    private final AlbumListAdapter listAdapter;

    public RetrieveAlbumsTask(AlbumsService albumsService, AlbumListAdapter listAdapter) {
        this.albumsService = albumsService;
        this.listAdapter = listAdapter;
    }

    @Override
    protected AlbumsDto doInBackground(String... strings) {
        return this.albumsService.getFeaturedPlaylists();
    }

    @Override
    protected void onPostExecute(AlbumsDto albumsDto) {
        final List<AlbumListItemData> data = albumsDto.getPlaylists()
                .getItems().stream()
                .map(albumItem -> new AlbumListItemData(albumItem.getId(), albumItem.getName(), albumItem.getDescription(), getImageUrl(albumItem)))
                .collect(Collectors.toList());

        listAdapter.setData(data);
    }

    private String getImageUrl(AlbumItem item) {
        List<AlbumImage> images = item.getImages();
        if (images != null && images.size() >= 1) {
            return images.get(0).getUrl();
        }
        return null;
    }
}
