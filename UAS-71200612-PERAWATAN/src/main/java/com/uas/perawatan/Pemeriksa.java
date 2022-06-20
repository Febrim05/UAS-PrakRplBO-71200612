package com.uas.perawatan;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung,Daftar daftar){
        if(daftar.getStatusScreening() == false){
            System.out.println("");
        }
    }
}