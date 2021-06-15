package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter {

    private int mcolorId;

    public WordAdapter(Context context, ArrayList<word> word, int colorId) {
        super(context, 0, word);
        mcolorId=colorId;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        TextView miwokname = (TextView) listItemView.findViewById(R.id.main_text_View);
        TextView englisname = (TextView) listItemView.findViewById(R.id.Default_text_View);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.Image);

        word currentWord = (word) getItem(position);

        miwokname.setText(currentWord.getMmiwokname());
        englisname.setText(currentWord.getMenglishname());
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getMimage());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }

        int color= ContextCompat.getColor(getContext(),mcolorId);
        View textContainer=(View) listItemView.findViewById(R.id.text_translate);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
