/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_060523.Model;

/**
 *
 * @author nitro
 */
public class Karyawan {
    private String nip;
    private String golongan;
    private String jabatan;
    
    public Karyawan(){
    }
    
    public Karyawan(String nip, String golongan, String jabatan, String nama, String alamat, String statusnikah){
        super(nama, alamat, statusnikah)
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
    }
    
    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getGolongan(){
        return golongan;
    }
    public void setGolongan(String golongan){
        this.golongan = golongan;
    }
    
    public String getJabatan(){
        return jabatan;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
}
