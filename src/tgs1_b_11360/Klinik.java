/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs1_b_11360;

/**
 *
 * @author LENOVO
 */
public class Klinik {
    
    private String namaKlinik;
    private String alamat;
    private int totalKaryawan;
    private int durasiBuka;
    static int totalObjek;
    
    
    public Klinik() {
        namaKlinik = "Atma Klinik";
        alamat = "Babarsari";
        totalKaryawan = 10;
        durasiBuka = 24;
        totalObjek = totalObjek + 1;
    }
    
    public Klinik(String namaKlinik, String alamat, int totalKaryawan, int durasiBuka) {
        this.namaKlinik = namaKlinik;
        this.alamat = alamat;
        this.totalKaryawan = totalKaryawan;
        this.durasiBuka = durasiBuka;
        totalObjek = totalObjek + 1;
    }
    
    public String getNama() {
        return namaKlinik;
    }
    public void setNama(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }
    
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public int getToalKaryawan() {
        return totalKaryawan;
    }
    public void setTotalKaryawan(int totalKaryawan) {
        this.totalKaryawan = totalKaryawan;
    }

    public int getDurasiBuka() {
        return durasiBuka;
    }
    public void setDurasiBuka(int durasiBuka) {
        this.durasiBuka = durasiBuka;
    }
    
    public double bonusKaryawan() {
        return 500000 * totalKaryawan;
    }

    public void showKlinik(){
        System.out.println("Nama Klinik    : " + namaKlinik);
        System.out.println("Almat          : " + alamat);
        System.out.println("Total Karyawan : " + totalKaryawan);
        System.out.println("Durasi Buka    : " + durasiBuka);
        System.out.println("Bonus Karyawan : " + bonusKaryawan());
        System.out.println("Total Objek    : " + totalObjek);
    }
}
