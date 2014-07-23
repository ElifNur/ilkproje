/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ilkproje;

/**
 *
 * @author gurhan
 */

public class Ogrenci {
    public int ogrenciNo;
    public String ad;
    public double vize;
    public double finall;
    
    public Ogrenci(){
        System.out.println("bos yapılandırıcı calıstı");
    }
    
    public Ogrenci(int gelenOgrenciNo, String gelenAd, double gelenVize, double gelenFinal){
        System.out.println("dolu yapılandırıcı calıstı");
        ogrenciNo = gelenOgrenciNo;
        ad = gelenAd;
        vize = gelenVize;
        finall = gelenFinal;
    }
    
    public void ogrenciYazdir(){
        System.out.println("ad: " + ad + " no : " + ogrenciNo + " vize: " + vize + "final :" + finall);
    }
    public double ogrenciOrtalama() {
        return 0.4*vize+0.6*finall;
    }
}
