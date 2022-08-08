package org.example;


//Membuat Rumus Segitiga

public class Segitiga {
    private int alas;
    private int tinggi;


    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }


    public double getLuas() {
        double luas = this.alas*this.tinggi/2;
        return luas;
    }
}
