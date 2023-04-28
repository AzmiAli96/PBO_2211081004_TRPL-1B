/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_150423.Model;

/**
 *
 * @author nitro
 */
public class Peminjaman {
    private String nobp;
    private String kodebuku;
    private String tglpeminjaman;
    private String tglkembali;
    
    public Peminjaman(){
    }
    
    public Peminjaman(String nobp, String kodebuku, String tglpeminjaman, String tglkembali){
        this.nobp = nobp;
        this.kodebuku = kodebuku;
        this.tglpeminjaman = tglpeminjaman;
        this.tglkembali = tglkembali;
    }
    
    public String getNobp(){
        return nobp;
    }
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    
    public String getKodeBuku(){
        return kodebuku;
    }
    public void setKodeBuku(String kodebuku){
        this.kodebuku = kodebuku;
    }
    
    public String getTglPeminjaman(){
        return tglpeminjaman;
    }
    public void setTglPeminjaman(String tglpeminjaman){
        this.tglpeminjaman = tglpeminjaman;
    }
    
    public String getTglKembali(){
        return tglkembali;
    }
    public void setTglKembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
}
