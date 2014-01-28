/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.example.reminders;

public final class R {
    public static final class array {
        public static final int availability=0x7f040008;
        /**  This maps reminder_methods_labels to internal constants. 
 Tentative 
         */
        public static final int availability_values=0x7f040009;
        /**  Strings for buttons in drop down menu 
         */
        public static final int buttons_list=0x7f040011;
        /**  The list of choices displayed in a dialog box when the user wants to
    respond to an invitation that repeats. 
         */
        public static final int change_response_labels=0x7f040010;
        public static final int delete_repeating_labels=0x7f04000d;
        public static final int delete_repeating_labels_no_selected=0x7f04000f;
        /**  DO NOT TRANSLATE These values need to correspond to the indices
         defined in DeleteEventHelper.java
         */
        public static final int delete_repeating_values=0x7f04000e;
        public static final int ordinal_labels=0x7f04000b;
        /**  Choices for the "Reminder minutes" spinner in the settings.
         These must be kept in sync with the preferences_default_reminder_values array.
         [CHAR LIMIT=12]
    
         */
        public static final int preferences_default_reminder_labels=0x7f040004;
        public static final int preferences_default_reminder_values=0x7f040005;
        /**  Experimental options for skipping reminders. [CHAR LIMIT = 37] 
         */
        public static final int preferences_skip_reminders_labels=0x7f040012;
        public static final int preferences_skip_reminders_values=0x7f040013;
        public static final int preferences_week_start_day_labels=0x7f040006;
        public static final int preferences_week_start_day_values=0x7f040007;
        /**  Recurrence picker: How events are to be repeated.  [CHAR LIMIT = 20] 
         */
        public static final int recurrence_freq=0x7f040014;
        /**  Choices for the "Reminder method" spinner.
         These must be kept in sync with the reminder_methods_values array.
         [CHAR LIMIT=10]
    
         */
        public static final int reminder_methods_labels=0x7f040000;
        /**  This maps reminder_methods_labels to internal constants. 
 METHOD_ALARM 
         */
        public static final int reminder_methods_values=0x7f040001;
        /**  Choices for the "Reminder minutes" spinner.
         These must be kept in sync with the reminder_minutes_values array.
         For consistency, the format should match what
         EventViewUtils.constructReminderLabel() generates.  (TODO: eliminate
         this and just generate the list from reminder_minutes_values?)
         [CHAR LIMIT=15]
    
         */
        public static final int reminder_minutes_labels=0x7f040002;
        public static final int reminder_minutes_values=0x7f040003;
        /**  Repeat a monthly event on the same nth day of every Friday. [CHAR LIMIT=30] 
         */
        public static final int repeat_by_nth_fri=0x7f04001a;
        /**  Repeat a monthly event on the same nth day of every Monday. [CHAR LIMIT=30] 
         */
        public static final int repeat_by_nth_mon=0x7f040016;
        /**  Repeat a monthly event on the same nth day of every Saturday. [CHAR LIMIT=30] 
         */
        public static final int repeat_by_nth_sat=0x7f04001b;
        /**  The following sets of strings describe a monthly recurring event, which will repeat
         on the Nth WEEKDAY of every month. For example, the 3rd Monday of every month, or
         the last Sunday. These are set up like this to resolve any gender-matching issues
         that were present in some languages.
     
 Repeat a monthly event on the same nth day of every Sunday. [CHAR LIMIT=30] 
         */
        public static final int repeat_by_nth_sun=0x7f040015;
        /**  Repeat a monthly event on the same nth day of every Thursday. [CHAR LIMIT=30] 
         */
        public static final int repeat_by_nth_thurs=0x7f040019;
        /**  Repeat a monthly event on the same nth day of every Tuesday. [CHAR LIMIT=30] 
         */
        public static final int repeat_by_nth_tues=0x7f040017;
        /**  Repeat a monthly event on the same nth day of every Wednesday. [CHAR LIMIT=30] 
         */
        public static final int repeat_by_nth_wed=0x7f040018;
        /**  Invitation responses 
         */
        public static final int response_labels1=0x7f04000c;
        public static final int visibility=0x7f04000a;
    }
    public static final class attr {
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Customize dimensions originally defined in res/values/dimens.xml (such as
         screen margins) for sw720dp devices (e.g. 10" tablets) in landscape here.
    
         */
        public static final int activity_horizontal_margin=0x7f050000;
        public static final int activity_vertical_margin=0x7f050001;
    }
    public static final class drawable {
        public static final int ic_launcher=0x7f020000;
        public static final int ic_menu_remove_field_holo_light=0x7f020001;
    }
    public static final class id {
        public static final int action_settings=0x7f090008;
        public static final int reminder_add=0x7f090003;
        public static final int reminder_items_container=0x7f090002;
        public static final int reminder_method_value=0x7f090006;
        public static final int reminder_minutes_value=0x7f090005;
        public static final int reminder_remove=0x7f090007;
        public static final int reminders_group_label=0x7f090001;
        public static final int reminders_row=0x7f090000;
        public static final int start=0x7f090004;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
        public static final int edit_reminder_item=0x7f030001;
    }
    public static final class menu {
        public static final int main=0x7f080000;
    }
    public static final class string {
        /**  Add a reminder to an event [CHAR LIMIT = NONE]
         */
        public static final int accessibility_add_reminder=0x7f060006;
        /**  Set the time for the reminder[CHAR LIMIT = NONE]
         */
        public static final int accessibility_reminder_time=0x7f060007;
        /**  Set the type of the reminder (popup/email/sms)[CHAR LIMIT = NONE]
         */
        public static final int accessibility_reminder_type=0x7f060008;
        /**  Remove a reminder from an event [CHAR LIMIT = NONE]
         */
        public static final int accessibility_remove_reminder=0x7f060009;
        public static final int action_settings=0x7f060001;
        public static final int app_name=0x7f060000;
        public static final int event_info_reminders_label=0x7f060003;
        public static final int hello_world=0x7f060002;
        /**  Label for the list of reminders for an event [CHAR LIMIT=20] 
         */
        public static final int reminders_label=0x7f060004;
        public static final int start=0x7f060005;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f070000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f070001;
        public static final int MinusButton=0x7f070007;
        public static final int TextAppearance=0x7f070002;
        public static final int TextAppearance_EditEvent=0x7f070005;
        /**  These are taken from the styles.xml (Calendar project) 
         */
        public static final int TextAppearance_EditEvent_LabelSmall=0x7f070003;
        public static final int TextAppearance_EditEvent_Small=0x7f070004;
        public static final int TextAppearance_EditEvent_Value=0x7f070006;
    }
}
