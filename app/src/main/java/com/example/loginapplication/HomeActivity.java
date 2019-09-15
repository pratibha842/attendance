package com.example.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button take_attendance,show_attendance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        take_attendance = (Button)findViewById(R.id.btn_takeattendance);
        show_attendance = (Button)findViewById(R.id.btn_showattendance);

        take_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentakeAttendance();
            }
        });

        show_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openshowAttendance();
            }
        });

    }
    public void opentakeAttendance(){
        Intent tattent = new Intent(this,RecordActivity.class);
        startActivity(tattent);
    }
    public void openshowAttendance(){
        Intent sattent = new Intent(this,DisplayActivity.class );
        startActivity(sattent);
    }

}
