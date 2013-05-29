package com.example.ebogreolen;

import java.util.ArrayList;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;
import android.view.View;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.LinearLayout;

public class Results extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);

		TableLayout table = (TableLayout) findViewById(R.id.bookResults);

		for (int i = 0; i < 10; i++) {

			TableRow row = new TableRow(this);
			row.setBackgroundResource(R.drawable.bookbox);
			ImageView img = new ImageView(this);
			TextView text = new TextView(this);
			img.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.WRAP_CONTENT));
			img.setImageResource(R.drawable.testcover);
			text.setText("testing");
			text.setTextColor(Color.parseColor("#000000"));
			row.addView(img);
			row.addView(text);

			table.addView(row, new TableLayout.LayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

		}
	}

}
