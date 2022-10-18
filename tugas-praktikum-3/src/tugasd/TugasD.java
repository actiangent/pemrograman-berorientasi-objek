package tugasd;

import java.util.Scanner;

public class TugasD {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int menuOption;

        int basePrice = 100000;
        System.out.println("SELAMAT DATANG DI RESTAURANT DAPUR LARISA\nDISINI MENYEDIAKAN ANEKA MENU\n\n1. AYAM BAKAR\n2. PECEL LELE\n3. SEAFOOD (KERANG-KERANGAN, KEPITING, UDANG) SAUS PADANG\n4. NASI GORENG AYAM\n5. NASI GORENG SEAFOOD\n6. MIE GORENG SPESIAL");

        do {
            System.out.println("Pilih menu: ");
            menuOption = s.nextInt();
        } while (!(menuOption >= 1 && menuOption <= 6));

        int totalPrice = basePrice * menuOption;
        double tax = totalPrice * 0.1;
        int priceToPay = totalPrice + (int) tax;
        System.out.println("Jumlah Harga : Rp. " + totalPrice);
        System.out.println("PPN : " + (int) tax);
        System.out.println("Total Harga : Rp. " + priceToPay);

        while (true) {
            System.out.println("Masukan Jumlah Bayar: ");
            int pay = s.nextInt();
            System.out.println("Jumlah Bayar : Rp. " + pay);

            if (pay >= priceToPay) {
                System.out.println("\nKembalian : Rp. " + (pay - priceToPay));
                break;
            } else {
                System.out.println("\nDuit pembayaran Anda kurang!");
            }
        }
    }

}
