package com.mobileapps.carregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText etCarModel;
    private EditText etCarYear;
    private EditText etCarColor;
    private EditText etTransmission;
    private EditText etNumberOfCylinders;
    private EditText etEngineType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCarModel=findViewById(R.id.etCarModel);
        etCarYear=findViewById(R.id.etYear);
        etCarColor=findViewById(R.id.etCarColor);
        etTransmission=findViewById(R.id.etCarTransmission);
        etNumberOfCylinders=findViewById(R.id.etNumberOfCylinders);
        etEngineType=findViewById(R.id.etEngineType);


    }
}
