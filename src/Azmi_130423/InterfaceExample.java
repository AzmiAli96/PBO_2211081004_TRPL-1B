/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_130423;

/**
 *
 * @author nitro
 */
public class InterfaceExample {
    public static void main (String[] args){
        Relation Myinteger = new Myinteger();
        Relation MyDouble = new MyDouble();
        
        System.out.println(" 10 dan 11"+Myinteger.isEqual(10,11));
        System.out.println(" 10.4 dan 11.6"+MyDouble.isEqual(10.4,11.6));
        
    }
}
