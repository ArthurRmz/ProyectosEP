package edu.itq.presentationtrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VoiceActivity extends AppCompatActivity {
    private Button mBtLaunchActivity;
    private Button btnNextImage;
    private Button btnPrevImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice);

        btnNextImage = (Button) findViewById(R.id.btnImageNext_voice);
        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });

        mBtLaunchActivity = (Button) findViewById(R.id.btnBack_Voice);
        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });

        mBtLaunchActivity = (Button) findViewById(R.id.btnBack_Voice);
        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
    }

    private void launchActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
