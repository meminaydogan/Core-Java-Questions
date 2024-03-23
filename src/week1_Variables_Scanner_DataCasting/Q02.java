package week1_Variables_Scanner_DataCasting;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        // - Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sırasıyla bir double birde int sayı giriniz.");
        double sayidouble = scan.nextDouble();
        int sayiint = scan.nextInt();

        System.out.println("iki sayının toplamı: "+(sayiint+sayidouble));
        System.out.println("iki sayının çarpımı: "+(sayidouble*sayiint));
    }
}
