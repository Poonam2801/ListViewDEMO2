package com.example.poonamgupta2801.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        ListView myListViewObject =(ListView)findViewById ( R.id.listView );

        final ArrayList<String> myFriends= new ArrayList<String> (  );

        myFriends.add ("Shikha"  );
        myFriends.add ("Simran"  );
        myFriends.add ("Drishti"  );
        myFriends.add ("Moni"  );
        myFriends.add ("Sheenal"  );
        myFriends.add ("Kritia"  );
        myFriends.add ("Ruchika"  );
        myFriends.add ("Apurva"  );
        myFriends.add ("Sneha"  );

       ArrayAdapter<String> arrayAdapterObj= new ArrayAdapter<String> ( this,android.R.layout.simple_list_item_1,myFriends );

       myListViewObject.setAdapter ( arrayAdapterObj );
       myListViewObject.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               myFriends.get ( position );
               Toast.makeText ( getApplicationContext (),"Hello " +myFriends.get ( position ),Toast.LENGTH_LONG).show ();
           }
       } );
    }
}
