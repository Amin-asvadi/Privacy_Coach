package org.secuso.privacyfriendlycircuittraining.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.secuso.privacyfriendlycircuittraining.R;
import org.secuso.privacyfriendlycircuittraining.database.PFASQLiteHelper;
import org.secuso.privacyfriendlycircuittraining.models.WaterData;
import org.secuso.privacyfriendlycircuittraining.services.CalendarTool;

import java.util.Calendar;
import java.util.Date;

import params.com.stepprogressview.StepProgressView;

public class DrinkWater extends AppCompatActivity {
    private SharedPreferences sharedpref;
    private LinearLayout op50ml, op100ml, op150ml, op200ml, op250ml, opcustom;
    ImageView btnmenu;
    StepProgressView stepProgressView;
    FloatingActionButton fabadd, btnStats,btnNotific;
    Context context = this;
    PFASQLiteHelper DBSQL = new PFASQLiteHelper(context);
    String date,nowtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_water);
        getdateandtime();
        init();


        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBSQL.InsertWaterData(new WaterData(date,nowtime,2000));
            }
        });

    }

    private void getdateandtime() {
        Date currentTime = Calendar.getInstance().getTime();
       nowtime = String.valueOf(currentTime);
        CalendarTool calendarTool = new CalendarTool();
        date =calendarTool.getIranianYear()+"/"+calendarTool.getIranianMonth()+"/"+calendarTool.getIranianDay();

    }

    private void init() {
        op50ml = findViewById(R.id.op50ml);
        op100ml = findViewById(R.id.op100ml);
        op150ml = findViewById(R.id.op150ml);
        op200ml = findViewById(R.id.op200ml);
        op250ml = findViewById(R.id.op250ml);
        opcustom = findViewById(R.id.opCustom);
        btnmenu = findViewById(R.id.btnMenu);
        stepProgressView = findViewById(R.id.intakeProgress);
        fabadd = findViewById(R.id.fabAdd);
        btnStats = findViewById(R.id.btnStats);
        btnNotific = findViewById(R.id.btnNotific);
    }
}
