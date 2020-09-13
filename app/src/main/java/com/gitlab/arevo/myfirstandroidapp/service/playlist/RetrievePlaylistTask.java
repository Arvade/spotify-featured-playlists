package com.gitlab.arevo.myfirstandroidapp.service.playlist;

import android.os.AsyncTask;

import com.gitlab.arevo.myfirstandroidapp.dto.PlaylistsResponseDto;
import com.gitlab.arevo.myfirstandroidapp.dto.TrackItem;
import com.gitlab.arevo.myfirstandroidapp.view.playlist.PlaylistItemData;
import com.gitlab.arevo.myfirstandroidapp.view.playlist.PlaylistListAdapter;

import java.util.List;
import java.util.stream.Collectors;

public class RetrievePlaylistTask extends AsyncTask<String, Void, PlaylistsResponseDto> {

    private final PlaylistService playlistService;
    private final PlaylistListAdapter adapter;

    public RetrievePlaylistTask(PlaylistService playlistService, PlaylistListAdapter adapter) {
        this.playlistService = playlistService;
        this.adapter = adapter;
    }

    @Override
    protected PlaylistsResponseDto doInBackground(String... strings) {
        return this.playlistService.getPlaylist(strings[0]);
    }

    @Override
    protected void onPostExecute(PlaylistsResponseDto playlistsResponseDto) {
        final List<PlaylistItemData> data = playlistsResponseDto.getTracks().getItems().stream()
                .map(trackItem -> new PlaylistItemData(trackItem.getTrack().getUri(), trackItem.getTrack().getName(), getImageUrl(trackItem)))
                .collect(Collectors.toList());

        adapter.setData(data);
    }

    private String getImageUrl(TrackItem item) {
        if (!item.getTrack().getAlbum().getImages().isEmpty()) {
            return item.getTrack().getAlbum().getImages().get(0).getUrl();
        }
        return null;
    }
}
