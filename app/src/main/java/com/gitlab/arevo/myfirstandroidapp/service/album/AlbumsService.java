package com.gitlab.arevo.myfirstandroidapp.service.album;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gitlab.arevo.myfirstandroidapp.dto.AlbumsDto;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AlbumsService {

    private static final String FEATURED_PLAYLISTS_URL = "https://api.spotify.com/v1/browse/featured-playlists";

    private final OkHttpClient client = new OkHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    public AlbumsDto getFeaturedPlaylists() {
        final Request albumsRequest = this.createAlbumsRequest();

        try (Response response = this.client.newCall(albumsRequest).execute()) {
            final String value = response.body().string();
            return this.mapper.readValue(value, AlbumsDto.class);
        } catch (IOException ex) {
            throw new RuntimeException("Could not complete the request for albums", ex);
        }
    }

    private Request createAlbumsRequest() {
        return new Request.Builder()
                .url(FEATURED_PLAYLISTS_URL)
                .header("Authorization", "Bearer " + "BQDWDJMZx3iAX6NlvxsfMcNoloXWnrx2WrC8B4mpcluRM_on-oOi717Vy44NbJ2ZGTRxW1RGXn0wkB7SDAWXmbkGQq2x0_ReRIOunKIDinTofBA7yodny7-lAa6daLw6VpVoiOm2yejw")
                .build();
    }
}
