package com.example.drmiller.wheremyfriends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import Model.Adapters.PeopleArrayAdapter;
import Model.Entities.People;

public class ContactListActivity extends AppCompatActivity {

    private ListViewCompat contactListView;
    private ArrayList<People> peoples;
    private ArrayAdapter<People> peopleArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        contactListView = (ListViewCompat)findViewById(R.id.contactListView);

        peopleArrayAdapter = new PeopleArrayAdapter(this, android.R.layout.simple_list_item_1);

        contactListView.setAdapter(peopleArrayAdapter);
        registerForContextMenu(contactListView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.people_list_menu, menu);
        menu.setHeaderTitle("Меню");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        super.onContextItemSelected(item);

        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();

        switch (item.getItemId())
        {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                DeletePeople(menuInfo.position);
                return true;
        }
        return false;
    }

    public void DeletePeople(int index)
    {
        peoples.remove(index);
        peopleArrayAdapter.notifyDataSetChanged();
    }
}
