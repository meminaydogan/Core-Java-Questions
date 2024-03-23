package week1_Variables_Scanner_DataCasting;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi ve yaşınızı giriniz.");

        String isim = scan.next();
        String soyisim = scan.next();
        int yas = scan.nextInt();

        System.out.println(isim.substring(0,1)+" "+soyisim+", "+yas);


    }
}
