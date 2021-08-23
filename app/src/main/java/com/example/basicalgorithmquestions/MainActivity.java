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

        if (name.startsWith("J")){
            binding.backgroundImageView.setImageResource(R.drawable.jett);
            //sharedPreferences.edit().putInt(R.drawable.jett);
        }




    }

}