package com.android.mvvm_conexionapi.vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.android.mvvm_conexionapi.R;
import com.android.mvvm_conexionapi.modelo.DatosModelo;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatosViewModel model = ViewModelProviders.of(this).get(DatosViewModel.class);
        model.obtenerDatos().observe(this, new Observer<DatosModelo>() {

            @Override
            public void onChanged(DatosModelo datosModelo) {

                //se colocan los datos en los componentes del xml
            }
        });

    }

}