package com.example.contactappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    Contact c1 = new Contact(1, "9426285563", "Anand");
    Contact c2 = new Contact(2, "9426285563", "Aryan");
    Contact c3 = new Contact(3, "9426285563", "Chinmay");
    Contact c4 = new Contact(4, "9426285563", "Chintan");
    Contact c5 = new Contact(5, "9426285563", "Chirag");
    Contact c6 = new Contact(6, "9426285563", "Deep");
    Contact c7 = new Contact(7, "9426285563", "Jay");
    Contact c8 = new Contact(8, "9426285563", "Jayesh");
    Contact c9 = new Contact(9, "9426285563", "Mayur");
    Contact c10 = new Contact(10, "9426285563", "Ria");
    Contact c11 = new Contact(11, "9426285563", "Rucha");

    Contact[] contacts = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CustomAdapter c = new CustomAdapter(contacts);
        recyclerView.setAdapter(c);

        //Add dividers
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}