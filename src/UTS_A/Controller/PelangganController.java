/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Controller;
import UTS_A.View.FormPelanggan;
import UTS_A.Model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nitro
 */
public class PelangganController {
    private FormPelanggan formPelanggan;
    private PelangganDao pelangganDao;
    private Pelanggan pelanggan;
    
    public PelangganController (FormPelanggan formpelanggan){
        this.formPelanggan = formPelanggan;
        pelangganDao = new PelangganDaoImpl();
    }
    
    public void bersihForm(){
        formPelanggan.getTxtKode().setText("");
        formPelanggan.getTxtNama().setText("");
        formPelanggan.getTxtJenis().setText("");
    }
    
    public void savePelanggan(){
        pelanggan = new Pelanggan();
        pelanggan.setKode(formPelanggan.getTxtKode().getText());
        pelanggan.setNama(formPelanggan.getTxtNama().getText());
        pelanggan.setJenis(formPelanggan.getTxtJenis().getText());
        pelangganDao.save(pelanggan);
        javax.swing.JOptionPane.showMessageDialog(formPelanggan, "Entri Ok");
    }
    
    public void getPelanggan(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        pelanggan = pelangganDao.getPelanggan(index);
        if(pelanggan != null){
            formPelanggan.getTxtKode().setText(pelanggan.getNama());
            formPelanggan.getTxtNama().setText(pelanggan.getNama());
            formPelanggan.getTxtJenis().setText(pelanggan.getJenis());
        }
    }
    
    public void updatePelanggan(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        pelanggan.setKode(formPelanggan.getTxtKode().getText());
        pelanggan.setNama(formPelangga.getTxtNama().getText());
        pelanggan.setJenis(formPelanggan.getTxtJenis().getText());
        pelangganDao.update(index, pelanggan);
    }
    
    
}
