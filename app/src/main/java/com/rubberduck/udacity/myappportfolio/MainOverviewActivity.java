package com.rubberduck.udacity.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainOverviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_overview);

        setupButtonListeners(getApplicationContext());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_overview_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void setupButtonListeners(final Context context) {
        // setting up every button individually, as I will later
        // replace the Toast for each Button individually as well

        Button buttonSpotify = (Button) findViewById(R.id.buttonSpotify);
        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayText(context, "This button will launch my Spotify App");
            }
        });

        Button buttonScores = (Button) findViewById(R.id.buttonScores);
        buttonScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayText(context, "This button will launch my Scores App");
            }
        });

        Button buttonLibrary = (Button) findViewById(R.id.buttonLibrary);
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayText(context, "This button will launch my Library App");
            }
        });

        Button buttonBuiltBigger = (Button) findViewById(R.id.buttonBuildBigger);
        buttonBuiltBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayText(context, "This button will launch my Build It Bigger App");
            }
        });

        Button buttonReader = (Button) findViewById(R.id.buttonReader);
        buttonReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayText(context, "This button will launch my Reader App");
            }
        });

        Button buttonCapstone = (Button) findViewById(R.id.buttonCapstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayText(context, "This button will launch my Capstone App");
            }
        });

    }

    private void displayText(Context context, String textToDisplay) {
        Toast toast = Toast.makeText(context, textToDisplay, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

}
