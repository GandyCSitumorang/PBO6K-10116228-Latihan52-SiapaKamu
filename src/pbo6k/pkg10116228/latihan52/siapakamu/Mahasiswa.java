/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan52.siapakamu;

/**
 *
 * @author MY PC
 */
public class Mahasiswa extends Manusia{
    private String NIM;
    private String kelas;

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Nama saya "+nama+" umur "+umur+" sedang belajar di kelas "+kelas);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
    
    
}
