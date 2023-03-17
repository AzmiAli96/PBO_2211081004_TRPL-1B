/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_160323;
import javax.swing.JOptionPane;
/**
 *
 * @author nitro
 */
public class latihan62 {
    public static void main(String[] args) {
        String ujian1Str = JOptionPane.showInputDialog("Masukkan nilai ujian ke-1:");
        double ujian1 = Double.parseDouble(ujian1Str);

        String ujian2Str = JOptionPane.showInputDialog("Masukkan nilai ujian ke-2:");
        double ujian2 = Double.parseDouble(ujian2Str);

        String ujian3Str = JOptionPane.showInputDialog("Masukkan nilai ujian ke-3:");
        double ujian3 = Double.parseDouble(ujian3Str);

        double rataRata = (ujian1 + ujian2 + ujian3) / 3;

        String output = "Nilai rata-rata: " + rataRata;
        if (rataRata >= 60) {
            output += " :)";
        } else {
            output += " :(";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
