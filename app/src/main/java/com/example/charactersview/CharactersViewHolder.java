package com.example.charactersview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharactersViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    public CharactersViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.characters_name);
    }
    public void bind(String character){
        textView.setText(character);
    }
}
