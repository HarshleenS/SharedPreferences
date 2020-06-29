package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.textView);
        SharedPreferences sp=getSharedPreferences("myPref",MODE_PRIVATE);
        String name=sp.getString("name","");
        String address=sp.getString("address","");
        String number=sp.getString("number","");
        tv.setText(name+"\n"+address+"\n"+number);
    }
}
