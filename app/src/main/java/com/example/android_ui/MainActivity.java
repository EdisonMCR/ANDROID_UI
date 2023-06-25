package com.example.android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guardar (View view) {
        EditText name1 = (EditText) findViewById(R.id.name1);
        EditText ciudad1 = (EditText) findViewById(R.id.ciudad1);
        EditText correo1 = (EditText) findViewById(R.id.correo1);
        EditText cell1 = (EditText) findViewById(R.id.cell1);
        EditText cedula1 = (EditText) findViewById(R.id.cedula1);
        RadioButton hom = (RadioButton) findViewById(R.id.h);

        String nombre,ciudad,correo,celular,cedula,sexo;

        nombre=name1.getText().toString();
        ciudad=ciudad1.getText().toString();
        correo=correo1.getText().toString();
        celular=cell1.getText().toString();
        cedula=cedula1.getText().toString();
        sexo=hom.isChecked()?"Hombre": "Mujer";

        Intent enviar = new Intent(MainActivity.this, ANDROID_UI_2.class);
        Bundle conten = new Bundle();
        conten.putString("NOMBRE", nombre);
        conten.putString("CIUDAD", ciudad);;
        conten.putString("CORREO", correo);
        conten.putString("GENERO", sexo);
        conten.putString("CEDULA", cedula);
        conten.putString("TELEFONO", celular);
        enviar.putExtras(conten);
        startActivity(enviar);


    }
    public void erase (View view) {
        EditText name1 = (EditText) findViewById(R.id.name1);
        EditText ciudad1 = (EditText) findViewById(R.id.ciudad1);
        EditText correo1 = (EditText) findViewById(R.id.correo1);
        EditText cell1 = (EditText) findViewById(R.id.cell1);
        EditText cedula1 = (EditText) findViewById(R.id.cedula1);
        RadioButton hom = (RadioButton) findViewById(R.id.h);

        name1.setText("");
        ciudad1.setText("");
        correo1.setText("");
        cell1.setText("");
        cedula1.setText("");



    }



}