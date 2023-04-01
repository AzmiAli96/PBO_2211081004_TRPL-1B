/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_010423;

/**
 *
 * @author nitro
 */
public class EntryBukuAlamatData {
    public static void main (String []args){
        EntryBukuAlamat dataBuku[] = new EntryBukuAlamat[100];
        EntryBukuAlamat d1 = new EntryBukuAlamat();
        d1.setName("Azmi");
        d1.setAddress("Bukittinggi");
        d1.setTelp("********5396");
        d1.setEmail("azmialid@gmail.com");
        dataBuku[0] = d1;
        
        System.out.println("Nama      [0]:" +dataBuku[0].getName());
        dataBuku[0].setName("");
        dataBuku[0].setAddress("");
        dataBuku[0].setTelp("");
        dataBuku[0].setEmail("");
        
        System.out.println("Nama      [0]:" +dataBuku[0].getName());
        
    }
}
