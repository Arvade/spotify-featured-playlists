package com.gitlab.arevo.myfirstandroidapp.service.playlist;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.gitlab.arevo.myfirstandroidapp.dto.PlaylistsResponseDto;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class PlaylistService {

    private static final String PLAYLISTS_URL = "https://api.spotify.com/v1/playlists/%s";

    private final OkHttpClient client = new OkHttpClient();
    private final ObjectMapper objectMapper = objectMapper();

    public PlaylistsResponseDto getPlaylist(String id) {
        final Request playlistsRequest = this.createPlaylistRequest(id);

        try (Response response = this.client.newCall(playlistsRequest).execute()) {
            final String value = response.body().string();
            return this.objectMapper.readValue(value, PlaylistsResponseDto.class);
        } catch (IOException ex) {
            throw new RuntimeException("Could not complete request for playlists", ex);
        }
    }

    private Request createPlaylistRequest(final String id) {
        return new Request.Builder()
                .url(String.format(PLAYLISTS_URL, id))
                .header("Authorization", "Bearer BQDWDJMZx3iAX6NlvxsfMcNoloXWnrx2WrC8B4mpcluRM_on-oOi717Vy44NbJ2ZGTRxW1RGXn0wkB7SDAWXmbkGQq2x0_ReRIOunKIDinTofBA7yodny7-lAa6daLw6VpVoiOm2yejw")
                .build();
    }

    private ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }
}
