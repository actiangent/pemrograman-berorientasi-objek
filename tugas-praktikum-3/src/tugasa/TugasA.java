/*
Nama : Hisyam Fausta
NIM : 20210801191
 */
package tugasa;

import java.util.Scanner;

public class TugasA {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Masukan nilai (angka): ");
        int nilai = s.nextInt();

        if (nilai <= 100 && nilai >= 85) {
            System.out.println("Anda mendapat nilai A!");
        } else if (nilai <= 84 && nilai >= 71) {
            System.out.println("Anda mendapat nilai B!");
        } else if (nilai <= 70 && nilai >= 61) {
            System.out.println("Anda mendapat nilai C!");
        } else if (nilai <= 60 && nilai >= 51) {
            System.out.println("Anda mendapat nilai D!");
        } else {
            System.out.println("Anda mendapat nilai E!");
        }
    }

}
