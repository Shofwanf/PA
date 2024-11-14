/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Asus
 */
public class AdminController {
    private AdminView view;
    private RentalService service;

    public AdminController(AdminView view, RentalService service) {
        this.view = view;
        this.service = service;

        // Tambahkan listener untuk interaksi admin
    }

    // Metode untuk mengelola data kendaraan dan pelanggan
}