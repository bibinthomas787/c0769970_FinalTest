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

                if (emailEditText.getText().toString().isEmpty() || nameEditText.getText().toString().isEmpty() || phoneEditText.getText().toString().isEmpty() )
                {
                    Toast.makeText(RegisterActivity.this, "You Should fill All the fields! " , Toast.LENGTH_SHORT).show();
                }


                    else   {

                    EditText name1 = (EditText) findViewById(R.id.name);
                    EditText email1 = (EditText) findViewById(R.id.email);
                    EditText phone1 = (EditText) findViewById(R.id.phone);



                        Intent activity3Intent = new Intent(getApplicationContext(), ValidationActivity.class);
                        startActivity(activity3Intent);
                    activity3Intent.putExtra("name", name1.getText().toString());
                    activity3Intent.putExtra("email", email1.getText().toString());
                    activity3Intent.putExtra("phone", phone1.getText().toString());


                    }

            }
        });




    }
}
