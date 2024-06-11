/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs1_b_11360;

/**
 *
 * @author LENOVO
 */
public class Jadwal {

    private String namaJadwal;
    private String hari;
    private int durasi;
    private String tempat;
    public static int jumlahObjek;
    
    public Jadwal() {
        namaJadwal = "Mengajar";
        hari = "Senin";
        durasi = 6;
        tempat = "Kampus";
        jumlahObjek = jumlahObjek + 1;
    }
    
    
    public Jadwal(String  namaJadwal, String hari, int durasi, String tempat) {
        this.namaJadwal = namaJadwal;
        this.hari = hari;
        this.durasi = durasi;
        this.tempat = tempat;
        jumlahObjek = jumlahObjek + 1;
    }
    
    
    public String getNamaJadwal() {
        return namaJadwal;
    }
    public void setNamaJadwal(String namaJadwal) {
        this.namaJadwal = namaJadwal;
    }
    
    public String getHari() {
        return hari;
    }
    public void setHari(String hari) {
        this.hari = hari;
    }
    
    public int getDurasi() {
        return durasi;
    }
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    
    public String getTempat() {
        return tempat;
    }
    public void setTempat(String tempat) {
        this.tempat = tempat;
    }
    
    public double pendapatan() {
        return (durasi*200000)/2;
    }


    public void showJadwal(){
        System.out.println("Nama Jadwal : " + namaJadwal);
        System.out.println("Hari        : " + hari);
        System.out.println("Durasi      : " + durasi);
        System.out.println("Tempat      : " + tempat);
        System.out.println("Pendapatan  : " + pendapatan());
        System.out.println("Total Objek : " + jumlahObjek);

    }
    
}
