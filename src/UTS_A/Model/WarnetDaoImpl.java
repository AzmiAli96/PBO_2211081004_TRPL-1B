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
public class WarnetDaoImpl implements WarnetDao{
    List<Warnet> data = new ArrayList<>();
    PelangganDao pelanggandao;
    
    public WarnetDaoImpl(){
        pelangganDao = new PelangganDaoIml();
        data.add(new Warnet(getPelanggan(0),"15", 09:00, 13:00 ));
        data.add(new Warnet(getPelanggan(1),"3", 09:00, 13:00));
    }
    
    public void save(Warnet warnet){
        data.add(warnet);
    }
    public void update(int index, Warnet warnet){
        data.set(index, warnet);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Warnet getWarnet(int index){
        return data.get(index);
    }
    public List<Warnet> getAll(){
        return data;
    }
}
