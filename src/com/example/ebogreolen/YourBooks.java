package com.example.ebogreolen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class YourBooks extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_books);
        final View rowOne = findViewById(R.id.tableRow1);
        rowOne.bringToFront();
    }

}
