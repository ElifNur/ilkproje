/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elifnur
 */
public class anametod {

    static ArrayList<Urun> urunler = new ArrayList<>();
    static Scanner okuyucu = new Scanner(System.in);

    public static void main() {
        int secim = -1;
        while (secim != 0) {
            System.out.println("1.yeni ürün ekle");
            System.out.println("2.ürüne zam yap");
            System.out.println("3.ürüne indirim yap");
            System.out.println("4.stoğa ekle");
            System.out.println("5.son kullanma tarihi");
            secim = okuyucu.nextInt();
            switch (secim) {
                case 1:
                    urunEkle();
                    break;
                case 2:
                    zamYap();
                    break;
                case 3:
                    indirimYap();
                    break;
                case 4:
                    stogaEkle();
                    break;
                case 5:
                    SKThesapla();
                    break;
            }

        }

    }

    private static void urunEkle() {

        System.out.println("1 gıda malzemesi geldi");
        System.out.println("2 bilgisayar mazemesi geldi");
        int sayac = okuyucu.nextInt();
        if (sayac == 1) {
            GidaMal gida = new GidaMal();
            System.out.println("ürünün alış fiyatını giriniz");
            gida.alisfiyat = okuyucu.nextDouble();
            System.out.println("ürünün satış fiyatını giriniz");
            gida.satisfiyat = okuyucu.nextDouble();
            System.out.println("ürünün barkotunu giriniz");
            gida.barkod = okuyucu.nextInt();
            System.out.println("ürünün markasını girinniz");
            gida.marka = okuyucu.next();
            System.out.println("ürünün kaç tane olduğunu giriniz");
            gida.stok = okuyucu.nextInt();
            System.out.println("ürünün türünü girriniz");
            gida.tur = okuyucu.next();
            System.out.println("ürünün son kullanma tarihi girininz");
            gida.tarih = okuyucu.nextInt();
            System.out.println("zararlı olup olmadığını giriniz");
            gida.zararlimi = okuyucu.nextBoolean();
            urunler.add(gida);
        } else {
            BilMal bil = new BilMal();
            GidaMal gida = new GidaMal();
            System.out.println("ürünün alış fiyatını giriniz");
            bil.alisfiyat = okuyucu.nextDouble();
            System.out.println("ürünün satış fiyatını giriniz");
            bil.satisfiyat = okuyucu.nextDouble();
            System.out.println("ürünün barkotunu giriniz");
            bil.barkod = okuyucu.nextInt();
            System.out.println("ürünün markasını girinniz");
            bil.marka = okuyucu.next();
            System.out.println("ürünün kaç tane olduğunu giriniz");
            bil.stok = okuyucu.nextInt();
            System.out.println("ürünün türünü giriniz");
            bil.tur = okuyucu.next();
            System.out.println("ürünün giriş tipi giriniz ");
            bil.giristipi = okuyucu.next();
            System.out.println("ürünün rengi giriniz ");
            bil.renk = okuyucu.next();
            urunler.add(bil);

        }
    }

    private static void zamYap() {

        System.out.println("ne kadar zam yapılacak");
        double yuzde = okuyucu.nextDouble();
        for (int i = 0; i < urunler.size(); i++) {
            urunler.get(i).zamYap(yuzde);

        }
    }

    private static void indirimYap() {

        System.out.println("ne kadar indirim yapılacak");
        double yuzde = okuyucu.nextDouble();
        for (int i = 0; i < urunler.size(); i++) {
            urunler.get(i).indirimYap(yuzde);
        }
    }

    private static void stogaEkle() {
        System.out.println("ürünün bankotunu giriniz");
        int barknotu = okuyucu.nextInt();

        System.out.println("ne kadar ürün geldi");
        int adet = okuyucu.nextInt();
        for (int i = 0; i < urunler.size(); i++) {
            if (barknotu == urunler.get(i).barkod) {
                urunler.get(i).stok += adet;
                return;

            }

        }
        System.out.println("ürün bulunamadı");
    }

    private static void SKThesapla() {
        System.out.println("ürünün barknotu girininz");
        int barknotu = okuyucu.nextInt();
        for(int i=0;i<urunler.size();i++){
            if(barknotu==urunler.get(i).barkod){
               if(urunler.get(i) instanceof GidaMal){
                   urunler.get(i).
               }
            }
        }

    }

}
