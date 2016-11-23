package com.miamivineyard.sagrariogrullon.mvcc_volunteer_management_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
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

    }
}
