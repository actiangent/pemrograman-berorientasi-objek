/*
Nama : Hisyam Fausta
NIM : 20210801191
 */

import java.util.Scanner;

public class TugasPraktikum2 {

    public static void main(String[] args) {
        int angkaPertama, angkaKedua, penjumlahan, pengurangan, perkalian, modulo;
        double pembagian;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukan angka pertama: ");
            angkaPertama = scanner.nextInt();
            System.out.println("Masukan angka kedua: ");
            angkaKedua = scanner.nextInt();
        }

        System.out.println();

        penjumlahan = angkaPertama + angkaKedua;
        pengurangan = angkaPertama - angkaKedua;
        modulo = angkaPertama % angkaKedua;
        perkalian = angkaPertama * angkaKedua;
        pembagian = (double) angkaPertama / angkaKedua;

        System.out.println("Penjumlahan : " + angkaPertama + " + " + angkaKedua + " = " + penjumlahan);
        System.out.println("Pengurangan : " + angkaPertama + " - " + angkaKedua + " = " + pengurangan);
        System.out.println("Perkalian : " + angkaPertama + " * " + angkaKedua + " = " + perkalian);
        System.out.println("Pembagian : " + angkaPertama + " / " + angkaKedua + " = " + pembagian);
        System.out.println("Modulo : " + angkaPertama + " % " + angkaKedua + " = " + modulo);

        boolean logicStatement1 = penjumlahan % 2 >= pembagian % 2 && modulo % 2 <= perkalian % 2;
        boolean logicStatement2 = perkalian % 2 == pengurangan || pembagian % 4 == pengurangan; // salah soal
        boolean logicStatement3 = penjumlahan <= pengurangan + pembagian && perkalian >= modulo + pengurangan;
        boolean logicStatement4 = !(perkalian > penjumlahan) && pengurangan < pembagian;
        boolean logicStatement5 = penjumlahan + perkalian >= (pengurangan++) + modulo;

        System.out.println();

        System.out.println("penjumlahan % 2 >= pembagian % 2 && modulo % 2 <= perkalian % 2 -> " + logicStatement1);
        System.out.println("perkalian % 2 == pengurangan || pembagian % 4 == pengurangan -> " + logicStatement2);
        System.out.println("penjumlahan <= pengurangan + pembagian && perkalian >= modulo + pengurangan -> " + logicStatement3);
        System.out.println("!(perkalian > penjumlahan) && pengurangan < pembagian -> " + logicStatement4);
        System.out.println("penjumlahan + perkalian >= (pengurangan++) + modulo -> " + logicStatement5);
    }

}
