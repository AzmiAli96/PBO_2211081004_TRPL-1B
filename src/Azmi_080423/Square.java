/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_080423;

/**
 *
 * @author nitro
 */
public class Square extends Shape {
    private int s;
    
    public Square(int s){
        this.s = s;
    }

    public String getName(){
        return "Persegi";
     }
    
    public double getArea(){
         return s*s;
     }
}
