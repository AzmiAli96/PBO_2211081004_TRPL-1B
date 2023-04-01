/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_010423;

/**
 *
 * @author nitro
 */
public class EntryBukuAlamat {
    private String name;
    private String address;
    private String telp;
    private String email;
    
    private static int AlamatCount;
    
    public EntryBukuAlamat(){
        //area inisialisasi kode;
        AlamatCount++;
    }
    public EntryBukuAlamat(String temp){
        this.name = temp;
        AlamatCount++;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getTelp(){
        return telp;
    }
    public void setTelp(String telp){
        this.telp = telp;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public static double getAlamatCount(){
        return AlamatCount;    
    }
        
    
}
