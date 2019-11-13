package com.android.mvvm_conexionapi.modelo.servicios;

import com.android.mvvm_conexionapi.modelo.DatosModelo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DatosAPI {

    @GET("data-core")
        Call<DatosModelo> obtenerResultados();

    }

