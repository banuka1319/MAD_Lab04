package com.example.lab04;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Default Toast
         */
        //------------------------ start ---------------------------------------------------------------------------

//        Context context = getApplicationContext();
//        CharSequence message = "Hello Toast";
//        int duration = Toast.LENGTH_LONG;
//
//
//        // (1) method
//        Toast toast = Toast.makeText(context,message,duration);
//        toast.show();
//
//        //set Gravity of toast
//        toast.setGravity(Gravity.TOP| Gravity.LEFT,0,0);
//
//        // (2) method
//        Toast.makeText(context,message,duration).show();

        //------------------------ End ---------------------------------------------------------------------------


        /**
         * Custom Toast code
         */
        //------------------------ start ---------------------------------------------------------------------------
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.custom_toast_container));

        TextView text = (TextView) layout.findViewById(R.id.textToast);
        text.setText("This is custom toast");

        Toast toastNew = new Toast(getApplicationContext());
        toastNew.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toastNew.setDuration(Toast.LENGTH_LONG);
        toastNew.setView(layout);
        toastNew.show();
        //------------------------ end ---------------------------------------------------------------------------



    }
}
