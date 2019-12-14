package com.example.bibin_c0769970;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class ValidationActivity extends AppCompatActivity {
    GridView gridView;
    public String someVariable;

    int[] imageIcons = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img8, R.drawable.img9};
    String[] numbers = {
            "img1", "img2", "img3",
            "img4", "img8", "img9",

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

                //ImageView imageView = (ImageView) view;
               // imageView.setImageResource(R.drawable.checked);


               // imageView.setBackgroundResource(R.drawable.iconAdapter.getItem(position));

                 Toast.makeText(ValidationActivity.this, "You clicked on " + iconAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
