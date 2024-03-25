package week1_Variables_Scanner;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen değerleri değiştirilecek sayıları giriniz.");

        int degistirilecek1 = scan.nextInt();
        int degistirilecek2 = scan.nextInt();
        int boskutu = 0 ;

        System.out.println("1. sayınız: "+degistirilecek1+"    2. sayınız: "+degistirilecek2);

        boskutu = degistirilecek1;
        degistirilecek1 = 0;

        degistirilecek1 = degistirilecek2;
        degistirilecek2 = 0;

        degistirilecek2 = boskutu;

        System.out.println("1. sayınız: "+degistirilecek1+"    2. sayınız: "+degistirilecek2);


    }
}
