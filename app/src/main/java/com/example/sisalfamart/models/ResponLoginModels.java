package com.example.sisalfamart.models;

import com.google.gson.annotations.SerializedName;

public class ResponLoginModels {

    @SerializedName("pesan")
    public String pesan;

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
}
