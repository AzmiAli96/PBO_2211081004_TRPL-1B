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
    private Anggota anggota;
    private Buku buku;
    private String tglpeminjaman;
    private String tglkembali;
    
    public Peminjaman(){
    }
    
    public Peminjaman(Anggota anggota, Buku buku, String tglpeminjaman, String tglkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tglpeminjaman = tglpeminjaman;
        this.tglkembali = tglkembali;
    }
    
    public Anggota getAnggota(){
        return anggota;
    }
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
    
    public Buku getBuku(){
        return buku;
    }
    public void setBuku(Buku buku){
        this.buku = buku;
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
