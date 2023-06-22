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
public class PeminjamanDaoImpl implements PeminjamanDao{
    private Connection connection;
    private Peminjaman peminjaman;
    public PeminjamanDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert (Peminjaman peminjaman)throws Exception{
        String sql = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update (Peminjaman peminjaman, String kode) throws Exception{
        String sql = "update peminjaman SET kodeanggota = ?, kodebuku = ?, tglpinjam = ?, tglkembali = ? WHERE kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.setString(5, kode);
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete (String kode) throws Exception{
        String sql = "DELETE FROM anggota WHERE kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kode);
        ps.executeUpdate();
    } 
    
    public Peminjaman getPeminjaman(String kodeanggota) throws Exception{
        String sql = "SELECT * FROM peminjaman WHERE kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
        }
        return peminjaman;
    }
    
    public List<Peminjaman> getAll() throws Exception{
        String sql = "SELECT * FROM peminjaman ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman;
        List<Peminjaman> list = new ArrayList<>();
        while(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }
}
