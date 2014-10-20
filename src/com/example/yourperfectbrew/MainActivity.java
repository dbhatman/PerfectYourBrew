package com.example.yourperfectbrew;



import BrewBackEnd.BrewParameters;
import BrewBackEnd.BrewType;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
	public final static String BREW_PARAMETERS = "com.example.perfectyourbrew.BREW";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

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
    
    /** Called when the user clicks the French Press button */
    public void open_french_press(View view) {
        // Do something in response to button    	
    	Intent intent = new Intent(this, QuantityActivity.class);
    	BrewParameters brew = new BrewParameters(BrewType.FRENCH_PRESS);
    	brew.setRatio(16.0/1.0);
    	intent.putExtra(BREW_PARAMETERS,brew);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the Aeropress button */
    public void open_aeropress(View view) {
        // Do something in response to button
    }
    
    /** Called when the user clicks the Pour Over button */
    public void open_pour_over(View view) {
        // Do something in response to button
    }
    
    /** Called when the user clicks the Iced Coffee button */
    public void open_iced_coffee(View view) {
        // Do something in response to button
    }
}

