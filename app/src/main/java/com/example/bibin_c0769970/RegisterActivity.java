package com.example.bibin_c0769970;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import  android.widget.Toast;
import android.view.Gravity;


import static android.widget.Toast.*;


public class RegisterActivity extends AppCompatActivity {


    EditText emailEditText;
     EditText nameEditText;
    EditText phoneEditText;
    Context context;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameEditText = (EditText) findViewById(R.id.name);
        emailEditText = (EditText) findViewById(R.id.email);
        phoneEditText = (EditText) findViewById(R.id.phone);

        findViewById(R.id.button).setOnClickListener(new OnClickListener()   {

            @Override
            public void onClick(View arg0) {

                final String name = emailEditText.getText().toString();

                if (emailEditText.getText().toString().isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "You clicked on " , Toast.LENGTH_SHORT).show();
                }
                final String email = emailEditText.getText().toString();

                    if (email == "") {
                    Toast t = makeText(getApplicationContext(),
                            "This a positioned toast message",
                            LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 0);
                    t.show();
                }

                    else {

                        Intent activity3Intent = new Intent(getApplicationContext(), ValidationActivity.class);
                        startActivity(activity3Intent);


                    }

            }
        });




    }
}
