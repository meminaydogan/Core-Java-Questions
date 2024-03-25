package week2_ifelseStatements;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        // sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz.");

        int sayi = scan.nextInt();


        if (sayi % 3 == 0){
            System.out.println("3 ile eşit bölünür.");
        }if (sayi % 5 ==0) {
            System.out.println("5 ile eşit bölünür.");
        } else {
            System.out.println("ikisinede bölünmez");
        }

    }
}
