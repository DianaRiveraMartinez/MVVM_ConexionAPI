package com.android.mvvm_conexionapi.vista;


import com.android.mvvm_conexionapi.modelo.DatosModelo;
import com.android.mvvm_conexionapi.modelo.servicios.DatosServicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DatosViewModel extends ViewModel {


    private MutableLiveData<DatosModelo> datos;


    public LiveData<DatosModelo> obtenerDatos() {

        if (datos == null) {
            datos = new MutableLiveData<DatosModelo>();
            cargarDatos();
        }

        return datos;
    }


    private void cargarDatos(){

        DatosServicio datosServicio = new DatosServicio();
        datosServicio.
                obtenerAPI()
                .obtenerResultados()
                .enqueue(new Callback<DatosModelo>() {

            @Override
            public void onResponse(Call<DatosModelo> call, Response<DatosModelo> response) {

                datos.setValue(response.body());
            }

            @Override
            public void onFailure(Call<DatosModelo> call, Throwable t) {

            }
        });
    }
}
