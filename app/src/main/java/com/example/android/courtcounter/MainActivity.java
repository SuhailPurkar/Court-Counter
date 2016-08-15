package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        displayForTeamA(0);
        displayForTeamB(0);
        displayReset("Reset");
        return true;

    }
    public void increment1A(View a) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
    public void increment2A (View b) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void increment3A (View c) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void increment1B(View a) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }
    public void increment2B(View b) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void increment3B(View c) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View score) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
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
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayReset(String reset) {
        TextView scoreView = (TextView) findViewById(R.id.reset);
        scoreView.setText(String.valueOf(reset));
    }


}
