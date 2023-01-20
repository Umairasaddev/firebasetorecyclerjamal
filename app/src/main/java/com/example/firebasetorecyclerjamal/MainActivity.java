package com.example.firebasetorecyclerjamal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    RecyclerView recview;
    adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    recview = findViewById(R.id.recview);

    recview.setLayoutManager(new LinearLayoutManager(this));

//firebase ka pora data agya ha options main
        FirebaseRecyclerOptions<modal> options =
                new FirebaseRecyclerOptions.Builder<modal>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("notification"), modal.class)
                        .build();

    adapter = new adapter(options,getApplicationContext());//this will hit my adapter class empty constructor
    recview.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }


}


/*
package com.example.firebasetorecyclerjamal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    RecyclerView recview;
    myadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    recview = findViewById(R.id.recview);

    recview.setLayoutManager(new LinearLayoutManager(this));

//firebase ka pora data agya ha options main
        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Students"), model.class)
                        .build();

    adapter = new myadapter(options);//this will hit my adapter class empty constructor
    recview.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}
 */