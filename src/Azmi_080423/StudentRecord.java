/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_080423;

/**
 *
 * @author nitro
 */
public class StudentRecord {
    
    protected String name;
    protected String address;
    protected int age;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    private double average;
    private char nilaihuruf;
    
    private static int studentCount; //class variable
    
    
    public StudentRecord(){
        System.out.println("Inside Student:Constructor");
        //area inisialisasi kode;
        studentCount++;
    }
    
    public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
    }
    
    public StudentRecord(String name, String address){
        this.name = name;
        this.address = address;
        studentCount++;
    }
    
    public StudentRecord(double eGrade, double mGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }
    
    public String getName(){
        System.out.println("StudentRecord: getName");
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
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    public static double getStudentCount(){
        return studentCount;
    }
    
    public void print(String temp){
        System.out.println("Name:" +name);
        System.out.println("Address:" +address);
        System.out.println("Age:" +age);
    }
    
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name:" +name);
        System.out.println("Math Grade:" +mGrade);
        System.out.println("English Grade:" +eGrade);
        System.out.println("Science Grade:" +sGrade);
    }
    
    public char NilaiHuruf(){
        if (getAverage() > 80)
            nilaihuruf = 'A';
        else if (getAverage() > 65)
            nilaihuruf = 'B';
        else if (getAverage() > 55)
            nilaihuruf = 'C';
        else if (getAverage() > 40)
            nilaihuruf = 'D';
        else if (getAverage() > 0)
            nilaihuruf = 'E';
        return nilaihuruf;
    }
}
