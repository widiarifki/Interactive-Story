package com.widiarifki.interactivestory.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.widiarifki.interactivestory.R;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        // bcause he activity is called from intent, so lets run teh activity by call function getIntent()
        Intent intent = getIntent();

        // getting data (name) from the intent using method getStringExtra() >> returns String
        // the name of the key is got from string resources
        String name = intent.getStringExtra(getString(R.string.key_name));

        // avoid possible errors caused by null value
        if(name == null) name = "Friend";
    }

}
