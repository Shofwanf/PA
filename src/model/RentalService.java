/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
// RentalService.java
public class RentalService {
    private List<Kendaraan> daftarKendaraan;

    public RentalService() {
        daftarKendaraan = new ArrayList<>();
        // Tambahkan beberapa kendaraan mobil ke daftar
        daftarKendaraan.add(new Kendaraan("Toyota Avanza", 7));
        daftarKendaraan.add(new Kendaraan("Honda CRV", 5));
        daftarKendaraan.add(new Kendaraan("Suzuki Ertiga", 7));
        // Tambahkan kendaraan lainnya sesuai kebutuhan
    }

    public List<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }

    public List<Kendaraan> cariKendaraan(String nama) {
        List<Kendaraan> hasil = new ArrayList<>();
        for (Kendaraan kendaraan : daftarKendaraan) {
            if (kendaraan.getNama().toLowerCase().contains(nama.toLowerCase())) {
                hasil.add(kendaraan);
            }
        }
        return hasil;
    }

    public void sewaKendaraan(Kendaraan kendaraan) {
        // Implementasi logika penyewaan
    }
}