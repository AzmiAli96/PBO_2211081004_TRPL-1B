/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Azmiali.Model;
import java.util.List;

/**
 *
 * @author nitro
 */
public interface AnggotaDao {
    void insert (Anggota anggota) throws Exception;
    void update (Anggota anggota, String kode) throws Exception;
    void delete (String kode) throws Exception;
    Anggota getAnggota (String kode) throws Exception;
    List<Anggota> getAll() throws Exception;
}
