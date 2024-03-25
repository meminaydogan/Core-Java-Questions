package week1_Variables_Scanner;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        // Kullanicidan uc farkli data turunde deger alip,
        // girilen degerleri aciklamalariyla yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sırasıyla: isiminizi - 1.Notunuzu - 2. Notunuzu Yazınız.");

        String isim = scan.nextLine();  // String "" içine yazdığımız Variabledir

        int  ilknot = scan.nextInt();   // int rakamlarla oluşturduğumuz bir Variabledir

        double ikincinot = scan.nextDouble(); // double rakamlarla oluşturduğumuz bir Variabledir int den farkı küsüratlı sayılarda kullanılır.


        System.out.print("isim: "+isim+"     ilk not: "+ilknot+"     ikinci not: "+ikincinot);
        // isim: Muhammed Emin     ilk not: 70     ikinci not: 70.6


    }
}
