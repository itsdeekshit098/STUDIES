package com.example.button_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void name_of_function_to_be_performed(View view)
   {
       Toast toast;//creating an object of Toast class
       toast=Toast.makeText(this,"this is the tost mss",Toast.LENGTH_LONG);//assigning value to toast
       toast.setMargin(100,500);//this isnt working with a mssg showing that E/Toast: setMargin() shouldn't be called on text toasts, the values won't be used
       toast.show();
       //or else u can use below single line code
       /*
       Toast.makeText(this,"this is the tost mss",Toast.LENGTH_LONG).show();
        */
   }
}