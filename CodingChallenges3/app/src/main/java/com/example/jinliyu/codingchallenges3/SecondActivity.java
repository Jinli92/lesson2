package com.example.jinliyu.codingchallenges3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
TextView tv;
TextView contentview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String dataReceived = getIntent().getExtras().getString("whichtxt");

        if(dataReceived.equals("txt1"))
        {
            tv = findViewById(R.id.article_heading);
            tv.setVisibility(View.VISIBLE);
            contentview = findViewById(R.id.article);
            contentview.setVisibility(View.VISIBLE);

        }
        if(dataReceived.equals("txt2"))
        {
            tv = findViewById(R.id.article_heading2);
            tv.setVisibility(View.VISIBLE);
            contentview = findViewById(R.id.article2);
            contentview.setVisibility(View.VISIBLE);

        }
        if(dataReceived.equals("txt3"))
        {
            tv = findViewById(R.id.article_heading3);
            tv.setVisibility(View.VISIBLE);
            contentview = findViewById(R.id.article3);
            contentview.setVisibility(View.VISIBLE);

        }
    }
}
