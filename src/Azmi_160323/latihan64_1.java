/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_160323;
import java.util.Scanner;
/**
 *
 * @author nitro
 */
public class latihan64_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int base = input.nextInt();

        System.out.print("Masukkan nilai pangkat: ");
        int exponent = input.nextInt();

        int result = 1;
        int i = 0;

        while (i < exponent) {
            result *= base;
            i++;
        }

        System.out.println(base + " pangkat " + exponent + " adalah " + result);
    }
}