package com.example.p.jumptime;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Game extends AppCompatActivity {

    private DatabaseReference myRef;

    ListView ListUserTask;

    public Game() {
    }

    @Nullable

    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game, container, false);

        ListUserTask = (ListView) findViewById(R.id.list_for_task);
        myRef =   FirebaseDatabase.getInstance().getReference();
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference ref = db.getReference("message"); // Key
        ref.setValue("This is a test message"); // Value
        return view;
    }
}