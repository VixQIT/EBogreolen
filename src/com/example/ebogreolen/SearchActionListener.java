package com.example.ebogreolen;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class SearchActionListener extends Activity implements OnEditorActionListener {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search);

    EditText text1 = (EditText) findViewById(R.id.edittext);
    text1.setOnEditorActionListener(this);
  }

  @Override
  public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

    return false;
  }
}
