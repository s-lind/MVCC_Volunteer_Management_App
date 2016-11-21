package com.miamivineyard.sagrariogrullon.mvcc_volunteer_management_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
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

    }
}
