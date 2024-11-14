/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Asus
 */
public class CustomerController {
    private CustomerView view;
    private RentalService service;

    public CustomerController(CustomerView view, RentalService service) {
        this.view = view;
        this.service = service;

        // Tambahkan listener untuk interaksi pengguna
    }

    // Metode untuk menangani pencarian dan penyewaan kendaraan
}