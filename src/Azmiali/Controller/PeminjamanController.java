/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmiali.Controller;
import Azmiali.DB.DbHelper;
import Azmiali.Model.*;
import Azmiali.View.*;
import javax.swing.table.DefaultTableModel;
import java .util.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author nitro
 */
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman peminjaman;
    PeminjamanDao dao;
    Connection connection;
    BukuDao buku;
    AnggotaDao anggota;
    
    
    public PeminjamanController (FormPeminjaman view){
        try {
            this.view = view;
            connection = DbHelper.getConnection();
            dao = new PeminjamanDaoImpl (connection);
            anggota = new AnggotaDaoImpl (connection);
            buku = new BukuDaoImpl(connection);
            peminjaman = new Peminjaman();
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        try {
            List<Anggota> listAnggota = anggota.getAll();
            view.getCboKodeAnggota().removeAllItems();
            for(Anggota anggota : listAnggota){
                view.getCboKodeAnggota().addItem(anggota.getKodeanggota());
            }
            List<Buku> listBuku = buku.getAll();
            view.getCboKodeBuku().removeAllItems();
            for(Buku buku : listBuku){
                view.getCboKodeBuku().addItem(buku.getKodebuku());
            }
            view.getTxtTglPinjam().setText("");
            view.getTxtTglKembali().setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex);
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTblPeminjaman().getModel();
            tabelModel.setRowCount(0);
            List<Peminjaman> list = dao.getAll();
            for (Peminjaman a : list){
                Object[] row = {
                    a.getKodeanggota(),
                    a.getKodebuku(),
                    a.getTglpinjam(),
                    a.getTglkembali()
                };
                tabelModel.addRow(row);
            }
        }   catch (Exception ex) {
                Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        try {
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(view.getCboKodeAnggota().getSelectedItem().toString());
            peminjaman.setKodebuku(view.getCboKodeBuku().getSelectedItem().toString());
            peminjaman.setTglpinjam(view.getTxtTglPinjam().getText());
            peminjaman.setTglkembali(view.getTxtTglKembali().getText());
            dao.insert(peminjaman);
            JOptionPane.showMessageDialog(view, "Entri Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Update(){
        try {
            String kode = view.getTblPeminjaman().getValueAt(view.getTblPeminjaman().getSelectedRow(), 0).toString();
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(view.getCboKodeAnggota().getSelectedItem().toString());
            peminjaman.setKodebuku(view.getCboKodeBuku().getSelectedItem().toString());
            peminjaman.setTglpinjam(view.getTxtTglPinjam().getText());
            peminjaman.setTglkembali(view.getTxtTglKembali().getText());
            dao.update(peminjaman, kode);
            JOptionPane.showMessageDialog(view, "Update Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Delete(){
        try {
            String kode = view.getTblPeminjaman().getValueAt(view.getTblPeminjaman().getSelectedRow(), 0).toString();
            dao.delete(kode);
            JOptionPane.showMessageDialog(view, "Delete Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPeminjaman(){
        String kode = view.getTblPeminjaman().getValueAt(view.getTblPeminjaman().getSelectedRow(), 0).toString();
        try {
            peminjaman = dao.getPeminjaman(kode);
            view.getCboKodeAnggota().setSelectedItem(peminjaman.getKodeanggota());
            view.getCboKodeBuku().setSelectedItem(peminjaman.getKodebuku());
            view.getTxtTglPinjam().setText(peminjaman.getTglpinjam());
            view.getTxtTglKembali().setText(peminjaman.getTglkembali());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex);
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
