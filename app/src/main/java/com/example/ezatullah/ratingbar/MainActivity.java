package com.example.ezatullah.ratingbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button submitRateButton;
    TextView rateDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        submitRateButton = (Button) findViewById(R.id.ratingSubmitButton);
        rateDisplay = (TextView) findViewById(R.id.ratingDisplay);
        rateDisplay.setText("Rate:");

        submitRateButton.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                rateSubmit();
            }
        } );

    }

    public void rateSubmit() {
        String ratingValue = String.valueOf(ratingBar.getRating());
        rateDisplay.setText("Rate: " + ratingValue);
        Toast.makeText(getApplicationContext(), "Rate: " + ratingValue, Toast.LENGTH_LONG).show();
    }
}