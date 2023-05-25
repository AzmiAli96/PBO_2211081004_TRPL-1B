/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Model;

/**
 *
 * @author nitro
 */
public class Warnet{
    private Pelanggan pelanggan;
    private int tglmasuk;
    private int jammasuk;
    private int jamkeluar;
    private int tarif;
    
    public Warnet(){
    }
    
    public Warnet(Pelanggan pelanggan, int tglmasuk, int jammasuk, int jamkeluar, int tarif){
        this.pelanggan = pelanggan;
        this.tglmasuk = tglmasuk;
        this.jammasuk = jammasuk;
        this.jamkeluar = jamkeluar;
        this.tarif = 10000;
    }
    
    public Pelanggan getPelanggan(){
        return pelanggan;
    }
    public void setPelanggan(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }
    
    public int getTglMasuk(){
        return tglmasuk;
    }
    public void setTglMasuk(int tglmasuk){
        this.tglmasuk = tglmasuk;
    }
    
    public int getJamMasuk(){
        return jammasuk;
    }
    public void setJamMasuk(int jammasuk){
        this.jammasuk = jammasuk;
    }
        
    public int getJamKeluar(){
        return jammasuk;
    }
    
    public void setJamKeluar(int jamkeluar){
        this.jamkeluar = jamkeluar;
    }
    
    public void hitungTotalBayar() {
        int lama = jamkeluar - jammasuk;
        int diskon = 0;
        int totalBayar = 0;

        if (lama > 2) {
            if (pelanggan.getJenis().equals("VIP")) {
                diskon = (int) (0.02 * lama * tarif);
            } else if (pelanggan.getJenis().equals("GOLD")) {
                diskon = (int) (0.05 * lama * tarif);
            }
        }

        totalBayar = lama * tarif - diskon;
    }
}
