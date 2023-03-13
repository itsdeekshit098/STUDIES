package com.example.my3;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fuction_on_click(View view)
    {
        Toast.makeText(this, "hello buddy", Toast.LENGTH_SHORT).show();
    }
}