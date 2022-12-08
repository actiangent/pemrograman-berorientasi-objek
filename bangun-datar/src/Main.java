/*
Nama : Hisyam Fausta
NIM :  20210801191
Teknik Informatika
 */
public class Main {

    public static void main(String[] args) {

        PersegiPanjang persegiPanjang = new PersegiPanjang(6.9, 7.8);
        Segitiga segitiga = new Segitiga(9.0, 12.0);

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());

    }

}
