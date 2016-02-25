package com.example.drmiller.wheremyfriends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ContactListActivity extends AppCompatActivity {

    private ListViewCompat contactListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        contactListView = (ListViewCompat)findViewById(R.id.contactListView);

        ArrayList<String> contactItems = new ArrayList<String>();
        for (Integer i = 1; i < 10; i++)
        {
            contactItems.add("Контакт " + i.toString());
        }

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contactItems);
        contactListView.setAdapter(aa);
        registerForContextMenu(contactListView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(null, menu);
    }
}
