package com.example.pc.djsona;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

// My Imports
import android.view.View;
import android.media.MediaPlayer;

public class MainActivity extends Activity {

    private MediaPlayer player1, player2, player3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = MediaPlayer.create(this, R.raw.ethereal);
        player2 = MediaPlayer.create(this, R.raw.kinetic);
        player3 = MediaPlayer.create(this, R.raw.concussive);
    }

    public void playEthereal(View view)
    {
        if (player1.isPlaying())
            player1.pause();
        else
            player1.start();
    }

    public void playKinetic(View view)
    {
        if (player2.isPlaying())
            player2.pause();
        else
            player2.start();
    }

    public void playConcussive(View view)
    {
        if (player3.isPlaying())
            player3.pause();
        else
            player3.start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        player1.release();
        player2.release();
        player3.release();
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
}
