package com.example.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    private String mOrderMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_contact:
            Toast toastcontact = Toast.makeText(this,R.string.action_contact_message,Toast.LENGTH_SHORT);
            toastcontact.show();
            return true;
            case R.id.action_favorites:
            Toast toastfavorite = Toast.makeText(this,R.string.action_favorites_message,Toast.LENGTH_SHORT);
            toastfavorite.show();
            return true;
            case R.id.action_order:
            Toast toastorder = Toast.makeText(this,R.string.action_order_message,Toast.LENGTH_SHORT);
            toastorder.show();
            return true;
            case R.id.action_settings:
                Toast toastsetting = Toast.makeText(this,R.string.action_setting_message,Toast.LENGTH_SHORT);
                toastsetting.show();
                return true;
            default:

        }
        return super.onOptionsItemSelected(item);
    }


    public void image(View view) {
        Toast toast = Toast.makeText(this,"this is Camera",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void image1(View view) {
        Toast toast1 = Toast.makeText(this,"this is Compass",Toast.LENGTH_SHORT);
        toast1.show();
    }

    public void computer(View view) {
        Toast computer = Toast.makeText(this, "this is Computer", Toast.LENGTH_SHORT);
        computer.show();
    }

    public void pensil(View view) {
        Toast pencil = Toast.makeText(this,"this is Pencil", Toast.LENGTH_SHORT);
        pencil.show();
    }

    public void images(View view) {
        Toast images = Toast.makeText(this,"this is Image",Toast.LENGTH_SHORT);
        images.show();
    }

    public void think(View view) {
        Toast think = Toast.makeText(this,"this is Think",Toast.LENGTH_SHORT);
        think.show();
    }

    public void tablet(View view) {
        Toast tablet = Toast.makeText(this,"this is Tablet",Toast.LENGTH_SHORT);
        tablet.show();
    }

    public void creativity(View view) {
        Toast creativity = Toast.makeText(this, "this is Creativity",Toast.LENGTH_SHORT);
        creativity.show();
    }

    public void shoping(View view) {
        startActivity(new Intent(Menu.this,Order.class));
        finish();
    }
}
