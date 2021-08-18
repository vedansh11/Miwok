package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull @org.jetbrains.annotations.NotNull Activity context, @NonNull @org.jetbrains.annotations.NotNull ArrayList<Word> words) {

        super(context, 0, words);
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public View getView(int position, @Nullable @org.jetbrains.annotations.Nullable View convertView, @NonNull @org.jetbrains.annotations.NotNull ViewGroup parent) {
       View listItemView = convertView;
       if(listItemView == null){
           listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
       }

       Word currentWord = getItem(position);
        TextView MiwokTextView = (TextView) listItemView.findViewById(R.id.textView);
        MiwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView DefaultTextView = (TextView) listItemView.findViewById(R.id.textView2);
        DefaultTextView.setText(currentWord.getmDefaultTranslation());
        return listItemView;
    }
}
