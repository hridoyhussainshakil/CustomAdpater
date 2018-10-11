package com.example.access_denaied.customadpater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.access_denaied.customadpater.adapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {

   private ListView list;
   private String[] booksnamei;
   private int[] image = {R.drawable.himu, R.drawable.himubia, R.drawable.hmjolase, R.drawable.hmurb,
                           R.drawable.hnljosna
                            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
        booksnamei = getResources().getStringArray(R.array.booksname);

        CustomAdapter adapter = new CustomAdapter(this,booksnamei,image);
        list.setAdapter(adapter);
    }
}
