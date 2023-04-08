/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_080423;

/**
 *
 * @author nitro
 */
public abstract class Shape {
    
    private String name;
    private double area;
    
    public Shape(String name, double area){
        this.name = name;
        this.area = area;
    }
    
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }
     
     public double getArea(){
         return area;
     }
     public void setArea(double area){
         this.area = area;
     }
}
