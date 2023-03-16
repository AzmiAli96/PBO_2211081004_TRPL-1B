/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_16032023;
 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author nitro
 */
public class latihan61 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai ujian ke-1: ");
        double ujian1 = Double.parseDouble(reader.readLine());

        System.out.print("Masukkan nilai ujian ke-2: ");
        double ujian2 = Double.parseDouble(reader.readLine());

        System.out.print("Masukkan nilai ujian ke-3: ");
        double ujian3 = Double.parseDouble(reader.readLine());

        double rataRata = (ujian1 + ujian2 + ujian3) / 3;
        System.out.println("Nilai rata-rata: " + rataRata);

        if (rataRata >= 60) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}


