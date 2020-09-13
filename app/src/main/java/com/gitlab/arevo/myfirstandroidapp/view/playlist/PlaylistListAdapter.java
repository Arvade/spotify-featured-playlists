package com.gitlab.arevo.myfirstandroidapp.view.playlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gitlab.arevo.myfirstandroidapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlaylistListAdapter extends BaseAdapter {

    Context context;

    private List<PlaylistItemData> data;
    private static LayoutInflater inflater = null;

    public PlaylistListAdapter(Context context, List<PlaylistItemData> data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return this.data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (vi == null) {
            vi = inflater.inflate(R.layout.playlist_list_item, null);
        }

        this.setImage(data.get(position).getImageUrl(), vi);
        this.setSongName(data.get(position).getSongName(), vi);

        return vi;
    }


    private void setImage(String url, View view) {
        if (url != null) {
            ImageView imageView = view.findViewById(R.id.imageView);
            Picasso.with(this.context).load(url).into(imageView);
        }
    }

    private void setSongName(String value, View view) {
        TextView header = view.findViewById(R.id.songName);
        header.setText(value);
    }

    public void setData(List<PlaylistItemData> data) {
        this.data = data;
        this.notifyDataSetChanged();
    }
}
