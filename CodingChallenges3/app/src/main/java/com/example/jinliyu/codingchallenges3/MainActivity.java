package com.example.jinliyu.codingchallenges3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // mMessageEditText = (EditText) findViewById(R.id.editText);
    }

    public void launchSecondActivity(View view) {
        Log.d(TAG, "Button clicked!");

        switch (view.getId()) {
            case R.id.button:

                Intent hIntent = new Intent(MainActivity.this, SecondActivity.class);
                hIntent.putExtra("whichtxt", "txt1");
                startActivity(hIntent);
                break;

            case R.id.button2:

                Intent iIntent = new Intent(MainActivity.this, SecondActivity.class);
                iIntent.putExtra("whichtxt", "txt2");
                startActivity(iIntent);
                break;

            case R.id.button3:
                Intent jIntent = new Intent(MainActivity.this, SecondActivity.class);
                jIntent.putExtra("whichtxt", "txt3");
                startActivity(jIntent);
                break;





        }

    }
}
