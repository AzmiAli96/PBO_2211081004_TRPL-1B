/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Azmi_070323;

/**
 *
 * @author LABSIKOMP03
 */
public class Latihan_3 {
    public static void main (String[] args){
        int n1 = 10;
        int n2 = 23;
        int n3 = 5;
        
        int tbs = (n1>n2)?((n1>=n3)?n1:n3):((n2>n3)?n2:n3);
                
        System.out.println("number1 = " +n1);
        System.out.println("number2 = " +n2);
        System.out.println("number3 = " +n3);
        System.out.println("terbesar = " +tbs);
    }
}
