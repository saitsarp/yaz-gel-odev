package com.odevyazilim.odevv.islemler;

public class Hesaplama {

    static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    static int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }
    static int bolme(int sayi1, int sayi2) {
        return sayi1 / sayi2;
    }
    static int carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }
    

    static int topla(int ... sayilar) {
        int toplamSonuc = 0;
        for (int sayi : sayilar) {
            toplamSonuc += sayi;
        }
        return toplamSonuc;
    }

    

    public static void main(String[] args) {

        int sonuc = topla(243,654);
        int sonuccikarma = cikar(700,424);
        int sonucbolme = bolme(600,2);
        int sonuccarpma = carpma(24,30);

        // System.out.printf("%d + %d = %d %n",243,654,sonuc);

        System.out.println("243 + 654 = " + sonuc);
        System.out.println("700 - 424 = " + sonuccikarma);
        System.out.println("600 / 2 = " + sonucbolme);
        System.out.println("24 * 30 = " + sonuccarpma);
        

    }

}
