package com.miamivineyard.sagrariogrullon.mvcc_volunteer_management_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class SocialMediaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        //need to link all image buttons and text views to go to their respective social media site - see Give Activity for example

        //Facebook


        TextView mFacebookLink = (TextView) findViewById(R.id.txtvwFacebook);
        if (mFacebookLink != null) {
            mFacebookLink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mTwitter = (TextView) findViewById(R.id.txtvwTwitter);
        if (mTwitter != null) {
            mTwitter.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mInstagram = (TextView) findViewById(R.id.txtvwInstagram);
        if (mInstagram != null) {
            mInstagram.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mVimeo = (TextView) findViewById(R.id.txtvwVimeo);
        if (mVimeo != null) {
            mVimeo.setMovementMethod(LinkMovementMethod.getInstance());
        }

        TextView mYoutube = (TextView) findViewById(R.id.txtvwYouTube);
        if (mYoutube != null) {
            mYoutube.setMovementMethod(LinkMovementMethod.getInstance());
        }


        findViewById(R.id.imgbtnFacebook).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/miamivineyard";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        findViewById(R.id.imgbtnTwitter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://twitter.com/miamivineyard";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        findViewById(R.id.imgbtnInstagram).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/miamivineyard/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        findViewById(R.id.imgbtnVimeo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://vimeo.com/miamivineyard";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        findViewById(R.id.imgbtnYouTube).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/user/miamivineyard";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }
}
