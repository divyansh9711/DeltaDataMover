package com.example.divyanshsingh.deltadatamover;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String status = "";
    int order = 0;
    public Button mainButton = null ;
    public final String text = null;
    private final int md = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        status = "activity created";
        Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
        mainButton = (Button) findViewById(R.id.bookButton);



        final Spinner spinner = (Spinner) findViewById(R.id.mspin);
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.marr,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);




        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SecondaryActivity.class);
                final String text = spinner.getSelectedItem().toString();
                i.putExtra("Id",text);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        status = "activity started";
        Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();

    }
    @Override
    protected  void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        status = "restoring instances";
        Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        status = "Activity resumed";
        Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        status= "Activity paused";
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        status = "saving instance";
        Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        status = "Activity stopped";
        Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        status = "activity destroyed";
        Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        status = " Activity Restarted";
        Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
    }

}

