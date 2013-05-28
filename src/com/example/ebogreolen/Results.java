package com.example.ebogreolen;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

public class Results extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		
		ArrayList<TableRow> rows = new ArrayList<TableRow>();
		TableLayout.LayoutParams rowLP = new TableLayout.LayoutParams(
				LinearLayout.LayoutParams.WRAP_CONTENT, 0);
		rowLP.weight = 1;
		for (int i = 0; i < 51; i++) {
			TableRow row = new TableRow(this);
			row.setId(i * 100);
			row.setLayoutParams(rowLP);
			rows.add(row);
		}

	}
}
