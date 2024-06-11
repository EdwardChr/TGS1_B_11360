/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs1_b_11360;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class TGS1_B_11360 {

    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {

        String nama, nip, bentuk, alamat, hari, tempat;
        double gaji, panjang, lebar, tinggi;
        int totalPasien, totKaryawan, durasiBuka, durasi;

        Dokter D1 = new Dokter();
        System.out.println("\n ---Input Data Dokter---");
        System.out.println("Nama         : "); nama = input.readLine();
        System.out.println("NIP          : "); nip = input.readLine();
        System.out.println("Gaji         : "); gaji = Double.parseDouble(input.readLine());
        System.out.println("Total Pasien : "); totalPasien = Integer.parseInt(input.readLine());
        Dokter D2 = new Dokter(nama, nip, gaji, totalPasien);


        Aquarium A1 = new Aquarium();
        System.out.println("\n ---Input Data Aquarium---");
        System.out.println("Bentuk  : "); bentuk = input.readLine();
        System.out.println("Panjang : "); panjang = Double.parseDouble(input.readLine());
        System.out.println("Lebar   : "); lebar = Double.parseDouble(input.readLine());
        System.out.println("Tinggi  : "); tinggi = Double.parseDouble(input.readLine());
        Aquarium A2 = new Aquarium(bentuk, panjang, lebar, tinggi);
        

        Klinik K1 = new Klinik();
        System.out.println("\n ---Input Data Klinik---");
        System.out.println("Nama Klinik    : "); nama = input.readLine();
        System.out.println("Alamat         : "); alamat = input.readLine();
        System.out.println("Total Karyawan : "); totKaryawan = Integer.parseInt(input.readLine());
        System.out.println("Durasi Buka    : "); durasiBuka = Integer.parseInt(input.readLine());
        Klinik K2 = new Klinik(nama, alamat, totKaryawan, durasiBuka);


        Jadwal J1 = new Jadwal();
        System.out.println("\n ---Input Jadwal---");
        System.out.println("Nama Jadwal : "); nama = input.readLine();
        System.out.println("Hari        : "); hari = input.readLine();
        System.out.println("Durasi      : "); durasi = Integer.parseInt(input.readLine());
        System.out.println("Tempat      : "); tempat = input.readLine();
        Jadwal J2 = new Jadwal(nama, hari, durasi, tempat);


        System.out.println("\n\t ---Show Data---");

        System.out.println("\n --Dokter Default--");
        D1.showDokter();
        System.out.println("\n --Dokter Input--");
        D2.showDokter();
        System.out.println("-------------------------------------------");


        System.out.println("\n --Aquarium Default--");
        A1.showAquarium();
        System.out.println("\n --Aquarium Input--");
        A2.showAquarium();
        System.out.println("-------------------------------------------");


        System.out.println("\n --Klinik Default--");
        K1.showKlinik();
        System.out.println("\n --Klinik Input--");
        K2.showKlinik();
        System.out.println("-------------------------------------------");


        System.out.println("\n --Jadwal Default--");
        J1.showJadwal();
        System.out.println("\n --Jadwal Input--");
        J2.showJadwal();
        System.out.println("-------------------------------------------");

        
    }
    
}
