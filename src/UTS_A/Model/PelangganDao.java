/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UTS_A.Model;

import Azmi_150423.Model.Anggota;
import java.util.List;

/**
 *
 * @author nitro
 */
public interface PelangganDao {
    void save (Pelanggan pelanggan);
    void update(int index, Pelanggan pelanggan);
    void delete (int index);
    Pelanggan getPelanggan(int index);
    List <Pelanggan> getAll();
}
