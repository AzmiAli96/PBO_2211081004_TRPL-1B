/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_130423;

/**
 *
 * @author nitro
 */
public class MyDouble implements Relation{
    public boolean isGrater (Object a, Object b){
        return ((double) a > (double) b);
    }
    public boolean isLess (Object a, Object b){
        return ((double) a < (double) b);
    }
    public boolean isEqual (Object a, Object b){
        return ((double) a == (double) b);
    }
    
}
