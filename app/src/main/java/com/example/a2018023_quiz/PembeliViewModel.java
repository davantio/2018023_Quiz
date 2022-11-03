package com.example.a2018023_quiz;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PembeliViewModel extends ViewModel{
    private MutableLiveData<String> nama;
    private MutableLiveData<String> alamat;
    private MutableLiveData<String> nomor;

    public MutableLiveData<String> getNama() {
        if (nama == null){
            nama = new MutableLiveData<>();
        }
        return nama;
    }

    public MutableLiveData<String> getAlamat() {
        if (alamat == null){
            alamat = new MutableLiveData<>();
        }
        return alamat;
    }

    public MutableLiveData<String> getNomor() {
        if (nomor == null){
            nomor = new MutableLiveData<>();
        }
        return nomor;
    }

    public void setNama(MutableLiveData<String> nama) {
        this.nama = nama;
    }

    public void setNomor(MutableLiveData<String> nomor) {
        this.nomor = nomor;
    }

    public void setAlamat(MutableLiveData<String> alamat) {
        this.alamat = alamat;
    }
}
