package com.example.antoniobastidas.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AntonioBastidas on 06/05/15.
 */
public class ImageTextAdapter extends ArrayAdapter {

    private ArrayList<Songs> array;
    private Context context;


    public ImageTextAdapter(Context context, int resource, ArrayList<Songs> array) {
        super(context, resource, array);
        this.array = array;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.simple_list_item_1, parent, false);
        ViewHolder holder = new ViewHolder();

        holder.title= (TextView) rowView.findViewById(R.id.title);
        holder.artist = (TextView) rowView.findViewById(R.id.artist);
        holder.time = (TextView) rowView.findViewById(R.id.time);
        holder.imgalbum = (ImageView) rowView.findViewById(R.id.imgalbum);

        holder.title.setText(array.get(position).getName());
        holder.artist.setText(array.get(position).getArtista());
        holder.time.setText(array.get(position).getTime());
        holder.imgalbum.setImageDrawable(array.get(position).getAlbum());

        return rowView;
    }

    class ViewHolder{

        TextView title;
        TextView artist;
        TextView time;
        ImageView imgalbum;

    }
}

