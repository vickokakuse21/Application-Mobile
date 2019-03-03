package com.example.screen;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;



public class Order extends AppCompatActivity
implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Spinner spinner = findViewById(R.id.label_spinner);
        if (spinner!=null){
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,
                R.array.labels_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner!=null){
            spinner.setAdapter(adapter);
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.sameday:
                if(checked)
                    displayToast("same day messenger service");
                break;
            case R.id.nextday:
                if (checked)
                    displayToast("next day ground delivery");
                break;
            case R.id.pickup:
                if (checked)
                    displayToast("pick up");
                break;
            default:
                break;
        }
    }
    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String sprinnerLabel = adapterView.getItemAtPosition(i).toString();
        displayToast(sprinnerLabel);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void navigation(View view) {
        startActivity(new Intent(Order.this,Navigasi.class));
        finish();
    }

    public void picker(View view) {
        startActivity(new Intent(Order.this,Picker.class));
        finish();
    }
}
