package com.miamivineyard.sagrariogrullon.mvcc_volunteer_management_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
//import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        configureImageButtons();

    }

    private void configureImageButtons() {
        //podcasts
        ImageButton btnPodcasts = (ImageButton) findViewById(R.id.imgbtnPodcasts);
        btnPodcasts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //what happens when it clicks?
                //Toast.makeText(HomeActivity.this, "You're being redirected to the Podcasts Page", Toast.LENGTH_LONG).show();
                Intent podcast = new Intent(HomeActivity.this, PodcastsActivity.class);
                startActivity(podcast);
            }
        });

        //social media
        ImageButton btnSocial = (ImageButton) findViewById(R.id.imgbtnSocial);
        btnSocial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //what happens when it clicks?
                Intent social = new Intent(HomeActivity.this, SocialMediaActivity.class);
                startActivity(social);
            }
        });

        //give
        ImageButton btnGive = (ImageButton) findViewById(R.id.imgbtnGive);
        btnGive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //what happens when it clicks?
                Intent give = new Intent(HomeActivity.this, GiveActivity.class);
                startActivity(give);
            }
        });

        //prayer request
        ImageButton btnRequestAPrayer = (ImageButton) findViewById(R.id.imgbtnPrayerRequest);
        btnRequestAPrayer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //what happens when it clicks?
                Intent prayer = new Intent(HomeActivity.this, PrayerRequestActivity.class);
                startActivity(prayer);
            }
        });

        //Schedules
        ImageButton btnSchedules = (ImageButton) findViewById(R.id.imgbtnSchedule);
        btnSchedules.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //what happens when it clicks?
                Intent schedule = new Intent(HomeActivity.this, ScheduleActivity.class);
                startActivity(schedule);
            }
        });

        //Bulletin Board
        ImageButton btnBulletin = (ImageButton) findViewById(R.id.imgbtnBulletinBoard);
        btnBulletin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //what happens when it clicks?
                Intent bulletin = new Intent(HomeActivity.this, BulletinBoardActivity.class);
                startActivity(bulletin);
            }
        });

        //training resources
        ImageButton btnTraining = (ImageButton) findViewById(R.id.imgbtnTraining);
        btnTraining.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //what happens when it clicks?
                Intent training = new Intent(HomeActivity.this, TrainingResourcesActivity.class);
                startActivity(training);
            }
        });

        //devotionals linking code goes here
    }

}