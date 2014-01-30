package com.example.reminders;


import java.util.ArrayList;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends FragmentActivity implements OnClickListener{
	private final ArrayList<LinearLayout> mReminderViews = new ArrayList<LinearLayout>(0);
    public ArrayList<Integer> mReminderMinuteValues;
    public ArrayList<Integer> mReminderMethodValues;
    public ArrayList<ReminderEntry> mReminders;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LinearLayout view = (LinearLayout) findViewById(R.id.reminder_items_container);
		LayoutInflater inflater = this.getLayoutInflater();
		LinearLayout reminderItem = (LinearLayout) inflater.inflate(R.layout.edit_reminder_item,null);
		view.addView(reminderItem);
		mReminderViews.add(reminderItem);
		
        ImageButton reminderRemoveButton;
        reminderRemoveButton = (ImageButton) reminderItem.findViewById(R.id.reminder_remove);
        reminderRemoveButton.setOnClickListener(this);
        
        View remindAddButton = this.findViewById(R.id.reminder_add);
        remindAddButton.setOnClickListener(this);
        
        View startButton = this.findViewById(R.id.start);
        startButton.setOnClickListener(this);
        
        Resources r = this.getResources();
        mReminderMinuteValues = loadIntegerArray(r, R.array.reminder_minutes_values);
        mReminderMethodValues = loadIntegerArray(r, R.array.reminder_methods_values);
        
		
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
		
		case(R.id.start):
			System.out.println("Start");
			start();
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
        mReminderViews.add(reminderItem);
	}

	private void removeReminder(View view){
		LinearLayout reminderItem = (LinearLayout) view.getParent();
		LinearLayout parent = (LinearLayout) reminderItem.getParent();
		parent.removeView(reminderItem);
		mReminderViews.remove(reminderItem);
		
	}
	
	private void start(){
		System.out.println(mReminderViews.size());
		mReminders = reminderItemsToReminders(mReminderViews,mReminderMinuteValues,mReminderMethodValues);
		//System.out.println(mReminders);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public static ArrayList<ReminderEntry> reminderItemsToReminders(
            ArrayList<LinearLayout> reminderItems, ArrayList<Integer> reminderMinuteValues,
            ArrayList<Integer> reminderMethodValues) {
        int len = reminderItems.size();
        ArrayList<ReminderEntry> reminders = new ArrayList<ReminderEntry>(len);
        for (int index = 0; index < len; index++) {
            LinearLayout layout = reminderItems.get(index);
            Spinner minuteSpinner = (Spinner) layout.findViewById(R.id.reminder_minutes_value);
            Spinner methodSpinner = (Spinner) layout.findViewById(R.id.reminder_method_value);
            int minutes = reminderMinuteValues.get(minuteSpinner.getSelectedItemPosition());
            System.out.println(minutes);
            int method = reminderMethodValues.get(methodSpinner.getSelectedItemPosition());
            //System.out.println(method);
            reminders.add(ReminderEntry.valueOf(minutes, method));
        }
        return reminders;
    }
	
    private static ArrayList<Integer> loadIntegerArray(Resources r, int resNum) {
        int[] vals = r.getIntArray(resNum);
        int size = vals.length;
        ArrayList<Integer> list = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            list.add(vals[i]);
        }

        return list;
    }
}
    
    

