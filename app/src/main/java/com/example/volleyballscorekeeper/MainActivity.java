package com.example.volleyballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addScoreTeamA(View view){
        scoreA+=1;
        updateA(scoreA);
    }

    public void addScoreTeamB(View view){
        scoreB+=1;
        updateB(scoreB);
    }
    public void reset(View view){
        updateA(scoreA = 0);
        updateB(scoreB = 0);
    }
    public void updateA(int scoreA){
        TextView updateA = (TextView) findViewById(R.id.teamA_text_view);
        updateA.setText(""+scoreA);
    }
    public void updateB(int scoreB){
        TextView updateB = (TextView) findViewById(R.id.teamB_text_view);
        updateB.setText(""+scoreB);
    }
}