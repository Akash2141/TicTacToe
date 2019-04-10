package com.example.akash.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int playerState = 0;
    private Button firstButton, secondButton, thirdButton, fourthButton, fifthButton, sixthButton, sevenButton, eightButton, nineButton;
    private int[] playerActions = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    ;
    private int player;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialisze();

    }

    public void initialisze() {
        firstButton = (Button) findViewById(R.id.firstButton);
        secondButton = (Button) findViewById(R.id.secondButton);
        thirdButton = (Button) findViewById(R.id.thirdButton);
        fourthButton = (Button) findViewById(R.id.fourthButton);
        fifthButton = (Button) findViewById(R.id.fifthButton);
        sixthButton = (Button) findViewById(R.id.sixthButton);
        sevenButton = (Button) findViewById(R.id.sevenButton);
        eightButton = (Button) findViewById(R.id.eightButton);
        nineButton = (Button) findViewById(R.id.nineButton);
        result = (TextView) findViewById(R.id.result);
    }

    public void firstButtonClick(View view) {

        if (playerState == 0) {
            playerState = 1;
            firstButton.setText(String.valueOf(0));
            playerActions[0] = 0;
        } else {
            playerState = 0;
            firstButton.setText(String.valueOf(1));
            playerActions[0] = 1;
        }
        CheckWinner();
    }

    public void secondButtonClick(View view) {

        if (playerState == 0) {
            secondButton.setText(String.valueOf(0));
            playerActions[1] = 0;
            playerState = 1;
        } else {
            secondButton.setText(String.valueOf(1));
            playerActions[1] = 1;
            playerState = 0;
        }
        CheckWinner();
    }

    public void thirdButtonClick(View view) {

        if (playerState == 0) {
            thirdButton.setText(String.valueOf(0));
            playerActions[2] = 0;
            playerState = 1;
        } else {
            thirdButton.setText(String.valueOf(1));
            playerActions[2] = 1;
            playerState = 0;
        }
        CheckWinner();
    }

    public void fourthButtonClick(View view) {

        if (playerState == 0) {
            fourthButton.setText(String.valueOf(0));
            playerActions[3] = 0;
            playerState = 1;
        } else {
            fourthButton.setText(String.valueOf(1));
            playerActions[3] = 1;
            playerState = 0;
        }
        CheckWinner();
    }

    public void fifthButtonClick(View view) {

        if (playerState == 0) {
            fifthButton.setText(String.valueOf(0));
            playerActions[4] = 0;
            playerState = 1;
        } else {
            fifthButton.setText(String.valueOf(1));
            playerActions[4] = 1;
            playerState = 0;
        }
        CheckWinner();
    }

    public void sixthButtonClick(View view) {

        if (playerState == 0) {
            sixthButton.setText(String.valueOf(0));
            playerActions[5] = 0;
            playerState = 1;
        } else {
            sixthButton.setText(String.valueOf(1));
            playerActions[5] = 1;
            playerState = 0;
        }
        CheckWinner();
    }

    public void seventhButtonClick(View view) {

        if (playerState == 0) {
            sevenButton.setText(String.valueOf(0));
            playerActions[6] = 0;
            playerState = 1;
        } else {
            sevenButton.setText(String.valueOf(1));
            playerActions[6] = 1;
            playerState = 0;
        }
        CheckWinner();
    }

    public void eigthButtonClick(View view) {

        if (playerState == 0) {
            eightButton.setText(String.valueOf(0));
            playerActions[7] = 0;
            playerState = 1;
        } else {
            eightButton.setText(String.valueOf(1));
            playerActions[7] = 1;
            playerState = 0;
        }
    }

    public void ninethButtonClick(View view) {

        if (playerState == 0) {
            nineButton.setText(String.valueOf(0));
            playerActions[8] = 0;
            playerState = 1;
        } else {
            nineButton.setText(String.valueOf(1));
            playerActions[8] = 1;
            playerState = 0;
        }
        CheckWinner();
    }

    public void disabledButton(){
        firstButton.setEnabled(false);
        secondButton.setEnabled(false);
        thirdButton.setEnabled(false);
        fourthButton.setEnabled(false);
        fifthButton.setEnabled(false);
        sixthButton.setEnabled(false);
        sevenButton.setEnabled(false);
        eightButton.setEnabled(false);
        nineButton.setEnabled(false);
    }
    public void enableButton(View view){
        for(int i=0;i<9;i++){
            playerActions[i]=2;
        }
        firstButton.setEnabled(true);
        secondButton.setEnabled(true);
        thirdButton.setEnabled(true);
        fourthButton.setEnabled(true);
        fifthButton.setEnabled(true);
        sixthButton.setEnabled(true);
        sevenButton.setEnabled(true);
        eightButton.setEnabled(true);
        nineButton.setEnabled(true);
        firstButton.setText("");
        secondButton.setText("");
        thirdButton.setText("");
        fourthButton.setText("");
        fifthButton.setText("");
        sixthButton.setText("");
        sevenButton.setText("");
        eightButton.setText("");
        nineButton.setText("");
        result.setText("");
    }
    public void PrintResult(int player) {
        if (player == 0) {
            result.setText("First player has won");
            disabledButton();
        } else {
            result.setText("Second Player has won");
            disabledButton();
        }
        this.player=2;
    }

    public void CheckWinner() {

        //First condition
        if (playerActions[0] != 2 && playerActions[0] == playerActions[1] && playerActions[0] == playerActions[2]) {
            player = playerActions[0];
            PrintResult(player);

        }
        //Second Condition
        else if (playerActions[0] != 2 && playerActions[0] == playerActions[3] && playerActions[0] == playerActions[6]) {
            player = playerActions[0];
            PrintResult(player);
        }
        //Third Condition
        else if (playerActions[0] != 2 && playerActions[0] == playerActions[4] && playerActions[0] == playerActions[8]) {
            player = playerActions[0];
            PrintResult(player);
        }
        //Fourth Condition
        else if (playerActions[1] != 2 && playerActions[1] == playerActions[4] && playerActions[1] == playerActions[7]) {
            player = playerActions[0];
            PrintResult(player);
        }
        //Fifth Condition
        else if (playerActions[2] != 2 && playerActions[2] == playerActions[5] && playerActions[2] == playerActions[8]) {
            player = playerActions[0];
            PrintResult(player);
        }
        //Sixth Condition
        else if (playerActions[2] != 2 && playerActions[2] == playerActions[4] && playerActions[2] == playerActions[6]) {
            player = playerActions[0];
            PrintResult(player);
        }
        //Seventh Condition
        else if (playerActions[3] != 2 && playerActions[3] == playerActions[4] && playerActions[3] == playerActions[5]) {
            player = playerActions[0];
            PrintResult(player);
        }
        //Eight condition
        else if (playerActions[6] != 2 && playerActions[6] == playerActions[7] && playerActions[6] == playerActions[8]) {
            player = playerActions[0];
            PrintResult(player);
        } else {
            int matchDrawn = 0;
            if (playerActions[0] != 2 && playerActions[1] != 2 && playerActions[2] != 2 && playerActions[3] != 2 && playerActions[4] != 2
                    && playerActions[5] != 2 && playerActions[6] != 2 && playerActions[7] != 2 && playerActions[8] != 2) {
                result.setText("Match Drawn");
            }
        }

    }
}
