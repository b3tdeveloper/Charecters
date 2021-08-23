package com.example.basicalgorithmquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.basicalgorithmquestions.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        sharedPreferences = this.getSharedPreferences("com.example.basicalgorithmquestions", Context.MODE_PRIVATE);
        String storedName = sharedPreferences.getString("storedName","Default Name");

        if (storedName == "Default Name"){
            binding.greetingsTextView.setText("Hello ");
        }else {
            binding.greetingsTextView.setText("Hello "+storedName);
        }


    }

    public void greet(View view){
        //1- Write a program that takes the name of the user and writes "Hello name".
        String name = binding.editTextPersonName.getText().toString();

        if(!name.matches("")){
            binding.greetingsTextView.setText("Hello "+ name);

            sharedPreferences.edit().putString("storedName",name).apply();

        }

        //TO DO
        //Create a class, take images regularly

        //TO DO
        //save image like shared preferences
        //sharedPreferences.edit().putInt(R.drawable.jett);

        //To DO
        //Take images random
        //For example, there are two characters in B letter, so you can take one of them.

        //To Do
        //Add hp score, damage score, etc.
        //Fight

        //To do
        //Add character details
        //For example, Jett can fly, jett can throw knives, etc.

        //To do
        //Add by gender
        //Example, if gender is female character can be sage or sky, else sova

        //To do
        //Add extra fragment, for each character
        //Add extra details for each character

        //to do
        //Find some easy way for do that

        if (name.startsWith("A")|| name.startsWith("a")){
          binding.backgroundImageView.setImageResource(R.drawable.astra);
          binding.characterDetail.setText("Astra, a valorant character");
        }else if (name.startsWith("B")|| name.startsWith("b")){
            binding.backgroundImageView.setImageResource(R.drawable.brimstone);
            binding.characterDetail.setText("Brimstone, a valorant character");
        }else if (name.startsWith("C")|| name.startsWith("c")){
            binding.backgroundImageView.setImageResource(R.drawable.cypher);
            binding.characterDetail.setText("Cypher, a valorant character");
        }else if (name.startsWith("D")|| name.startsWith("d")){
            binding.backgroundImageView.setImageResource(R.drawable.draven);
            binding.characterDetail.setText("Draven, a league of legends character");
        }else if (name.startsWith("E")|| name.startsWith("e")){
            binding.backgroundImageView.setImageResource(R.drawable.evelynn);
            binding.characterDetail.setText("Evelynn, a league of legends character");
        }else if (name.startsWith("F")|| name.startsWith("f")){
            binding.backgroundImageView.setImageResource(R.drawable.fiora);
            binding.characterDetail.setText("Fiora, a league of legends character");
        }else if (name.startsWith("G")|| name.startsWith("g")){
            binding.backgroundImageView.setImageResource(R.drawable.graves);
            binding.characterDetail.setText("Graves, a league of legends character");
        }else if (name.startsWith("H")|| name.startsWith("h")){
            binding.backgroundImageView.setImageResource(R.drawable.hecarim);
            binding.characterDetail.setText("Hecarim, a league of legends character");
        }else if (name.startsWith("I")|| name.startsWith("i")){
            binding.backgroundImageView.setImageResource(R.drawable.irelia);
            binding.characterDetail.setText("Irelia, a league of legends character");
        }else if (name.startsWith("J")|| name.startsWith("j")){
            binding.backgroundImageView.setImageResource(R.drawable.jett);
            binding.characterDetail.setText("Jett, a valorant character");
        }else if (name.startsWith("K")|| name.startsWith("k")){
            binding.backgroundImageView.setImageResource(R.drawable.killjoy);
            binding.characterDetail.setText("Killjoy, a valorant character");
        }else if (name.startsWith("L")|| name.startsWith("l")){
            binding.backgroundImageView.setImageResource(R.drawable.lissandra);
            binding.characterDetail.setText("Lee Sin, a league of legends character");
        }else if (name.startsWith("M")|| name.startsWith("m")){
            binding.backgroundImageView.setImageResource(R.drawable.maokai);
            binding.characterDetail.setText("Moakai, a league of legends character");
        }else if (name.startsWith("N")|| name.startsWith("n")){
            binding.backgroundImageView.setImageResource(R.drawable.nidalee);
            binding.characterDetail.setText("Nidalee, a league of legends character");
        }else if (name.startsWith("O")|| name.startsWith("o")){
            binding.backgroundImageView.setImageResource(R.drawable.omen);
            binding.characterDetail.setText("Omen, a valorant character");
        }else if (name.startsWith("P")|| name.startsWith("p")){
            binding.backgroundImageView.setImageResource(R.drawable.phoenix);
            binding.characterDetail.setText("Phoenix, a valorant character");
        }else if (name.startsWith("Q")|| name.startsWith("q")){
            binding.backgroundImageView.setImageResource(R.drawable.quinn);
            binding.characterDetail.setText("Quinn, a league of legends character");
        }else if (name.startsWith("R")|| name.startsWith("r")){
            binding.backgroundImageView.setImageResource(R.drawable.reyna);
            binding.characterDetail.setText("Reyna, a valorant character");
        }else if (name.startsWith("S")|| name.startsWith("s")){
            binding.backgroundImageView.setImageResource(R.drawable.sage);
            binding.characterDetail.setText("Sage, a valorant character");
        }else if (name.startsWith("T")|| name.startsWith("t")){
            binding.backgroundImageView.setImageResource(R.drawable.taric);
            binding.characterDetail.setText("Taric, a league of legends character");
        }else if (name.startsWith("U")|| name.startsWith("u")){
            binding.backgroundImageView.setImageResource(R.drawable.udyr);
            binding.characterDetail.setText("Udyr, a league of legends character");
        }else if (name.startsWith("V")|| name.startsWith("v")){
            binding.backgroundImageView.setImageResource(R.drawable.viper);
            binding.characterDetail.setText("Viper, a valorant character");
        }else if (name.startsWith("W")|| name.startsWith("w")){
            binding.backgroundImageView.setImageResource(R.drawable.warwick);
            binding.characterDetail.setText("Warwick, a league of legends character");
        }else if (name.startsWith("X")|| name.startsWith("x")){
            binding.backgroundImageView.setImageResource(R.drawable.xayah);
            binding.characterDetail.setText("Xayah, a league of legends character");
        }else if (name.startsWith("Y")|| name.startsWith("y")){
            binding.backgroundImageView.setImageResource(R.drawable.yoru);
            binding.characterDetail.setText("Yoru, a valorant character");
        }else if (name.startsWith("Z")|| name.startsWith("z")){
            binding.backgroundImageView.setImageResource(R.drawable.zilean);
            binding.characterDetail.setText("Zilean, a league of legends character");
        }




    }

}