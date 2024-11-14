/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class Kendaraan {
    private String nama;
    private int kapasitas;

    public Kendaraan(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
    }
    public void setNama(String nama) { 
        this.nama = nama;
    }
    // Getter dan Setter
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    public String getNama() {
        return nama;
    }
    public int getKapasitas() { 
        return kapasitas; }
}