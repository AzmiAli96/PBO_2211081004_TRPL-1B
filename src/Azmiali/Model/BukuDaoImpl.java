/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmiali.Model;
import com.mysql.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nitro
 */
public class BukuDaoImpl  implements BukuDao{
    private Connection connection;
    private Buku buku;
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert (Buku buku)throws Exception{
        String sql = "insert into buku values(?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.setString(5, buku.getThnterbit());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update (Buku buku) throws Exception{
        String sql = "update buku SET judulbuku = ?, pengarang = ?, penerbit = ?, thnterbit = ? WHERE kodebuku = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(5, buku.getKodebuku());
        ps.setString(1, buku.getJudulbuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getPenerbit());
        ps.setString(4, buku.getThnterbit());
       // ps.setString(6, kode);
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete (String kode) throws Exception{
        String sql = "DELETE FROM buku WHERE kodebuku = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kode);
        ps.executeUpdate();
    } 
    
    public Buku getBuku(String kodebuku) throws Exception{
        String sql = "SELECT * FROM buku WHERE kodebuku = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodebuku);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setThnterbit(rs.getString(5));
        }
        return buku;
    }
    
    public List<Buku> getAll() throws Exception{
        String sql = "SELECT * FROM buku ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Buku buku;
        List<Buku> list = new ArrayList<>();
        while(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setThnterbit(rs.getString(5));
            list.add(buku);
        }
        return list;
    }
}
