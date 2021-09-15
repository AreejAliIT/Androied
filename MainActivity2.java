package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.CharArrayWriter;

public class MainActivity2 extends AppCompatActivity {
    private String userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText editText = findViewById(R.id.editTextTextPersonName2);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput = editText.getText().toString();

                StringBuffer output = myFuncation(userInput);

                TextView txt = findViewById(R.id.textView);
                txt.setText(output);
                System.out.println(output);
            }
        });
    }

    private StringBuffer myFuncation(String phrase) {
        StringBuffer result= new StringBuffer();
        for (int i=0; i<phrase.length(); i++)
        {
            if (Character.isUpperCase(phrase.charAt(i)) && phrase.toString() != " ")
            {
                    char ch = (char) (((int) phrase.charAt(i) +
                            13 - 65) % 26 + 65);
                    result.append(ch);
            } else if (Character.toString(phrase.charAt(i)) != " ") {
                char ch = (char) (((int) phrase.charAt(i) +
                        13 - 97) % 26 + 97);
                result.append(ch);
            }
        }

        return result;
    }
}
//    Write a function that takes in a phrase, encodes it, then returns the encoded phrase
//
//        Each letter in the phrase needs to be moved 13 places back
//
//        If the letter moves back past 'a' it should continue at the end of the alphabet
//
//        Spaces should be ignored

//
