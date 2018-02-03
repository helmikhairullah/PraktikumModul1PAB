package com.example.helmikhairullah.modul1;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class modul1 extends AppCompatActivity {

    private int uang = 65500;
    private int eatbus = 50000;
    private int abnormal = 30000;
    private int total_harga;
    private EditText xMenu;
    private EditText xJumlah;
    private Button xEatbus;
    private Button xAbnormal;
    //private String Log_TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul1);
        xMenu = (EditText) findViewById(R.id.textporsi);
        xJumlah = (EditText) findViewById(R.id.textnama);
        xEatbus = (Button) findViewById(R.id.eatbus1);
        xAbnormal = (Button) findViewById(R.id.abnormal1);
    }


    public void eatbus2(View view){
        //Log.d(Log_TAG, "Clicked");

        int jumlah = Integer.parseInt(xJumlah.getText().toString());
        String menu = xMenu.getText().toString();

        total_harga = jumlah * eatbus;
        Intent intent = new Intent(this,modul1_praktikum1.class);
        intent.putExtra("menu", menu);
        intent.putExtra("jumlah", jumlah);
        intent.putExtra("total_harga", total_harga);
        intent.putExtra("uang",uang);
        intent.putExtra("tempat", "eatbus");
        startActivity(intent);
    }

    public void abnormal2(View view){
        //Log.d(Log_TAG, "Clicked");

        int jumlah = Integer.parseInt(xJumlah.getText().toString());
        String menu = xMenu.getText().toString();

        total_harga = jumlah * abnormal;
        Intent intent = new Intent(this,modul1_praktikum1.class);
        intent.putExtra("menu", menu);
        intent.putExtra("jumlah", jumlah);
        intent.putExtra("total_harga", total_harga);
        intent.putExtra("uang",uang);
        intent.putExtra("tempat", "abnormal");
        startActivity(intent);
    }


    }


