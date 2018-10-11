package com.example.access_denaied.customadpater.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.access_denaied.customadpater.MainActivity;
import com.example.access_denaied.customadpater.R;

public class CustomAdapter extends BaseAdapter {
    LayoutInflater inflater;
    int[] image;
    String[] booksname;
    Context context;




    public CustomAdapter(Context context, String[] booksname, int[] image) {
        this.image = image;
        this.context = context;
        this.booksname = booksname;
    }

    @Override
    public int getCount() {
        return booksname.length;
    }

    @Override
    public Object getItem(int i) {
        return booksname[i];
    }

    @Override
    public long getItemId(int i) {
        return i;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View convertview = view;
        if (convertview == null) {
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        }

        view = inflater.inflate(R.layout.sample , null );


        ImageView images = view.findViewById(R.id.imageid);
        TextView text = view.findViewById(R.id.text);

        images.setImageResource(image[i]);
        text.setText(booksname[i]);

        return view;
    }
}
