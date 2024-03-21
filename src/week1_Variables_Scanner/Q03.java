package week1_Variables_Scanner;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

     /* Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir. */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen İsminizi");
        String isim = scan.nextLine();

        System.out.println("Lütfen Soyisiminizi Giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas = scan.nextInt();


        System.out.println("İsminiz: "+isim+"\nSoyisim: "+soyisim+"\nYaş: "+yas );

        System.out.println("Kaydınız başarıyla tamamlanmıştır.");


    }
}
