Nama : Hisyam Fausta  
NIM :  20210801191  
Teknik Informatika  


## Bangun Datar

Parent class (Abstraction)
```java
public abstract class BangunDatar {

    public abstract double luas();
    public abstract double keliling();

}
```

Child class (Inheritance, Polymorphism, Encapsulation)
```java
public class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}


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

```