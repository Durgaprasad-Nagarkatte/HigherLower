package com.dpcompany.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void checkGuess(View view){
        EditText guessedNumber = (EditText)findViewById(R.id.guessedNumber);
        String guessedNumberString = guessedNumber.getText().toString();
        int guessedNumberInt = Integer.parseInt(guessedNumberString);
        String message = "";
        if (guessedNumberInt > randomNumber){
            message = "Too High !!";
        }
        else if (guessedNumberInt > randomNumber){
            message = "Too Low !!";
        }
        else{
            message = "Correct, Well done !!";
            randomNumberGenerator();
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
        System.out.println(randomNumber);
    }

    public void randomNumberGenerator(){
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(11)+10;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(11)+10;

    }
}
