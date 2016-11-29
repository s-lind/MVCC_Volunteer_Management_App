package com.miamivineyard.sagrariogrullon.mvcc_volunteer_management_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcasts);


        // need to link image buttons and textviews to urls  - see Give Activity for example
        //Web Podcasts
        TextView mWebPodcasts = (TextView) findViewById(R.id.txtvwWebPodcast);
        if (mWebPodcasts != null) {
            mWebPodcasts.setMovementMethod(LinkMovementMethod.getInstance());
        }


        findViewById(R.id.imgbtnWebPodcasts).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.miamivineyard.com/podcast";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        //Youtube Podcasts
        TextView mYouTubePodcasts = (TextView) findViewById(R.id.txtvwYouTubePodcasts);
        if (mYouTubePodcasts != null) {
            mYouTubePodcasts.setMovementMethod(LinkMovementMethod.getInstance());
        }

        findViewById(R.id.imgbtnYouTubePodcasts).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/playlist?list=PLfe5COtQEJzLSQJs0s2x92QOmvN9ck3KO";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}
