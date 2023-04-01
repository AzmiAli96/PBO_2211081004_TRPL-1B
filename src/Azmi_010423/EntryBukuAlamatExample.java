/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_010423;

/**
 *
 * @author nitro
 */
public class EntryBukuAlamatExample {
    public static void main (String []args){
        EntryBukuAlamat ba1 = new EntryBukuAlamat();
        
        //isi data
        ba1.setName("Azmi Ali");
        ba1.setAddress("Bikittinggi");
        ba1.setTelp("********5396");
        ba1.setEmail("Azmialid@gmail.com");
        
        //menampilkan 
        System.out.println("Data Buku 1");
        System.out.println("Nama        :" +ba1.getName());
        System.out.println("Alamat      :" +ba1.getAddress());
        System.out.println("No Telepon  :" +ba1.getTelp());
        System.out.println("E-mail      :" +ba1.getEmail());
        
        System.out.println("Count"+EntryBukuAlamat.getAlamatCount());
    }
}
