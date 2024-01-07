package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button rotate, link;
    private TextView hey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotate = findViewById(R.id.rotate);
        hey = findViewById(R.id.heyo);
        link = findViewById(R.id.button2);

        Animation rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate);

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hey.startAnimation(rotateAnim);
            }
        });

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/EuMmYKjQghs?si=NvWA_6royVMZnXVH"));
                startActivity(i);
            }
        });
    }

}