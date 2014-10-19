package com.example.yourperfectbrew;


import com.example.yourperfectbrew.R;
import com.example.yourperfectbrew.R.id;
import com.example.yourperfectbrew.R.layout;
import com.example.yourperfectbrew.R.menu;

import BrewBackEnd.BrewParameters;
import BrewBackEnd.BrewType;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class QuantityActivity extends Activity {
	public final static String BREW_PARAMETERS = "com.example.perfectyourbrew.BREW";
	private BrewParameters brew;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent intent = getIntent();
		brew = intent.getParcelableExtra(BREW_PARAMETERS);
		
		setContentView(R.layout.activity_quantity);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quantity, menu);
		return true;
	}
	
	public void sendMessage(View view) {
	    Intent intent = new Intent(this, BrewActivity.class);
	    EditText editText = (EditText) findViewById(R.id.editText1);
	    
	    String message = editText.getText().toString();
	    brew.setAmountVolume(Double.parseDouble(message));
	    intent.putExtra(BREW_PARAMETERS, brew);
	    startActivity(intent);
	}
	
	//TODO - replace settings menu with side bar
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
