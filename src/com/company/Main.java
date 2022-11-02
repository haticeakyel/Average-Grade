package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunuz nedir? -->");
        matematik = scanner.nextInt();

        System.out.println("Fizik notunuz nedir? -->");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunuz nedir? -->");
        kimya = scanner.nextInt();

        System.out.println("Turkce notunuz nedir? -->");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunuz nedir? -->");
        tarih = scanner.nextInt();

        System.out.println("Muzik notunuz nedir? -->");
        muzik = scanner.nextInt();

        double toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam / 6;

        System.out.println("Ortalamanız: " + ort);
        String karar = (ort<=60) ? "Kaldınız..." : "Gectiniz...";
        System.out.println(karar);
    }
}
