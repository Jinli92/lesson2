package com.example.jinliyu.codingchallenges4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button add;
    Button search;
    String item,item1,item2,item3,item4,item5,item6,item7;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        add = (Button)findViewById(R.id.ButtonAdd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(i,007);
            }
        });

        search = (Button)findViewById(R.id.buttonSearch);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        lv = (ListView) findViewById(R.id.ListView);
        item = data.getStringExtra("item1");
        item1 = data.getStringExtra("item2");
        item2 = data.getStringExtra("item3");
        item3 = data.getStringExtra("item4");
        item4 = data.getStringExtra("item5");
        item5 = data.getStringExtra("item6");
        item6 = data.getStringExtra("item7");
        item7 = data.getStringExtra("item8");
        String[] Items_list = new String[]{
                item, item1, item2, item3, item4, item5, item6, item7

        };

        final List<String> shopping_list = new ArrayList<String>();
        for (String item : Items_list) {
            if (item != null) {
                shopping_list.add(item);
            }
        }
        //final List<String> shopping_list = new ArrayList<String>(Arrays.asList(Items_list));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shopping_list);
        lv.setAdapter(arrayAdapter);
    }
}
