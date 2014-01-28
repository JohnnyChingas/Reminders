package com.example.reminders;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*
		ArrayList<String> mReminderMinuteLabels;
		Resources r = this.getResources();
		mReminderMinuteLabels = loadStringArray(r, R.array.reminder_minutes_labels);
		*/
		
		LinearLayout view = (LinearLayout) findViewById(R.id.reminder_items_container);
		LayoutInflater inflater = this.getLayoutInflater();
		LinearLayout reminderItem = (LinearLayout) inflater.inflate(R.layout.edit_reminder_item,null);
		view.addView(reminderItem);
		
		
        ImageButton reminderRemoveButton;
        reminderRemoveButton = (ImageButton) reminderItem.findViewById(R.id.reminder_remove);
        reminderRemoveButton.setOnClickListener(this);
        
        View remindAddButton = this.findViewById(R.id.reminder_add);
        remindAddButton.setOnClickListener(this);
		
	}
	
	public void onClick(View view){
		System.out.println(view.getId());
		switch(view.getId()){
		case(R.id.reminder_add):
			System.out.println("Add Reminder");
			addReminder();
		break;
		
		case(R.id.reminder_remove):
			System.out.println("Delete Reminder");
        		LinearLayout reminderItem = (LinearLayout) view.getParent();
        		LinearLayout parent = (LinearLayout) reminderItem.getParent();
        		parent.removeView(reminderItem);
        		//mReminderViews.remove(reminderItem);
		break;
		}
		
	}
	
	private void addReminder(){
		
		LinearLayout mView = (LinearLayout) findViewById(R.id.reminder_items_container);
		LayoutInflater inflater = this.getLayoutInflater();
		LinearLayout reminderItem = (LinearLayout) inflater.inflate(R.layout.edit_reminder_item,null);
		mView.addView(reminderItem);
		
		ImageButton reminderRemoveButton;
        reminderRemoveButton = (ImageButton) reminderItem.findViewById(R.id.reminder_remove);
        reminderRemoveButton.setOnClickListener(this);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
    private static ArrayList<String> loadStringArray(Resources r, int resNum) {
        String[] labels = r.getStringArray(resNum);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(labels));
        return list;
    }
    
    private static void setReminderSpinnerLabels(Activity activity, Spinner spinner,
            ArrayList<String> labels) {
        Resources res = activity.getResources();
        spinner.setPrompt(res.getString(R.string.reminders_label));
        int resource = android.R.layout.simple_spinner_item;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(activity, resource, labels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    
    

}
