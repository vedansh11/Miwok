package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","apa"));
        words.add(new Word("mother","ata"));
        words.add(new Word("son","angsi"));
        words.add(new Word("daughter","tune"));
        words.add(new Word("old brother","taachi"));
        words.add(new Word("younger brother","chalitti"));
        words.add(new Word("older sister","tete"));
        words.add(new Word("younger sister", "kollete"));
        words.add(new Word("grand mother", "ama"));
        words.add(new Word("grand father", "apa"));

        WordAdapter Adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}