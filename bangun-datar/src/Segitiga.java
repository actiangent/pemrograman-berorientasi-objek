/*
Nama : Hisyam Fausta
NIM :  20210801191
Teknik Informatika
 */
public class Segitiga extends BangunDatar {

    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double keliling() {
        return alas + tinggi + (Math.sqrt(Math.pow(tinggi, 2) + Math.pow(alas, 2)));
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
