/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_150423.Controller;
import Azmi_150423.View.FormPeminjaman;
import Azmi_150423.Model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author nitro
 */
public class PengembalianController {
    private Pengembalian pengembalian;
    private PengembalianDao pengembalianDao;
    private PeminjamanDaoImpl peminjamanDao;
    private FormPeminjaman form;
    
    private Peminjaman peminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PengembalianController(FormPeminjaman form){
        this.form = form;
        pengembalianDao = new PengembalianDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImp1();
        bukuDao = new BukuDaoImp1();
    }
    public void bersihForm(){
        form.getTxtTglPeminjaman().setText("");
        form.getTxtTglKembali().setText("");
        form.getTxtTglDikembalikan().setText("");
    }
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAll();
        List<Buku> listBuku = bukuDao.getAll();
        form.getCboAnggota().removeAllItems();
        form.getCboBuku().removeAllItems();
        
        //isi
        for(Anggota anggota : listAnggota){
            form.getCboAnggota().addItem(anggota.getNobp());
        }
        for(Buku buku : listBuku){
            form.getCboBuku().addItem(buku.getKodeBuku());
        }
    }
    public void Pinjam(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPeminjaman(form.getTxtTglPeminjaman().getText());
        peminjaman.setTglKembali(form.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        
        pengembalian = new Pengembalian();
        pengembalian.setDikembalikan("");
        pengembalian.setTerlambat("");
        pengembalian.setDenda();
        pengembalianDao.save(pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Dipinjam");
    }
    
    public void Kembali(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        pengembalian.setDikembalikan(form.getTxtTglDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglDikembalikan().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Dikembalikan");
    }
    
    public void get(){
        int index = form.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            form.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            form.getCboBuku().setSelectedItem(peminjaman.getBuku().getKodeBuku());
            form.getTxtTglPeminjaman().setText(peminjaman.getTglPeminjaman());
            form.getTxtTglKembali().setText(peminjaman.getTglKembali());
        }
        pengembalian = pengembalianDao.getPengembalian(index);
        if(pengembalian != null){
            form.getTxtTglDikembalikan().setText(pengembalian.getDikembalikan());
        }
    }
    
    public void update(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPeminjaman(form.getTxtTglPeminjaman().getText());
        peminjaman.setTglKembali(form.getTxtTglKembali().getText());
        peminjamanDao.update(idx,peminjaman);
        
        pengembalian.setDikembalikan(form.getTxtTglDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglDikembalikan().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Updated");
    }
    
    public void delete(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        pengembalianDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    
    public void tampilData() {
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);

        // Mengambil data dari dua tabel
        java.util.List<Pengembalian> listPengembalian = pengembalianDao.getAll();
        java.util.List<Peminjaman> listPeminjaman = peminjamanDao.getAll();

        // Menambahkan data dari kedua tabel ke dalam satu list
        List<Object[]> dataGabungan = new ArrayList<>();
        for (int i = 0; i < listPeminjaman.size(); i++) {
            Peminjaman peminjaman = listPeminjaman.get(i);
            Pengembalian pengembalian = null;
            if (i < listPengembalian.size()) {
                pengembalian = listPengembalian.get(i);
            }
            Object[] data = {
                peminjaman.getAnggota().getNobp(),
                peminjaman.getBuku().getKodeBuku(),
                peminjaman.getTglPeminjaman(),
                peminjaman.getTglKembali(),
                (pengembalian == null) ? "" : pengembalian.getDikembalikan(),
                (pengembalian == null) ? "" : pengembalian.getTerlambat(),
                (pengembalian == null) ? "" : pengembalian.getDenda()
            };
            dataGabungan.add(data);
        }

        // Menambahkan data ke dalam tabel
        for (Object[] data : dataGabungan) {
            tabelModel.addRow(data);
        }
    }
}
