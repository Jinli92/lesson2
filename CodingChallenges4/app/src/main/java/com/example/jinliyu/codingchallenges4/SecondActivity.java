package com.example.jinliyu.codingchallenges4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button item1, item2, item3, item4, item5, item6, item7, item8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        item1 = (Button) findViewById(R.id.buttonItem);
        item2 = (Button) findViewById(R.id.buttonItem2);
        item3 = (Button) findViewById(R.id.buttonItem3);
        item4 = (Button) findViewById(R.id.buttonItem4);
        item5 = (Button) findViewById(R.id.buttonItem5);
        item6 = (Button) findViewById(R.id.buttonItem6);
        item7 = (Button) findViewById(R.id.buttonItem7);
        item8 = (Button) findViewById(R.id.buttonItem8);

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = item1.getText().toString();
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.putExtra("item1", name1);
                setResult(RESULT_OK, i);
                finish();
            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = item2.getText().toString();
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.putExtra("item2", name1);
                setResult(RESULT_OK, i);
                finish();
            }
        });

        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = item3.getText().toString();
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.putExtra("item3", name1);
                setResult(RESULT_OK, i);
                finish();
            }
        });

        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = item4.getText().toString();
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.putExtra("item4", name1);
                setResult(RESULT_OK, i);
                finish();
            }
        });

        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = item5.getText().toString();
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.putExtra("item5", name1);
                setResult(RESULT_OK, i);
                finish();
            }
        });

        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = item6.getText().toString();
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.putExtra("item6", name1);
                setResult(RESULT_OK, i);
                finish();
            }
        });
        item7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = item7.getText().toString();
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.putExtra("item7", name1);
                setResult(RESULT_OK, i);
                finish();
            }
        });

        item8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = item8.getText().toString();
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.putExtra("item8", name1);
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
