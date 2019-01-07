package edu.itq.presentationtrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        btn1 = findViewById(R.id.buttonEmogiView);
        btn2 = findViewById(R.id.buttonStatus);
        btn3 = findViewById(R.id.buttonVoice);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivityImageEmogi();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivityStatus();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivityVoice();
            }
        });
    }

    private void launchActivityImageEmogi() {
        Intent intent = new Intent(this, animationsActivity.class);
        startActivity(intent);
    }
    private void launchActivityStatus() {
        Intent intent = new Intent(this, StatusActivity.class);
        startActivity(intent);
    }
    private void launchActivityVoice() {
        Intent intent = new Intent(this, VoiceActivity.class);
        startActivity(intent);
    }
}
