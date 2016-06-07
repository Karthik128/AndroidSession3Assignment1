package com.assignment.hideimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image);
        button = (Button) findViewById(R.id.hide_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = button.getText().toString();

                if (text == "Hide") {
                    image.setVisibility(View.GONE);
                    button.setText("Show");
                } else {
                  image.setVisibility(View.VISIBLE);
                    button.setText("Hide");
                }
            }
        });
    }
}
