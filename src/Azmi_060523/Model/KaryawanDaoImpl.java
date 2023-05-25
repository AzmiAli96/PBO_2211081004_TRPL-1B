/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_060523.Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nitro
 */
public class KaryawanDaoImpl implements KaryawanDao{
    List<Karyawan> data = new ArrayList<>();
              
        public KaryawanDaoImpl(){
            data.add(new Karyawan("1111", "1", "CEO"));
            data.add(new Karyawan("1112", "1", "Ketua"));
            data.add(new Karyawan("1113", "2", "Karyawan"));
        }
        
    public void save(Karyawan karyawan){
        data.add(karyawan);
    }
    public void update(int index, Karyawan karyawan){
        data.set(index, karyawan);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Karyawan getKaryawan(int index){
        return data.get(index);
    }
    public List<Karyawan> getAll(){
        return data;
    }
}

