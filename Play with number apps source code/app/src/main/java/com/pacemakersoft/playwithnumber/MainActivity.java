package com.pacemakersoft.playwithnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText UserNoET;
    Button quessNoBtn;
    int userNumber,appNumber;

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //app random number 1-10
        Random rand = new Random();

         appNumber = rand.nextInt(10) + 1;

        UserNoET = findViewById(R.id.userET);
        quessNoBtn = findViewById(R.id.submitBtn);
        quessNoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String userStr = UserNoET.getText().toString().trim();
               //string to int
                int userNumber = Integer.parseInt(userStr);

                if(userNumber < appNumber)
                {
                    Toast.makeText(MainActivity.this, "Enter a Higher Number", Toast.LENGTH_SHORT).show();
                    UserNoET.setText("");
                    Random rand = new Random();

                    appNumber = rand.nextInt(10) + 1;

                }
                else if(userNumber>appNumber)
                {
                    Toast.makeText(MainActivity.this, "Enter a Lower Number", Toast.LENGTH_SHORT).show();
                    UserNoET.setText("");
                    Random rand = new Random();

                    appNumber = rand.nextInt(10) + 1;

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Congrates! Your Number in Correct.", Toast.LENGTH_SHORT).show();
                //edit text clear
                    UserNoET.setText("");
                    Random rand = new Random();

                    appNumber = rand.nextInt(10) + 1;

                }

            }


        });

    }
}
