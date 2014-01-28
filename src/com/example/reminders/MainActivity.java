package com.example.reminders;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends FragmentActivity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
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
			removeReminder(view);
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

	private void removeReminder(View view){
		LinearLayout reminderItem = (LinearLayout) view.getParent();
		LinearLayout parent = (LinearLayout) reminderItem.getParent();
		parent.removeView(reminderItem);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
    
    

