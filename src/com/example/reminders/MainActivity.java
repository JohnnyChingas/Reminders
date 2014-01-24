package com.example.reminders;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LinearLayout layout1 = (LinearLayout)findViewById(R.id.linearLayout1);
		
	    ArrayList<String> spinnerArray = new ArrayList<String>();
	    spinnerArray.add("one");
	    spinnerArray.add("two");
	    spinnerArray.add("three");
	    spinnerArray.add("four");
	    spinnerArray.add("five");

	    Spinner spinner = new Spinner(this);
	    ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spinnerArray);
	    spinner.setAdapter(spinnerArrayAdapter);

	    layout1.addView(spinner);
	    
	    Button btn = new Button(this);
	    btn.setText("Add");
	    
	    layout1.addView(btn);
	  
	    
	    //setContentView(layout);
	    
	

	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
