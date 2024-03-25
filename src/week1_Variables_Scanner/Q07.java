package week1_Variables_Scanner;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        //Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 3 adet tam sayı giriniz.");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();

        double ortalama  = (sayi1+sayi2+sayi3)/3;

        System.out.println(ortalama);

    }
}
