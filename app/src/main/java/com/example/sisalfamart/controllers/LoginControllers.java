package com.example.sisalfamart.controllers;


import com.example.sisalfamart.models.ResponLoginModels;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginControllers {
    @POST("login")
    @FormUrlEncoded
    Call<ResponLoginModels> loginMSUser(@Field("user_id") String user_id,
                                        @Field("pass_word") String pass_word);
}
