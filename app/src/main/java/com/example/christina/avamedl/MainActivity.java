package com.example.christina.avamedl;

import android.os.Bundle;

import com.example.christina.avamedl.studyManagement.RSActivity;
import com.example.christina.avamedl.studyManagement.RSActivityManager;

public class MainActivity extends RSActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RSActivityManager.get().queueActivity(this, "notificationDate", true);
    }
}
