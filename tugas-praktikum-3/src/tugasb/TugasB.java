/*
Nama : Hisyam Fausta
NIM : 20210801191
 */
package tugasb;

import java.util.Scanner;

public class TugasB {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int angka = s.nextInt();

        if (angka == 0) {
            System.out.println("Angka yang Anda masukan adalah 0!");
        } else if (angka > 0) {
            System.out.println("Angka yang Anda masukan adalah bilangan positif!");
        } else {
            System.out.println("Angka yang Anda masukan adalah bilangan negatif!");
        }
    }

}
