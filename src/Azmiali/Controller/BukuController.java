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
public class BukuController {
    FormBuku view;
    Buku buku;
    BukuDao dao;
    Connection connection;
    
    public BukuController (FormBuku view){
        try {
            this.view = view;
            connection = DbHelper.getConnection();
            dao = new BukuDaoImpl (connection);
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        view.getTxtKodeBuku().setText("");
        view.getTxtJudulBuku().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
        view.getTxtThnTerbit().setText("");
    }
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTblBuku().getModel();
            tabelModel.setRowCount(0);
            List<Buku> list = dao.getAll();
            for (Buku a : list){
                Object[] row = {
                    a.getKodebuku(),
                    a.getJudulbuku(),
                    a.getPengarang(),
                    a.getPenerbit(),
                    a.getThnterbit()
                };
                tabelModel.addRow(row);
            }
        }   catch (Exception ex) {
                Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        try {
            buku = new Buku();
            buku.setKodebuku(view.getTxtKodeBuku().getText());
            buku.setJudulbuku(view.getTxtJudulBuku().getText());
            buku.setPengarang(view.getTxtPengarang().getText());
            buku.setPenerbit(view.getTxtPenerbit().getText());
            buku.setThnterbit(view.getTxtThnTerbit().getText());
            dao.insert(buku);
            JOptionPane.showMessageDialog(view, "Entri Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Update(){
        try {
            //String kode = view.getTblBuku().getValueAt(view.getTblBuku().getSelectedRow(), 0).toString();
            buku = new Buku();
            buku.setKodebuku(view.getTxtKodeBuku().getText());
            buku.setJudulbuku(view.getTxtJudulBuku().getText());
            buku.setPengarang(view.getTxtPengarang().getText());
            buku.setPenerbit(view.getTxtPenerbit().getText());
            buku.setThnterbit(view.getTxtThnTerbit().getText());
            dao.update(buku);
            JOptionPane.showMessageDialog(view, "Update Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Delete(){
        try {
            String kode = view.getTblBuku().getValueAt(view.getTblBuku().getSelectedRow(), 0).toString();
            dao.delete(kode);
            JOptionPane.showMessageDialog(view, "Delete Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getBuku(){
        String kode = view.getTblBuku().getValueAt(view.getTblBuku().getSelectedRow(), 0).toString();
        try {
            buku = dao.getBuku(kode);
            view.getTxtKodeBuku().setText(buku.getKodebuku());
            view.getTxtJudulBuku().setText(buku.getJudulbuku());
            view.getTxtPengarang().setText(buku.getPengarang());
            view.getTxtPenerbit().setText(buku.getPenerbit());
            view.getTxtThnTerbit().setText(buku.getThnterbit());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex);
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
