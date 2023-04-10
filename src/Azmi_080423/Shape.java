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
    
    
    public Shape(){
        //
    }
    
     public abstract String getName();
     
     public abstract double getArea();
     
     public static void main(String []args){
         Circle c = new Circle(8);
         Square q = new Square(5);
         System.out.println("nama objek c"+c.getName());
         System.out.println("hasil objek c"+c.getArea());
         
         System.out.println("nama objek q"+q.getName());
         System.out.println("hasil objek q"+q.getArea());
         
     }
}
