/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_010423;

/**
 *
 * @author nitro
 */
public class StudentRecordExample {
    public static void main (String []args){
        StudentRecord azmi = new StudentRecord();
        StudentRecord cris = new StudentRecord();
        StudentRecord ali = new StudentRecord("ali");
        
        //isi data
        azmi.setName("Azmi");
        azmi.setAddress("Bukittinggi");
        azmi.setAge(19);
        azmi.setMathGrade(90);
        azmi.setEnglishGrade(80);
        azmi.setScienceGrade(70);
        
        cris.setName("kris");
        cris.setAddress("Bukittingi");
        cris.setAge(20);
        
        //menampilkan 
        System.out.println("Data objek azmi");
        System.out.println("Nama           :" +azmi.getName());
        System.out.println("Alamat         :" +azmi.getAddress());
        System.out.println("Umur           :" +azmi.getAge());
        System.out.println("Nilai Rata-Rata:" +azmi.getAverage());
        System.out.println("Nilai Huruf    :" +azmi.NilaiHuruf());
        
        //menampilkan method print
        System.out.println("Data objek cris");
        cris.print("");
        cris.print(70,80,90);
        
        System.out.println("Data objek ali");
        ali.print("");
        //Menampilkan jumlah siswa
        System.out.println("Count"+StudentRecord.getStudentCount());
        
    }
    
}
