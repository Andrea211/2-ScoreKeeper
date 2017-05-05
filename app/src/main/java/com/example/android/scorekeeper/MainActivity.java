package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the american football score for 2 teams.
 */

public class MainActivity extends AppCompatActivity {

    int field_goalA = 0;
    int touchdownA = 0;
    int try_for_extra_point1A = 0;
    int try_for_extra_point2A = 0;
    int safetyA = 0;
    int teamAScore = 0;

    int field_goalB = 0;
    int touchdownB = 0;
    int try_for_extra_point1B = 0;
    int try_for_extra_point2B = 0;
    int safetyB = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase Field Goal for Team A by 3 points.
     */
    public void field_goalA(View v) {
        field_goalA = field_goalA + 1;
        teamAScore = teamAScore + 3;
        displayForTeamAScore(teamAScore);
        displayForTeamAFieldGoal(field_goalA);
    }

    /**
     * Displays the Field Goal for Team A.
     */
    public void displayForTeamAFieldGoal(int score) {
        TextView scoreView = (TextView) findViewById(field_goalA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Touchdown for Team A by 6 points.
     */
    public void touchdownA(View v) {
        touchdownA = touchdownA + 1;
        teamAScore = teamAScore + 6;
        displayForTeamAScore(teamAScore);
        displayForTeamATouchdown(touchdownA);
    }

    /**
     * Displays the Touchdown for Team A.
     */
    public void displayForTeamATouchdown(int score) {
        TextView scoreView = (TextView) findViewById(touchdownA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Try For Extra Point for Team A by 1 point.
     */
    public void try_for_extra_point1A(View v) {
        try_for_extra_point1A = try_for_extra_point1A + 1;
        teamAScore = teamAScore + 1;
        displayForTeamAScore(teamAScore);
        displayForTeamATryForExtraPoint1A(try_for_extra_point1A);
    }

    /**
     * Displays the Try For Extra Point for Team A.
     */
    public void displayForTeamATryForExtraPoint1A(int score) {
        TextView scoreView = (TextView) findViewById(try_for_extra_point1A);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Try For Extra Point for Team A by 2 points.
     */
    public void try_for_extra_point2A(View v) {
        try_for_extra_point2A = try_for_extra_point2A + 1;
        teamAScore = teamAScore + 2;
        displayForTeamAScore(teamAScore);
        displayForTeamATryForExtraPoint2A(try_for_extra_point2A);
    }

    /**
     * Displays the Try For Extra Point for Team A.
     */
    public void displayForTeamATryForExtraPoint2A(int score) {
        TextView scoreView = (TextView) findViewById(try_for_extra_point2A);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Safety for Team A by 2 points.
     */
    public void safetyA(View v) {
        safetyA = safetyA + 1;
        teamAScore = teamAScore + 2;
        displayForTeamAScore(teamAScore);
        displayForTeamASafety(safetyA);
    }

    /**
     * Displays the Safety for Team A.
     */
    public void displayForTeamASafety(int score) {
        TextView scoreView = (TextView) findViewById(safetyA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Team A.
     */
    public void displayForTeamAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Field Goal for Team B by 3 points.
     */
    public void field_goalB(View v) {
        field_goalB = field_goalB + 1;
        teamBScore = teamBScore + 3;
        displayForTeamBScore(teamBScore);
        displayForTeamBFieldGoal(field_goalB);
    }

    /**
     * Displays the Field Goal for Team B.
     */
    public void displayForTeamBFieldGoal(int score) {
        TextView scoreView = (TextView) findViewById(field_goalB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Touchdown for Team B by 6 points.
     */
    public void touchdownB(View v) {
        touchdownB = touchdownB + 1;
        teamBScore = teamBScore + 6;
        displayForTeamBScore(teamBScore);
        displayForTeamBTouchdown(touchdownB);
    }

    /**
     * Displays the Touchdown for Team B.
     */
    public void displayForTeamBTouchdown(int score) {
        TextView scoreView = (TextView) findViewById(touchdownB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Try For Extra Point for Team B by 1 point.
     */
    public void try_for_extra_point1B(View v) {
        try_for_extra_point1B = try_for_extra_point1B + 1;
        teamBScore = teamBScore + 1;
        displayForTeamBScore(teamBScore);
        displayForTeamBTryForExtraPoint1B(try_for_extra_point1B);
    }

    /**
     * Displays the Try For Extra Point for Team B.
     */
    public void displayForTeamBTryForExtraPoint1B(int score) {
        TextView scoreView = (TextView) findViewById(try_for_extra_point1B);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Try For Extra Point for Team B by 2 points.
     */
    public void try_for_extra_point2B(View v) {
        try_for_extra_point2B = try_for_extra_point2B + 1;
        teamBScore = teamBScore + 2;
        displayForTeamBScore(teamBScore);
        displayForTeamBTryForExtraPoint2B(try_for_extra_point2B);
    }

    /**
     * Displays the Try For Extra Point for Team B.
     */
    public void displayForTeamBTryForExtraPoint2B(int score) {
        TextView scoreView = (TextView) findViewById(try_for_extra_point2B);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Safety for Team B by 2 points.
     */
    public void safetyB(View v) {
        safetyB = safetyB + 1;
        teamBScore = teamBScore + 2;
        displayForTeamBScore(teamBScore);
        displayForTeamBSafety(safetyB);
    }

    /**
     * Displays the Safety for Team B.
     */
    public void displayForTeamBSafety(int score) {
        TextView scoreView = (TextView) findViewById(safetyB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Team B.
     */
    public void displayForTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        field_goalA = 0;
        touchdownA = 0;
        try_for_extra_point1A = 0;
        try_for_extra_point2A = 0;
        safetyA = 0;
        teamAScore = 0;
        field_goalB = 0;
        touchdownB = 0;
        try_for_extra_point1B = 0;
        try_for_extra_point2B = 0;
        safetyB = 0;
        teamBScore = 0;

        displayForTeamAFieldGoal(0);
        displayForTeamATouchdown(0);
        displayForTeamATryForExtraPoint1A(0);
        displayForTeamATryForExtraPoint2A(0);
        displayForTeamASafety(0);
        displayForTeamBFieldGoal(0);
        displayForTeamBTouchdown(0);
        displayForTeamBTryForExtraPoint1B(0);
        displayForTeamBTryForExtraPoint2B(0);
        displayForTeamBSafety(0);
        displayForTeamAScore(0);
        displayForTeamBScore(0);
    }
}