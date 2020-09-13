package com.gitlab.arevo.myfirstandroidapp.view.album

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gitlab.arevo.myfirstandroidapp.R
import com.gitlab.arevo.myfirstandroidapp.service.album.AlbumsService
import com.gitlab.arevo.myfirstandroidapp.service.album.RetrieveAlbumsTask
import java.util.*

class AlbumListFragment : Fragment() {

    lateinit var albumsService: AlbumsService;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_albums_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listView = view.findViewById<ListView>(R.id.albums_list);
        val adapter =
            AlbumListAdapter(
                this.getContext(),
                Collections.emptyList()
            )
        listView.adapter = adapter;

        listView.setOnItemClickListener { parent, view, position, id ->
            val bundle = Bundle()
            bundle.putString(
                "playlistId",
                (parent.adapter.getItem(position) as AlbumListItemData).id
            )
            findNavController().navigate(R.id.action_AlbumList_to_AlbumDetails, bundle)
        }

        albumsService = AlbumsService();
        RetrieveAlbumsTask(
            albumsService,
            adapter
        ).execute();
    }
}