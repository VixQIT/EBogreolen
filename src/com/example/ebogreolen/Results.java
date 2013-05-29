package com.example.ebogreolen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.LinearLayout;

public class Results extends Activity {
	private int rowID = 0;
	private TableLayout.LayoutParams rowLP = new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
	private LinearLayout.LayoutParams textLP = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
	private float scale = 0;
	private TableRow.LayoutParams imgLP = null;
	private TableRow.LayoutParams linLayoutLP = null;
	private TableLayout table = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		float scale = this.getResources().getDisplayMetrics().density;
		this.imgLP = new TableRow.LayoutParams(LayoutParams.MATCH_PARENT,(int) (120 * scale + 0.5f));
		this.linLayoutLP = new TableRow.LayoutParams((int) (260 * scale + 0.5f),(int) (110 * scale + 0.5f));
		this.table = (TableLayout) findViewById(R.id.bookResults);
		int five = this.dp(50);
		int ten = this.dp(10);
		//layoutparameters
		this.rowLP.setMargins(five, five, five, five);
		this.imgLP.setMargins(0, ten, 0, ten);
		this.imgLP.weight = 33;
		this.linLayoutLP.setMargins(0, this.dp(13), this.dp(1), five);
		this.linLayoutLP.weight = 66;
		for (int i = 0; i < 10; i++) {
			makeBlock();
		}
	}
	
	private void makeBlock(){
		TableRow row = new TableRow(this);
		row.setLayoutParams(this.rowLP);
		row.setId(this.rowID);
		row.setBackgroundResource(R.drawable.resultcorners);
		this.addListenerOnButton(row);
		this.rowID ++;
		ImageView img = new ImageView(this);
		img.setLayoutParams(imgLP);
		img.setImageResource(R.drawable.testcover);
		row.addView(img);
		LinearLayout linLayout = new LinearLayout(this);
		linLayout.setLayoutParams(linLayoutLP);
		linLayout.setOrientation(LinearLayout.VERTICAL);
		TextView title = new TextView(this);
		title.setLayoutParams(textLP);
		title.setTextColor(Integer.parseInt("545455", 16)+0xFF000000);
		title.setText("Englehaderen");
		linLayout.addView(title);
		TextView author = new TextView(this);
		author.setLayoutParams(textLP);
		author.setTextColor(Integer.parseInt("545455", 16)+0xFF000000);
		author.setText("by: Lisa Marklund");
		linLayout.addView(author);
		TextView format = new TextView(this);
		format.setLayoutParams(textLP);
		format.setTextColor(Integer.parseInt("545455", 16)+0xFF000000);
		format.setText("format: E-bog");
		linLayout.addView(format);
		TextView forlag = new TextView(this);
		forlag.setLayoutParams(textLP);
		forlag.setTextColor(Integer.parseInt("545455", 16)+0xFF000000);
		forlag.setText("publisher: Gyldendal");
		linLayout.addView(forlag);
		TextView year = new TextView(this);
		year.setLayoutParams(textLP);
		year.setTextColor(Integer.parseInt("545455", 16)+0xFF000000);
		year.setText("year: 2009");
		linLayout.addView(year);
		TextView ISBN = new TextView(this);
		ISBN.setLayoutParams(textLP);
		ISBN.setTextColor(Integer.parseInt("545455", 16)+0xFF000000);
		ISBN.setText("ISBN: 645-987264-372");
		linLayout.addView(ISBN);
		row.addView(linLayout);
		this.table.addView(row);
	}
	
	private int dp(int i){
		return (int) (i * scale + 0.5f);
	}
	
	public void addListenerOnButton(View view) { 
		view.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Results.this, YourBooks.class);
				startActivity(intent);
 
			}
		}
		);
	
	}
}
