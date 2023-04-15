/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Azmi_150423.Model;
import java.util.List;
/**
 *
 * @author Azmi
 */
public interface AnggotaDao {
    void save (Anggota anggota);
    void update(int index, Anggota anggota);
    void delete (int index);
    Anggota getAnggota(int index);
    List <Anggota> getAll();
}
