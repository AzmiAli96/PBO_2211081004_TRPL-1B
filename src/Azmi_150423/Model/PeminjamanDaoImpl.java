/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_150423.Model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nitro
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    List<Peminjaman> data = new ArrayList<>();
    
    public PeminjamanDaoImpl(){
        AnggotaDao daoAnggota = new AnggotaDaoImp1();
        BukuDao daoBuku = new BukuDaoImp1();
        data.add(new Peminjaman(daoAnggota.getAnggota(0), daoBuku.getBuku(0), "20/04/2023","27/04/2023"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0), daoBuku.getBuku(1), "21/04/2023","27/04/2023"));
        
    }
    
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    public List<Peminjaman> getAll(){
        return data;
    }
}
