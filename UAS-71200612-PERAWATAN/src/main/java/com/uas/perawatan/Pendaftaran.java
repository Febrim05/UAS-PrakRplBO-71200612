package com.uas.perawatan;

import java.util.Scanner;

public class Pendaftaran {
    private String nama;

    public Pendaftaran(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Daftar daftar){
        if (pengunjung.getStatus() == true){
            System.out.println("error");
        }
        else if (pengunjung.getStatus() == false){
            daftar.setStatusDaftar(true);
            daftar.setPengunjung(pengunjung);
            daftar.setPemeriksa(pemeriksa);
            daftar.setPerawat(perawat);

        }
    }

    public Pengunjung registrasi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama anda: ");
        String nama = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukkan usia anda: ");
        String umur = input2.nextLine();
        int usia = Integer.parseInt(umur);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Masukkan alamat anda: ");
        String alamat = input3.nextLine();

        Scanner input4 = new Scanner(System.in);
        System.out.println("Masukkan penyakit anda: ");
        String penyakit = input4.nextLine();


    }
}
