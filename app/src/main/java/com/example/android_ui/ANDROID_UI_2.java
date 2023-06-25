package com.example.android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ANDROID_UI_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_ui2);

        TextView recibir = (TextView)findViewById(R.id.recibir);
        Bundle conten= this.getIntent().getExtras();
        recibir.setText("Hola "+conten.getString("NOMBRE")+"\n"
                +"*********ESTOS SON LOS DATOS QUE INGRESASTE*********"+"\n"
                +"Ciudad: "+conten.getString("CIUDAD")+"\n"
                +"Telefono: "+conten.getString("TELEFONO")+"\n"
                +"Correo: "+conten.getString("CORREO")+"\n"
                +"Cedula: "+conten.getString("CEDULA")+"\n"
                +"Sexo: "+conten.getString("GENERO"));


    }
}