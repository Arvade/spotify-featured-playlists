package com.gitlab.arevo.myfirstandroidapp.view.playlist

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gitlab.arevo.myfirstandroidapp.R
import com.gitlab.arevo.myfirstandroidapp.service.playlist.PlaylistService
import com.gitlab.arevo.myfirstandroidapp.service.playlist.RetrievePlaylistTask
import java.util.*


class PlaylistDetailsFragment : Fragment() {

    lateinit var playlistsService: PlaylistService

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_album_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.goBackButton).setOnClickListener {
            findNavController().navigate(R.id.action_AlbumDetails_to_AlbumList)
        }

        val playlistId = arguments?.get("playlistId")

        val listView = view.findViewById<ListView>(R.id.playlist)
        val adapter =
            PlaylistListAdapter(
                this.context,
                Collections.emptyList()
            )
        listView.adapter = adapter

        playlistsService = PlaylistService()
        RetrievePlaylistTask(
            playlistsService,
            adapter
        ).execute(playlistId.toString())

        listView.setOnItemClickListener { parent, view, position, id ->
            val itemData: PlaylistItemData = (parent.adapter.getItem(position) as PlaylistItemData)

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(itemData.id)
            intent.putExtra(Intent.EXTRA_REFERRER, Uri.parse("android-app://com.spotify.music"));
            startActivity(intent);
        }
    }
}
