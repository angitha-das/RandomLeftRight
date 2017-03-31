package com.example.angitha.randomleftright;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftOrright();
            }
        });
    }

        void leftOrright(){
                 if(random.nextBoolean()){
                     imageView.setImageResource(R.drawable.left);
                 }else{
                     imageView.setImageResource(R.drawable.right);
                 }
        }

}
