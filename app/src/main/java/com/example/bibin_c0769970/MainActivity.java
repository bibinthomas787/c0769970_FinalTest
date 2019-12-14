package com.example.bibin_c0769970;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button button;
    View view;
    ListView listData;
    String name;
    String email;
    String phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOne = findViewById(R.id.addUser);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activity2Intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(activity2Intent);

               // final UserData userData = new UserData(this, name, email,phone);
               // listData.setAdapter(userData);

            }
        });




    }




}
