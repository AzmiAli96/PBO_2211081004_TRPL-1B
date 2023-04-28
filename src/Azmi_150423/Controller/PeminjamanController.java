/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_150423.Controller;
import Azmi_150423.Model.Peminjaman;
import Azmi_150423.Model.PeminjamanDao;
import Azmi_150423.Model.PeminjamanDaoImpl;
import Azmi_150423.View.FormPeminjaman;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nitro
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController (FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = (PeminjamanDao) new PeminjamanDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtNobp().setText("");
        formPeminjaman.getTxtKodeBuku().setText("");
        formPeminjaman.getTxtTglPeminjaman().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setKodeBuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTglPeminjaman(formPeminjaman.getTxtTglPeminjaman().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getTxtNobp().setText(peminjaman.getNobp());
            formPeminjaman.getTxtKodeBuku().setText(peminjaman.getKodeBuku());
            formPeminjaman.getTxtTglPeminjaman().setText(peminjaman.getTglPeminjaman());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglKembali());
        }
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setKodeBuku(formPeminjaman.getTxtKodeBuku().getText());
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
                peminjaman.getNobp(),
                peminjaman.getKodeBuku(),
                peminjaman.getTglPeminjaman(),
                peminjaman.getTglKembali()
            };
            tabelModel.addRow(data);
        }
    }
}

