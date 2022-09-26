package com.example.charactersview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        ArrayList<String> characters = new ArrayList<>();
        CharactersAdapter adapter = new CharactersAdapter(characters);
        characters.add("Shinigami");
        characters.add("Cvinsi");
        characters.add("Jonin");
        characters.add("Spider-man");
        characters.add("Batman");
        characters.add("Itan");
        characters.add("Nemezis");
        characters.add("Tiran");
        characters.add("Gendolf");
        characters.add("Gibli");
        characters.add("Legolas") ;
        characters.add("Aragorn");
        characters.add("Harry Potter");
        characters.add("Germiona Greindjer");
        characters.add("Ron Yuzli");
        characters.add("Toretto");
        characters.add("Nova");
        characters.add("Djeki-Chan");
        characters.add("Black Panter");
        characters.add("Draks");
        recyclerView.setAdapter(adapter);

    }
}