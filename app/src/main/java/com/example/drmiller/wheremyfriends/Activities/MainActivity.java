package com.example.drmiller.wheremyfriends.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.drmiller.wheremyfriends.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnListActivity;
    Button btnMapActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListActivity =  (Button)findViewById(R.id.buttonListActivity);
        btnListActivity.setOnClickListener(this);
        btnMapActivity =  (Button)findViewById(R.id.buttonMapActivity);
        btnMapActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = null;
        Toast.makeText(this.getApplicationContext(), Integer.toString(v.getId()), Toast.LENGTH_LONG);

        switch (v.getId())
        {
            case R.id.buttonListActivity:
                intent = new Intent(this, ContactListActivity.class);
                break;
            case R.id.buttonMapActivity:
                intent = new Intent(this, MapsActivity.class);
                break;
            default: return;
        }
        startActivity(intent);
    }
}
