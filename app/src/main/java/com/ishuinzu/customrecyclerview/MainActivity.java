package com.ishuinzu.customrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerContacts;
    private ContactAdapter contactAdapter;
    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerContacts = findViewById(R.id.recyclerContacts);

        loadContacts();
    }

    private void loadContacts() {
        contactList = new ArrayList<>();

        //Adding Contacts in contactList
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));
        contactList.add(new Contact("Inzi Programmer", "12345678"));

        contactAdapter = new ContactAdapter(MainActivity.this, contactList);

        //Adding Layout To Recycler View
        recyclerContacts.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        //Setting Adapter
        recyclerContacts.setAdapter(contactAdapter);
    }
}