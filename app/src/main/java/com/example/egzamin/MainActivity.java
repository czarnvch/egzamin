package com.example.egzamin;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public ListView list;
    public ArrayAdapter<String> adapter;


        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ArrayList<String> listL = new ArrayList<String>();
            list = (ListView) findViewById(R.id.listView);
            Button btn = findViewById(R.id.button);
            TextView tv = (TextView)findViewById(R.id.wpis);


            listL.add("Zakupy: chleb, masło, ser");
            listL.add("Do zrobienia: obiad, umyć podłogi");
            listL.add("Weekend: kino, spacer z psem");

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String txt = tv.getText().toString();
                    if (!txt.isEmpty()) {
                        listL.add(txt);
                        adapter.notifyDataSetChanged();
                    }
                }
            });


            adapter = new ArrayAdapter<String>(this, R.layout.row, listL);
            list.setAdapter(adapter);
        }


}