package com.example.helmikhairullah.modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class modul1_praktikum1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul1_praktikum1);

        Context context = getApplicationContext();
        Toast mahal_banget = Toast.makeText(context, " terlalu kemahalan, uang kamu gak akan cukup", Toast.LENGTH_LONG);
        Toast murah_banget = Toast.makeText(context, "ke sini aja, murah.. uang kamu cukup kok", Toast.LENGTH_LONG);

        TextView menumakanan = (TextView) findViewById(R.id.menu_nama);
        TextView menuporsi = (TextView) findViewById(R.id.menu_porsi);
        TextView menutotalharga = (TextView) findViewById(R.id.menu_jumlah);
        TextView menutempat = (TextView) findViewById(R.id.menu_tempat);

        Intent intent = getIntent();
        int xtotal = intent.getIntExtra("total_harga",0);
        String total = Integer.toString(xtotal);

        int xjumlah = intent.getIntExtra("jumlah", 0);
        String jumlah = Integer.toString(xjumlah);

        int xuang = intent.getIntExtra("uang", 0);
        String uang = intent.getStringExtra("menu");



        String xtempat = intent.getStringExtra("tempat");

        menumakanan.setText(uang);
        menuporsi.setText(total);
        menutotalharga.setText(jumlah);

        if(xuang >= xtotal ){
                murah_banget.show();
        }else{
            mahal_banget.show();
            //menutempat.setText(xtempat);
        }
    }
}
