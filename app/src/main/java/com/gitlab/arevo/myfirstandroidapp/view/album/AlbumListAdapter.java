package com.gitlab.arevo.myfirstandroidapp.view.album;

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

public class AlbumListAdapter extends BaseAdapter {

    Context context;
    private List<AlbumListItemData> data;
    private static LayoutInflater inflater = null;

    public AlbumListAdapter(Context context,
                            List<AlbumListItemData> data) {
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
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (vi == null) {
            vi = inflater.inflate(R.layout.album_list_item, null);
        }

        this.setImage(data.get(position).getImageUrl(), vi);
        this.setTitle(data.get(position).getTitle(), vi);
        this.setDescription(data.get(position).getDescription(), vi);

        return vi;
    }

    private void setImage(String url, View view) {
        if (url != null) {
            ImageView imageView = view.findViewById(R.id.imageView);
            Picasso.with(this.context).load(url).into(imageView);
        }
    }

    private void setTitle(String value, View view) {
        TextView header = view.findViewById(R.id.header);
        header.setText(value);
    }

    private void setDescription(String value, View view) {
        TextView description = view.findViewById(R.id.description);
        description.setText(value);
    }

    public void setData(List<AlbumListItemData> data) {
        this.data = data;
        this.notifyDataSetChanged();
    }
}
