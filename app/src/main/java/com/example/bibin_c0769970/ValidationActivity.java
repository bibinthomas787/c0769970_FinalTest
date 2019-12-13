package com.example.bibin_c0769970;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class ValidationActivity extends AppCompatActivity {
    GridView gridView;

    int[] imageIcons = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img8, R.drawable.img9};
    String[] numbers = {
            "one", "two", "three",
            "four", "five", "six",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
        gridView = findViewById(R.id.gridView);

        final ImageAdaptor iconAdapter = new ImageAdaptor(this, imageIcons, numbers);
        gridView.setAdapter(iconAdapter);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(ValidationActivity.this, "You clicked on " + iconAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
