package com.miamivineyard.sagrariogrullon.mvcc_volunteer_management_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class GiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give);



        //link web giving


        TextView mLink = (TextView) findViewById(R.id.txtvwGiveOnline);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        findViewById(R.id.imageButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://e-giving.org/egivinglogin.asp?id=2387";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }
}
