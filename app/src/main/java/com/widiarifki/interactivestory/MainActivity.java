package com.widiarifki.interactivestory;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mName;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.nameEditText);
        mStartButton = (Button)findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                // lets call next activity
                startStory(name);
            }
        });
    }

    // lets create the startStory function to call next activity
    // type: void means it doesn't return anything
    private void startStory(String name){
        // call the story activity by create new object from an android class called Intent
        // 'this' here refer to 'this class (MainActivity)'
        Intent intent = new Intent(this, StoryActivity.class);
        // attach data to intent using method 'putExtra(var name, var value)'
        // use the key name from string resources by using getString()
        intent.putExtra(getString(R.string.key_name), name);
        // express the new intent by calling function 'startActivity'
        startActivity(intent);
    }
}
