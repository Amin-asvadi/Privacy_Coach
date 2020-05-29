package org.secuso.privacyfriendlycircuittraining.activities;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.secuso.privacyfriendlycircuittraining.R;

public class BmiActivity extends AppCompatActivity {
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_bmi);
        linearLayout = findViewById(R.id.buttomfragment);
        TextView savebtn = findViewById(R.id.cardsave);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new BottomSheetDialogFragment().show(getSupportFragmentManager(),"Dialog");
                Toast.makeText(BmiActivity.this, "CLICKED", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
