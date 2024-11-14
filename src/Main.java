/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setVisible(true);
            RentalService rentalService = new RentalService(); // Inisialisasi RentalService
            new LoginController(loginGUI, rentalService); // Inisialisasi controller dengan rentalService
        }
    });
}