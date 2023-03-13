package com.example.navigating_from_one_activity_to_other;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void funct(View view)
    {
        Intent i;
        i=new Intent(this,activityinsideoneactivityinsideother.class);//arguments saying that in current location(by this),open logic file NOTE:extension is .class not .java
        //here the syntax is different from that of toast one
        //here we are passing arguments to Intent(para1,para2) constructor in toast we are calling method makeTest(par1,para2,para3) by passing 3 arguments
        startActivity(i);//calling the with command startActivity()

    }
}