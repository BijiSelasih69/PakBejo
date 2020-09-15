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
public class Keramik {
    int ukuran;
    int harga;
    int isi;
    double luas = 10000;
    /* Luas dalam bentuk cm2 */
    
    void totalHarga(){
        int totalHarga;
        int box;
        float luasKeramik;
        /* Total luas keramik dalam 1 box */
        box = this.ukuran * this.isi;
        luasKeramik = (float) (box / this.luas);
        totalHarga = (int) (100 / luasKeramik)* this.harga;
        System.out.println("Total Harga : Rp." + totalHarga);
        
    }
    
}
