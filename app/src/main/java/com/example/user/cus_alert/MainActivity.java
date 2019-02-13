package com.example.user.cus_alert;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView ironman;
    ImageView ironmanpic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ironman=findViewById(R.id.ironbtn);

    }

    public void press(View view) {
        LayoutInflater inflat=LayoutInflater.from(MainActivity.this);
        View cuslay=inflat.inflate(R.layout.one,null);
        ironmanpic=cuslay.findViewById(R.id.oneiron);
        ironman=cuslay.findViewById(R.id.ironbtn);
        AlertDialog.Builder AB=new AlertDialog.Builder(MainActivity.this);
        AB.setView(cuslay);
        final AlertDialog A=AB.create();
        A.show();
        ironmanpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ironmanpic.setBackgroundResource(R.drawable.irron);
              A.dismiss();
            }
        });

    }
}
