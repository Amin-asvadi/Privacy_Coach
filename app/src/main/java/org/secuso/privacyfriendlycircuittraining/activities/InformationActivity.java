package org.secuso.privacyfriendlycircuittraining.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.secuso.privacyfriendlycircuittraining.R;

public class InformationActivity extends AppCompatActivity {
    private EditText edage,edweght,edname,edfamily ;
   public String age,weght,name,family;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        findidformelatout();

        age = edage.getText().toString();
        weght = edweght.getText().toString();
         name = edname.getText().toString();
         family = edfamily.getText().toString();
    }

    private void findidformelatout() {
        edage = findViewById(R.id.edtextage);
        edweght = findViewById(R.id.edtxtweght);
        edname = findViewById(R.id.edtextname);
        edfamily = findViewById(R.id.edtextfamily);
    }
}
