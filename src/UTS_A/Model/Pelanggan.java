/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Model;

/**
 *
 * @author nitro
 */
public class Pelanggan {
    private String kode;
    private String nama;
    private String jenis;
    
    public Pelanggan(){
    }
    
    public Pelanggan(String kode, String nama, String jenis){
        this.kode = kode;
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public String getKode(){
        return kode;
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
