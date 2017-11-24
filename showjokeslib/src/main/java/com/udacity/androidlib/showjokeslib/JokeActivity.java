package com.udacity.androidlib.showjokeslib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by lsitec207.neto on 21/11/17.
 */

public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "joke-extra";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTextView = (TextView) findViewById(R.id.tv_joke);
        if (getIntent() != null)
            jokeTextView.setText(getIntent().getStringExtra(EXTRA_JOKE));
    }
}
