/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs1_b_11360;

/**
 *
 * @author LENOVO
 */
public class Dokter {

    private String nama;
    private String nip;
    private double gaji;
    private int totalPasien;
    public static int objek;
    
    
    
    public Dokter() {
        nama = "Edward";
        nip = "11360";
        gaji = 500000;
        totalPasien = 5;
        objek = objek+1;
    }
    
    public Dokter(String nama, String nip, double gaji, int totalPasien) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
        this.totalPasien = totalPasien;
        objek = objek+1;
    }
    
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public int getTotalPasien() {
        return totalPasien;
    }
    public void setTotalPasien(int totalPasien) {
        this.totalPasien = totalPasien;
    }
    
    
    public double gajiBonus() {
        return (totalPasien * 2 * gaji) + gaji;
    }
    

    public void showDokter(){
        System.out.println("Nama         : " + nama);
        System.out.println("NIP          : " + nip);
        System.out.println("Gaji         : " + gaji);
        System.out.println("Total Pasien : " + totalPasien);
        System.out.println("Gaji Bonus   : " + gajiBonus());
        System.out.println("Total Objek  : " + objek);
    }

}