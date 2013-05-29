package com.example.ebogreolen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SpecificBook extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_specific_book);
		
		TextView title = (TextView) findViewById(R.id.title);
		title.setTextSize(22);
		title.setTextColor(Color.parseColor("#585858"));
		title.setText("En magisk titel");
		
		TextView desc = (TextView) findViewById(R.id.description);
		desc.setTextSize(20);
		desc.setTextColor(Color.parseColor("#6E6E6E"));
		desc.setText("“This feels different than the last time—so carnal, so … necessary. He caresses my behind with his long-fingered hands, and I’m helpless, trussed up and pressed into the mattress, at his mercy, and of my own free will. He hits me again, slightly to the side, and again, the other side, then pauses slowly as he peels my panties down and pulls them off. He gently trails his palm across my behind again before continuing my spanking. I surrender myself to the rhythm of blows, absorbing each one, savoring each one … I moan loudly as my body takes over, and I come and come, convulsing around his fingers. I’m a sadist, Ana. I like to whip little brown-haired girls like you because you all look like the crack whore—my birth mother …” He runs a hand through his hair and almost smiles but instead sighs ruefully. ‘I’m talking about the heavy shit, Anastasia. You should see what I can do with a cane or a cat.");
		
		addListenerOnButton();
	}

	public void addListenerOnButton() {
	   	 
		Button button = (Button) findViewById(R.id.button1);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(SpecificBook.this, YourBooks.class);
				startActivity(intent);
 
			}
		}
		);
	
	}

}
