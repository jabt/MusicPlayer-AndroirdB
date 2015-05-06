package com.example.antoniobastidas.musicplayer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

        ListView listSongs;
        ImageTextAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> names = new ArrayList<String>();
        names.add("Elton");
        names.add("Carrie");
        ArrayList<Songs> songs = new ArrayList<Songs>();

        songs.add(new Songs("Imagine","Elton John","00:00",getResources().getDrawable(R.mipmap.imgalbum)));
        songs.add(new Songs("Tittle","Carrie","00:00",getResources().getDrawable(R.mipmap.imgalbum2)));



        listSongs = (ListView) findViewById(R.id.listSongs);
        adapter = new ImageTextAdapter(getApplicationContext(),R.layout.simple_list_item_1,songs);

        listSongs.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
