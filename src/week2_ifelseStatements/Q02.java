package week2_ifelseStatements;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz.");

        String harf = scan.next();

        if (harf.equalsIgnoreCase("a")){
            System.out.println("Aralık veya Ağustos");
        } else if (harf.equalsIgnoreCase("k")) {
            System.out.println("Kasım");
        }else if (harf.equalsIgnoreCase("e")) {
            System.out.println("Eylül veya Ekim");
        }else if (harf.equalsIgnoreCase("t")) {
            System.out.println("Temmuz");
        }else if (harf.equalsIgnoreCase("h")) {
            System.out.println("Haziran");
        }else if (harf.equalsIgnoreCase("m")) {
            System.out.println("Mart veya mayıs");
        }else if (harf.equalsIgnoreCase("n")) {
            System.out.println("Nisan");
        }else if (harf.equalsIgnoreCase("ş")) {
            System.out.println("Şubat");
        }else if (harf.equalsIgnoreCase("o")) {
            System.out.println("Ocak");
        }else System.out.println("Hatalı giriş yaptınız geçerli bir harf giriniz.");


    }
}
