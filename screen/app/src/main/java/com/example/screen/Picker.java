package com.example.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Picker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
    }

    public void setDate(View view) {
        PickerDialog pickerDialog = new PickerDialog();
        pickerDialog.show(getSupportFragmentManager(),"date_picker");
    }
}
