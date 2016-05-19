package com.jorgechuc.android.geoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GeoActivity extends AppCompatActivity {

    Button mBotonCierto;
    Button mBotonFalso;
    Toast t1;
    Toast t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
         mBotonCierto = (Button) findViewById(R.id.boton_cierto);
         mBotonFalso = (Button) findViewById(R.id.boton_falso);

        mBotonCierto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.makeText(GeoActivity.this,R.string.texto_correcto, Toast.LENGTH_SHORT).show();
                t1.show();
            }
        });


        mBotonFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.makeText(GeoActivity.this,R.string.texto_incorrecto, Toast.LENGTH_SHORT).show();
                t2.show();
            }
        });
    }
}