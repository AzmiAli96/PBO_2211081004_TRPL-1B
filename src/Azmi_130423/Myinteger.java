/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_130423;

/**
 *
 * @author nitro
 */
public class Myinteger implements Relation{
    public boolean isGrater (Object a, Object b){
        return ((int) a > (int) b);
    }
    public boolean isLess (Object a, Object b){
        return ((int) a < (int) b);
    }
    public boolean isEqual (Object a, Object b){
        return ((int) a == (int) b);
    }
}
