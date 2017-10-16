package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.button;
import static com.londonappbrewery.magiceightball.R.drawable.ball1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Askbutton;
                Askbutton = (Button) findViewById(R.id.Askbutton);


        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final int[] magicballarray ={R.drawable.ball1,
                                        R.drawable.ball2,
                                        R.drawable.ball3,
                                        R.drawable.ball4,
                                        R.drawable.ball5};
        Askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("magicball","Ze button is been pressed!");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                Log.d("magicball","the random number is" + number);

                ballDisplay.setImageResource(magicballarray[number]);
                number =randomNumberGenerator.nextInt(5);


            }
        });







    }
}
