/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

/**
 *
 * @author elifnur
 */
public class Urun {

    int barkod;
    String marka;
    double alisfiyat;
    double satisfiyat;
    int stok;
    double toplamkar;

    public void satisYap(int adet) {
        if (stok > adet) {
            stok -= adet;
            toplamkar += adet * karHesapla();
            System.out.println("satış başarıyla yapıldı");
        } else {
            System.out.println("satış yapılamadı");
        }
    }

    public double karHesapla() {
        return satisfiyat - alisfiyat;
    }
    public void stokEkle(int adet){
        stok+=adet;
    }
    public void indirimYap(double yuzde){
        satisfiyat-=0.1*yuzde;
    }
    public void zamYap(double yuzde){
        satisfiyat+=0.1*yuzde;
        
    }
}
