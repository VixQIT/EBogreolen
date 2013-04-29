package com.example.ebogreolen;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;

public class YourBooks extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_books);
        View rowOne = findViewById(R.id.tableRow1);
        rowOne.bringToFront();
    }
    
}
