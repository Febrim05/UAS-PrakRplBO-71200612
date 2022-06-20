package com.uas.perawatan;

public class Perawat {
    private String nama;

    public Perawat(String nama){
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung, Daftar daftar){
        if(pengunjung.getPenyakit() == null){
            System.out.println("=================================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN==================================");
        } else{
            daftar.setStatusScreening(true);
        }
    }
}
