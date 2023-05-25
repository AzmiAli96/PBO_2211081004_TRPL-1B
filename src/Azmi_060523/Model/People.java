/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_060523.Model;

/**
 *
 * @author nitro
 */
public class People {
    private String nama;
    private String alamat;
    private String statusnikah;
    
    public People(){
    }
    /*
    public People(String nama,  String alamat, String statusnikah){
        this.nama = nama;
        this.alamat = alamat;
        this.statusnikah = statusnikah;
    }
    */
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getStatusNikah(){
        return statusnikah;
    }
    public void setStatusNikah(String statusnikah){
        this.statusnikah = statusnikah;
    }
}
