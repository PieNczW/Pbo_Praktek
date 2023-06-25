/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farrell.dao;
import java.util.List;
import farrell.model.anggota;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class AnggotaDaoImpl implements anggotaDAO{
    private List<anggota> data = new ArrayList<>();
    
    public AnggotaDaoImpl(){
        data.add(new anggota("A001","IRFAN","PADANG","L"));
        data.add(new anggota("A002","DION","PAYAKUMBUH","L"));       
    }
    
    public void insert(anggota Anggota){
        data.add(Anggota);
    }
    
    public void update(int index, anggota Anggota){
        data.set(index, Anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List<anggota>getAll(){
        return data;
    }
}
