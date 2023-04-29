/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_150423.Controller;
import Azmi_150423.Model.*;
import Azmi_150423.View.FormPeminjaman;
import javax.swing.table.DefaultTableModel;
import java.util.*;

/**
 *
 * @author nitro
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PeminjamanController (FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImp1();
        bukuDao = new BukuDaoImp1();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtTglPeminjaman().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPeminjaman(formPeminjaman.getTxtTglPeminjaman().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
    }
    
    public void isiCombo(){
        List<Anggota> ListAnggota = anggotaDao.getAll();
        List<Buku> ListBuku = bukuDao.getAll();
        formPeminjaman.getCboAnggota().removeAllItems();
        formPeminjaman.getCboBuku().removeAllItems();
        
        for (Anggota anggota : ListAnggota){
            formPeminjaman.getCboAnggota().addItem(anggota.getNobp());
        }
        
        for (Buku buku : ListBuku){
            formPeminjaman.getCboBuku().addItem(buku.getKodeBuku());
        }
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getBuku().getKodeBuku());
            formPeminjaman.getTxtTglPeminjaman().setText(peminjaman.getTglPeminjaman());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglKembali());
        }
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPeminjaman(formPeminjaman.getTxtTglPeminjaman().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.update(index, peminjaman);
    }
    
    public void deletePeminjaman(){
        int index =formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getAnggota().getNobp(),
                peminjaman.getBuku().getKodeBuku(),
                peminjaman.getTglPeminjaman(),
                peminjaman.getTglKembali()
            };
            tabelModel.addRow(data);
        }
    }
}

