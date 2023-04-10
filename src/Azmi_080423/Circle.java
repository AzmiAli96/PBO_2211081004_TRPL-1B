/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_080423;

/**
 *
 * @author nitro
 */
public class Circle extends Shape{
    
    private int r;
    
    public Circle(int r){
        this.r = r;
    }

    public String getName(){
        return "Lingkaran";
     }
    
    public double getArea(){
         return 3.14*r*r;
     }
}
