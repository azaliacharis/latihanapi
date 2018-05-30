package com.example.administrator.latihanapi.model;

/**
 * Created by Administrator on 23/05/2018.
 */

public class mahasiswa {
    private String nama, nim, email, foto;

    public mahasiswa(){}

    public mahasiswa(String nama, String nim, String email, String foto) {
        this.nama = nama;
        this.nim = nim;
        this.email = email;
        this.foto = foto;
    }

    //mendapatkan variabel nama
    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getEmail(){
        return email;
    }

    public String getFoto(){
        return foto;
    }

    //mengisi variabel nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //mengisi variabel nim
    public void setNim(String nim){
        this.nim = nim;
    }

    //mengisi variabel email
    public void setEmail(String email) {
        this.email = email;
    }

    //mengisi variabel fotos
    public void setFoto(String foto) {
        this.foto = foto;
    }
}
