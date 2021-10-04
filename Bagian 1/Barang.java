package com.company;

public class Barang {
    private String idBarang;
    private String namaBarang;
    private double hargaBarang;

    public Barang(String idBarang, String namaBarang, double hargaBarang){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public Barang(String idBarang, String namaBarang){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
    }

    public String getIdBarang(){
        return idBarang;
    }

    public String getNamaBarang(){
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }

    public double getHargaBarang(){
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang){
        this.hargaBarang = hargaBarang;
    }

    public void printData(){
        System.out.println("idBarang: " + this.getIdBarang());
        System.out.println("Nama Barang: " + this.getNamaBarang());
        System.out.println("Harga Barang: " + this.getHargaBarang());
    }

}
