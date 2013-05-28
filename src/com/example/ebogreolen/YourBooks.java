package com.example.ebogreolen;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;

public class YourBooks extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_books);
        final float scale = this.getResources().getDisplayMetrics().density;
        TableLayout bookTable = (TableLayout) findViewById(R.id.bookTable);
        ArrayList<TableRow> rows = new ArrayList<TableRow>();
        TableLayout.LayoutParams rowLP = new TableLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,0);
        rowLP.weight = 1;
        for (int i = 0; i < 3; i++) {
        	TableRow row = new TableRow(this);
        	row.setId(i*100);
        	row.setLayoutParams(rowLP);
        	rows.add(row);
        }
        
        
        int width = (int) (80 * scale + 0.5f);
        int margins = (int) (5 * scale + 0.5f);
        for (TableRow row : rows) {
	        for (int i = 0; i < 100; i++) {
	        	ImageView book = new ImageView(this);
	        	TableRow.LayoutParams lp = new TableRow.LayoutParams(width ,LayoutParams.MATCH_PARENT);
	            lp.setMargins(margins, 1, margins, 1);
	            book.setLayoutParams(lp);
	            book.setImageResource(R.drawable.testcover);
	            row.addView(book);
	        }
	        bookTable.addView(row);
        }

    }

}
