/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_060523.Controller;

import Azmi_060523.Model.Karyawan;
import Azmi_060523.Model.KaryawanDao;
import Azmi_060523.Model.KaryawanDaoImpl;
import Azmi_060523.View.FormKaryawan;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nitro
 */
public class KaryawanController {
    private FormKaryawan formKaryawan;
    private KaryawanDao karyawanDao;
    private Karyawan karyawan;
    
    public KaryawanController (FormKaryawan formKaryawan){
        this.formKaryawan = formKaryawan;
        karyawanDao = new KaryawanDaoImpl();
    }
    
    public void bersihForm(){
        formKaryawan.getTxtNip().setText("");
        formKaryawan.getTxtGolongan().setText("");
        formKaryawan.getTxtJabatan().setText("");
    }
    
    public void saveKaryawan(){
        karyawan = new karyawan();
        karyawan.setNobp(formKaryawan.getTxtNip().getText());
        karyawan.setNama(formKaryawan.getTxtGolongan().getText());
        karyawan.setAlamat(formKaryawan.getTxtJabatan().getText());
        karyawanDao.save(karyawan);
        javax.swing.JOptionPane.showMessageDialog(formKaryawan, "Entri Ok");
    }
    
    public void getKaryawan(){
        int index = formKaryawan.getTblKaryawan().getSelectedRow();
        karyawan = karyawanDao.getKaryawan(index);
        if(karyawan != null){
            formKaryawan.getTxtNip().setText(karyawan.getNip());
            formKaryawan.getTxtGolongan().setText(karyawan.getGolongan());
            formKaryawan.getTxtJabatan().setText(karyawan.getJabatan());
        }
    }
    
    public void updateKaryawan(){
        int index = formKaryawan.getTblKaryawan().getSelectedRow();
        karyawan.setNip(formKaryawan.getTxtNip().getText());
        karyawan.setGolongan(formKaryawan.getTxtGolongan().getText());
        karyawan.setJabatan(formKaryawan.getTxtJabatan().getText());
        karyawanDao.update(index, karyawan);
    }
    
    public void deleteKaryawan(){
        int index =formKaryawan.getTblKaryawan().getSelectedRow();
        karyawanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formKaryawan, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formKaryawan.getTblKaryawan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Karyawan> list = karyawanDao.getAll();
        for(Karyawan karyawan : list){
            Object[] data = {
                karyawan.getNip(),
                karyawan.getGolongan(),
                karyawan.getJabatan()
            };
            tabelModel.addRow(data);
        }
    }
}
