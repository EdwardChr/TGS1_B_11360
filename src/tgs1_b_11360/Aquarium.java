/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs1_b_11360;

/**
 *
 * @author LENOVO
 */
public class Aquarium {

    private String bentuk;
    private double panjang;
    private double lebar;
    private double tinggi;
    public static int objek;
    
    
    public Aquarium() {
        bentuk = "persegi";
        panjang = 5;
        lebar = 5;
        tinggi = 5;
        objek = objek+1;
    }
    
    public Aquarium(String bentuk, double panjang, double lebar, double tinggi) {
        this.bentuk = bentuk;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        objek = objek+1;
    }
    
    
    public String getBentuk() {
        return bentuk;
    }
    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }
    
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    
    public double biayaPembuatan() {
        return 5000 * panjang * lebar * tinggi;
    }


    public void showAquarium(){
        System.out.println("Bentuk          : " + bentuk);
        System.out.println("Panjang         : " + panjang);
        System.out.println("Lebar           : " + lebar);
        System.out.println("Tinggi          : " + tinggi);
        System.out.println("Biaya Pembuatan : " + biayaPembuatan());
        System.out.println("Total Objek     : " + objek);
    }

    
}
