/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_080423;

/**
 *
 * @author nitro
 */
public class Latihan extends StudentRecord{
    
    private double komGrade;
    public Latihan(){
        super ("Ali", "Padang");
        System.out.println("Inside Siswa:Constructor");
    }
    
    public double getKomGrade(){
        return komGrade;
    }
    public void setKomGrade(double komGrade){
        this.komGrade = komGrade;
    } 
    
    @Override
    public double getAverage(){
        return (getMathGrade() + getEnglishGrade() + getScienceGrade() / 3);
    }
}
    

