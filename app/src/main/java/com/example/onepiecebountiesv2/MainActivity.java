package com.example.onepiecebountiesv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Character> allCharacters = new ArrayList<>();
        PirateCrew mugiWara = new PirateCrew("Straw Hat Pirates");

        Character luffy = new Character("Monkey D. Luffy", 3000000000L, "luffy_wanted_manga_crop", mugiWara);
        Character zoro = new Character("Roronoa Zoro", 1111000000, "zoro.png", mugiWara);
        Character sanji = new Character("Vinsoke Sanji", 1032000000, "sanji.png",mugiWara );
        Character jimbe = new Character("Jimbe", 1100000000, "jimbe.png", mugiWara);
        Character robin = new Character("Nico Robin", 930000000, "robin.png", mugiWara);
        Character usopp = new Character("Usopp", 500000000, "usopp.png", mugiWara);
        Character franky = new Character("Franky", 394000000, "franky.png", mugiWara);
        Character brook = new Character("Brook", 383000000, "brook.png", mugiWara);
        Character nami = new Character("Nami", 366000000, "nami.png", mugiWara);
        Character chopper = new Character("Chopper", 1000, "chopper.png", mugiWara);

        for (Character c : mugiWara) {
            allCharacters.add(c);

        }
        TextView textLuffy = findViewById(R.id.textView);
        textLuffy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("allCharacters", allCharacters);
                startActivity(intent);
            }
        });



    }
}