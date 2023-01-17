package com.hso.cryptomarket.service;

import com.hso.cryptomarket.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    // GET,POST,UPDATE,DELETE
    // URL BASE->WWW.WEBSİTE.COM
    //GET->price?key=xxxxxxxxxxxx

    @GET("ticker?key=5d222d896e3b2ee2214e95f9d34bd5fd52d5c3c1")
    Observable<List<CryptoModel>> getData();
    //Call<List<CryptoModel>> getData();
}
