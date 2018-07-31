package com.practice.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerview;
    private List<Song> SongList=new ArrayList<>();
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerviewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerview=findViewById(R.id.id_recyclerview);
      //  mRecyclerview.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(mLayoutManager);

       mAdapter= new RecyclerviewAdapter(SongList);
        mRecyclerview.setAdapter((RecyclerView.Adapter) mAdapter);
        prepareSongList();

    }

    private void prepareSongList() {

        SongList.add(new Song("He is a fucker", "RecyclerView Tutorial With Example In Android Studio. In"));
        SongList.add(new Song("all","It is a container used for displaying large amount of data sets that can be scrolled very efficiently by maintaining a limited number of views."));
        SongList.add(new Song("He is a fucker","tRecyclerView Tutorial With Example In Android Studio. In"));
        SongList.add(new Song("fuck","It is a container used for displaying large amount of data sets that can be scrolled very efficiently by maintaining a limited number of views."));
        SongList.add(new Song("He is a fucker","It is a container used for displaying large amount of data sets that can be scrolled very efficiently by maintaining a limited number of views."));
        SongList.add(new Song("All of you","For example, if your list shows music collection,"));
        SongList.add(new Song("Shit","For example, if your list shows music collection,"));
        SongList.add(new Song("Fuck","It is a container used for displaying large amount of data sets that can be scrolled very efficiently by maintaining a limited number of views."));
        SongList.add(new Song("This is shit","RecyclerView Tutorial With Example In Android Studio. In"));
        SongList.add(new Song("Fuck","For example, if your list shows music collection,"));
        SongList.add(new Song("He is a fucker","For example, if your list shows music collection,"));
        SongList.add(new Song("All fucker","For example, if your list shows music collection,"));
        SongList.add(new Song("Shit","For example, if your list shows music collection,"));
        SongList.add(new Song("Fuck it","For example, if your list shows music collection,"));
        SongList.add(new Song("Fuck","For example, if your list shows music collection,"));
        SongList.add(new Song("He is a fucker","For example, if your list shows music collection,"));
        SongList.add(new Song("All fucker","For example, if your list shows music collection,"));
        SongList.add(new Song("Shit","For example, if your list shows music collection,"));
        SongList.add(new Song("Fuck it","For example, if your list shows music collection,"));
        SongList.add(new Song("Fuck","For example, if your list shows music collection,"));
        SongList.add(new Song("He is a fucker","For example, if your list shows music collection,"));
        SongList.add(new Song("All fucker","For example, if your list shows music collection,"));
        SongList.add(new Song("Shit","For example, if your list shows music collection,"));
        SongList.add(new Song("Fuck it","For example, if your list shows music collection,"));
        SongList.add(new Song("Fuck","For example, if your list shows music collection,"));
        SongList.add(new Song("He is a fucker","For example, if your list shows music collection,"));
        SongList.add(new Song("All fucker","For example, if your list shows music collection,"));
        SongList.add(new Song("Shit","For example, if your list shows music collection,"));
        SongList.add(new Song("Fuck it","For example, if your list shows music collection,"));
        mAdapter.notifyDataSetChanged();
    }
}
