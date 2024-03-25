package week1_Variables_Scanner;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanını yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sırasıyla dikdörtgenin Uzun ve Kısa kenarlarınız yazınız...");

        int uzunkenar = scan.nextInt();
        int kisakenar = scan.nextInt();

        System.out.println("Dikdörtgenin alanı = "+((uzunkenar*2)+(kisakenar*2)));


    }
}
