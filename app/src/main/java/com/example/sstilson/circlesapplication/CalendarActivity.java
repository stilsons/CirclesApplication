package com.example.sstilson.circlesapplication;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.icu.util.Calendar;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sstilson.circlesapplication.R;

public class CalendarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        long startMillis = 0;
        long endMillis = 0;
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(2012, 6, 18, 13, 10, 10);
        startMillis = beginTime.getTimeInMillis();
        Calendar endTime = Calendar.getInstance();
        endTime.set(2012, 6, 18, 16, 10, 10);
        endMillis = endTime.getTimeInMillis();
        System.out.println("Date start :"+startMillis);
        System.out.println("Date start :"+endMillis);

        // Insert Event
        ContentResolver cr = getContentResolver();
        ContentValues values = new ContentValues();
        values.put(CalendarContract.Events.DTSTART, startMillis);
        values.put(CalendarContract.Events.DTEND, endMillis);
        values.put(CalendarContract.Events.TITLE, "Walk The Dog");
        values.put(CalendarContract.Events.DESCRIPTION, "My dog is bored, so we're going on a really long walk!");
        values.put(CalendarContract.Events.CALENDAR_ID, 1 );
        values.put(CalendarContract.Events.EVENT_TIMEZONE, "UTC");
        Uri uri = cr.insert(Uri.parse("content://com.android.calendar/events"), values);
    }
}
