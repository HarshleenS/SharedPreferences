package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        et3=findViewById(R.id.editText3);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=et1.getText().toString();
                String address=et2.getText().toString();
                String number=et3.getText().toString();
                SharedPreferences sp=getSharedPreferences("myPref",MODE_PRIVATE);
                SharedPreferences.Editor ed=sp.edit();
                ed.putString("name",name);
                ed.putString("address",address);
                ed.putString("number",number);
                ed.commit();
                Toast.makeText(MainActivity.this, "Data stored successfully", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                finish();

            }
        });

    }
}
