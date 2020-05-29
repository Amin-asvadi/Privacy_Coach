package org.secuso.privacyfriendlycircuittraining.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.secuso.privacyfriendlycircuittraining.R;
import org.secuso.privacyfriendlycircuittraining.database.PFASQLiteHelper;
import org.secuso.privacyfriendlycircuittraining.models.InformationData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView name ,age,weight,height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_all);
       // OnbindUi();

       // SetTxtUser();

    }

    /*private void SetTxtUser() {
        PFASQLiteHelper db = new PFASQLiteHelper(MainActivity.this);
        List<InformationData> users =db.ShowData();
      for (InformationData user:users){
          name.setText( user.getNAME() + " " + user.getFAMILY());
          age.setText(String.valueOf(user.getAGE()));
          weight.setText(String.valueOf(user.getWEIGHT()));
          height.setText(String.valueOf(user.getHEIGHT()));

      }

    }*/

   /* private void OnbindUi() {
        name = findViewById(R.id.txt_main_user_name);
        age =findViewById(R.id.txt_main_user_age);
        weight =findViewById(R.id.txt_main_user_weight);
        height = findViewById(R.id.txt_main_user_height);


    }*/

    public void Go_To_SetWork(View view) {
        Intent intent =  new Intent(MainActivity.this,WorkSetActivity.class);
        startActivity(intent);
    }

    public void Go_To_Drink_Water(View view) {
        Intent intent =  new Intent(MainActivity.this,DrinkWater.class);
        startActivity(intent);
    }
}
