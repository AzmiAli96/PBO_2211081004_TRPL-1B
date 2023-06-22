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
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman) throws Exception;
    void update (Peminjaman peminjaman, String kode) throws Exception;
    void delete (String kode) throws Exception;
    Peminjaman getPeminjaman (String kode) throws Exception;
    List<Peminjaman> getAll() throws Exception;
}
