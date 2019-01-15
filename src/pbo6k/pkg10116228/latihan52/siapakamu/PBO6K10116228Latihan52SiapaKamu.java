/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan52.siapakamu;

/**
 *Nama  : GandyChristianSitumorang
 *Kelas : PBO6K
 *NIM   : 10116228
 *Deskripsi Program: program ini berisi program yang menampilkan informasi 
 *                   dosen dan mahasiswa
 */
public class PBO6K10116228Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNIP("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN = " + dosen.getNIP());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNIM("10117074");
        mhs.setNama("Brigita Julia Puspita Nai Goncalves");
        mhs.setUmur(20);
        mhs.setKelas("PBO2");
        System.out.println("NIM MAHASISWA = " + dosen.getNIP());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
