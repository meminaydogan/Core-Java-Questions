package week2_ifelseStatements;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int sayi = scan.nextInt();

        if (sayi % 5 == 0){
            System.out.println("Sayi 5’in tam katıdır.");
        } else {
            System.out.println("Sayi 5’in tam kati değildir.");
        }
    }
}
