package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    /**********************************************************/
    /*                    Constants                           */
    /**********************************************************/
    private static final String TAG = "MainActivity";

    /**********************************************************/
    /*                    Local Data                          */
    /**********************************************************/
    Button spotifyButton;
    Button scoresButton;
    Button libraryButton;
    Button buildButton;
    Button xyzButton;
    Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyButton = (Button)findViewById(R.id.spotifyButton);
        spotifyButton.setOnClickListener(this);

        scoresButton = (Button)findViewById(R.id.scoresButton);
        scoresButton.setOnClickListener(this);

        libraryButton = (Button)findViewById(R.id.libraryButton);
        libraryButton.setOnClickListener(this);

        buildButton = (Button)findViewById(R.id.buildItBiggerButton);
        buildButton.setOnClickListener(this);

        xyzButton = (Button)findViewById(R.id.xyzButton);
        xyzButton.setOnClickListener(this);

        capstoneButton = (Button)findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        String toastString = "";

        switch (v.getId()) {
            case R.id.spotifyButton:
                toastString = getString(R.string.toast) + " Spotify Streamer App!";
                break;
            case R.id.scoresButton:
                toastString = getString(R.string.toast) + " Scores App!";
                break;
            case R.id.libraryButton:
                toastString = getString(R.string.toast) + " Library App!";
                break;
            case R.id.buildItBiggerButton:
                toastString = getString(R.string.toast) + " Build It Bigger App!";
                break;
            case R.id.xyzButton:
                toastString = getString(R.string.toast) + " XYZ App!";
                break;
            case R.id.capstoneButton:
                toastString = getString(R.string.toast) + " Capstone App!";
                break;
            default:
                return;
        }

        Toast toast = Toast.makeText(getApplicationContext(),
                toastString, Toast.LENGTH_SHORT);
        toast.show();
    }
}
