package com.example.reminders;

import java.io.Serializable;

public class ReminderEntry implements Comparable<ReminderEntry>, Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final int mMinutes;
    public final int mMethod;

    public static ReminderEntry valueOf(int minutes, int method) {
        return new ReminderEntry(minutes, method);
    }
    
    private ReminderEntry(int minutes, int method) {
        mMinutes = minutes;
        mMethod = method;
    }

	@Override
	public int compareTo(ReminderEntry arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
