/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenciler;

import ilkproje.Ogrenci;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elifnur
 */
public class main {

    static Scanner okuyucu = new Scanner(System.in);
    static ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public static void main(String[] args) {
        int secim = -1;
        while (secim != 0) {
            System.out.println("secim yapınız");
            System.out.println("1.öğrenci ekle");
            System.out.println("2.öğrenci sil");
            System.out.println("3.sınıf listele");
            System.out.println("4.not gir");
            System.out.println("5. ortalamayı göster");
            System.out.println("0. çıkış");
            secim = okuyucu.nextInt();
            switch (secim) {
                case 1:
                    ogrenciEkle();
                    break;
                case 2:
                    ogrenciSil();
                    break;
                case 3:
                    ogrenciListele();
                    break;
                case 4:
                    ogrencinotuGir();
                    break;
                case 5:
                    ortalamaGoster();
                    break;
            }
        }

    }

    private static void ogrenciEkle() {
        Ogrenci ogrenci = new Ogrenci();
        System.out.println("öğrenci no giriniz  ");
        ogrenci.ogrenciNo = okuyucu.nextInt();
        System.out.println("öğrenci adı giriniz");
        ogrenci.ad = okuyucu.next();
        ogrenciler.add(ogrenci);

    }

    private static void ogrenciSil() {
        System.out.println("silinecek öğrencinin numarası");
        int ogrencino = okuyucu.nextInt();
        for (int i = 0; i < ogrenciler.size(); i++) {
            if (ogrencino == ogrenciler.get(i).ogrenciNo) {
                ogrenciler.remove(i);
                System.out.println("öğrenci silindi");
                return;

            }
        }
        System.out.println("öğrenci bulunamadı");

    }

    private static void ogrenciListele() {
        for (Ogrenci ogrenci : ogrenciler) {

            ogrenci.ogrenciYazdir();

        }

    }

    private static void ogrencinotuGir() {
        System.out.println("öğrenci numarası giriniz");
        int ogrencino = okuyucu.nextInt();
        System.out.println("öğrencini vize ve final notu giriniz");
        double vize = okuyucu.nextDouble();
        double finall = okuyucu.nextDouble();
        for (int i = 0; i < ogrenciler.size(); i++) {
            if (ogrencino == ogrenciler.get(i).ogrenciNo) {
                ogrenciler.get(i).vize = vize;
                ogrenciler.get(i).finall = finall;
                return;
            }
        }
        System.out.println("öğrenci bulunamadı");
    }

    private static void ortalamaGoster() {
        double toplamnot=0.0;
        
    for(Ogrenci ogrenci : ogrenciler){
        toplamnot+=ogrenci.ogrenciOrtalama();
        
        }
        System.out.println("ortalama="+toplamnot/ogrenciler.size());
    }
}
