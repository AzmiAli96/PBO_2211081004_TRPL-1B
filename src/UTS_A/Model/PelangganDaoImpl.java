/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nitro
 */
public class PelangganDaoImpl implements PelangganDao{
    List<Pelanggan> data = new ArrayList<>();
    
    public PelangganDaoImpl(){
        data.add(new Pelanggan("1004", "Azmi", "VIP"));
        data.add(new Pelanggan("1104", "Ali", "GOlD"));
    }
    
    public void save(Pelanggan pelanggan){
        data.add(pelanggan);
    }
    public void update(int index, Pelanggan pelanggan){
        data.set(index, pelanggan);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Pelanggan getPelanggan(int index){
        return data.get(index);
    }
    public List<Pelanggan> getAll(){
        return data;
    }
}
