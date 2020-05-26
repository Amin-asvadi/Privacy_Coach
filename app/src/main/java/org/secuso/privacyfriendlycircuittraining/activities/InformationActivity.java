package org.secuso.privacyfriendlycircuittraining.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.secuso.privacyfriendlycircuittraining.R;
import org.secuso.privacyfriendlycircuittraining.database.PFASQLiteHelper;
import org.secuso.privacyfriendlycircuittraining.models.InformationData;

public class InformationActivity extends AppCompatActivity {
    private EditText edage,edweght,edname,edfamily,edheight ;
   public String age,weght,name,family,height;
   private Button btnsave;
  private Context  context =this;
  private PFASQLiteHelper dbsql = new PFASQLiteHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        findidformelatout();
        getstring();
        btnlistener();
    }

    private void btnlistener() {
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
dbsql.InsertData(new InformationData(edname.getText().toString(),edfamily.getText().toString(),
        Integer.parseInt(edage.getText().toString()),
        Integer.parseInt(edweght.getText().toString()),Integer.parseInt(edheight.getText().toString())));

                Toast.makeText(getApplicationContext(), "اطلاعات ذخیره شد", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(InformationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void getstring() {
        age = edage.getText().toString();
        height = edheight.getText().toString();
        weght = edweght.getText().toString();
        name = edname.getText().toString();
        family = edfamily.getText().toString();
    }

    private void findidformelatout() {
        edage = findViewById(R.id.edtextage);
        edweght = findViewById(R.id.edtxtweght);
        edname = findViewById(R.id.edtextname);
        edfamily = findViewById(R.id.edtextfamily);
        edheight = findViewById(R.id.edheight);
        btnsave = findViewById(R.id.btn_info_save);

    }
}
