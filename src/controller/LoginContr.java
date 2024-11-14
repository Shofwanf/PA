/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class LoginController {
    private LoginGUI view;
    private Customer[] customers; // Simulasi database pelanggan
    private Admin[] admins; // Simulasi database admin

    public LoginController(LoginGUI view) {
        this.view = view;

        // Inisialisasi data pelanggan dan admin
        customers = new Customer[] {
            new Customer("customer1", "password1"),
            new Customer("customer2", "password2")
        };
        
        admins = new Admin[] {
            new Admin("admin1", "adminpass1"),
            new Admin("admin2", "adminpass2")
        };

        // Tambahkan listener untuk tombol login
        this.view.getLoginButton().addActionListener(e -> login());
    }

    private void login() {
        String username = view.getTxUsername().getText();
        String password = new String(view.getTxPw().getPassword());

        // Cek apakah pengguna adalah customer
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                JOptionPane.showMessageDialog(view, "Login berhasil sebagai Customer!");
                // Arahkan ke CustomerView
                new CustomerView().setVisible(true);
                view.dispose(); // Tutup tampilan login
                return;
            }
        }

        // Cek apakah pengguna adalah admin
        for (Admin admin : admins) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                JOptionPane.showMessageDialog(view, "Login berhasil sebagai Admin!");
                // Arahkan ke AdminView
                new AdminView().setVisible(true);
                view.dispose(); // Tutup tampilan login
                return;
            }
        }

        // Jika username atau password salah
        JOptionPane.showMessageDialog(view, "Username atau Password salah!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}