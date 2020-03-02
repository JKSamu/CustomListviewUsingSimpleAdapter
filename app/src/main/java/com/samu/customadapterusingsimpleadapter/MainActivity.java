package com.samu.customadapterusingsimpleadapter;

import android.os.Bundle;

import android.widget.ListView;
import android.widget.SimpleAdapter;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;
    String[] animalName = {"Cat","Dog","Elephant","Ziraph"};
    int[] animalImages = {R.drawable.cat,R.drawable.dog,R.drawable.elepant,R.drawable.zirap};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView =findViewById(R.id.listViewId2);

        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();

        for (int i = 0;i<animalName.length;i++){
            HashMap<String,String> hashMap = new HashMap<>();
            hashMap.put("name",animalName[i]);
            hashMap.put("image",animalImages[i] + "");
            arrayList.add(hashMap);
        }

            String[] from = {"name","image"};
            int[] to = {R.id.textViewId,R.id.imageViewId};


            SimpleAdapter simpleAdapter = new SimpleAdapter(this,arrayList,R.layout.secont_activity,from,to);
            simpleListView.setAdapter(simpleAdapter);

    }

}
