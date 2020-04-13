package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * Tag for log statements.
     */
    private static final String TAG = "IntentExample-";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button that triggers the intent to start SecondActivity.
        final Button fireExplicitIntentButton = findViewById(R.id.fire_explicit_intent_button);
        if (fireExplicitIntentButton != null) {
            // Set the listeners
            fireExplicitIntentButton.setOnClickListener(this);
        }
    }

    /**
     * Handles the mFireExplicitIntentButton click event.
     * It generates an explicit intent to start the SecondActivity.
     */
    private void handleFireExplicitIntentButtonClicked() {
        final Intent intent;
        intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fire_explicit_intent_button:
                handleFireExplicitIntentButtonClicked();
                break;
            default:
                Log.e(TAG, "onClick: View element not associated");
                break;
        }
    }
}
