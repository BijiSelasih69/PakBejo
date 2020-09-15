/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakbejo;

/**
 *
 * @author BijiSelasih69
 */
public class PakBejo {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Keramik kA = new Keramik();
        kA.ukuran = 30*30;
        kA.harga = 54000;
        kA.isi = 10;
        kA.totalHarga();
        
        Keramik kB = new Keramik();
        kB.ukuran = 40*40;
        kB.harga = 65000;
        kB.isi = 5;
        kB.totalHarga();
        
        Keramik kC = new Keramik();
        kC.ukuran = 30*40;
        kC.harga = 60000;
        kC.isi = 8;
        kC.totalHarga();
        // TODO code application logic here
    }
    
}
