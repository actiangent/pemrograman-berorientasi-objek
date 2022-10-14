/*
Nama : Hisyam Fausta
NIM : 20210801191
 */
package tugasc;

import java.util.Scanner;

public class TugasC {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int angka = s.nextInt();

        String p = angka % 2 == 0 ? "Genap" : "Ganjil";

        System.out.println("Bilangan yang Anda masukan adalah " + p);
    }

}
