/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farrell.dao;
import farrell.model.Peminjaman;
import java.util.List;
/**
 *
 * @author HP
 */
public interface PeminjamanDao {
     void insert(Peminjaman peminjaman);
    void update(int index, Peminjaman peminjaman);
    void delete(int index);
    Peminjaman getPeminjaman(int index);
    List<Peminjaman> getAll();
}
