/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HYPE AMD
 */
import java.util.Scanner;
public class S5_ProgramReservasiKamarHotel {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data reservasi
        System.out.print("Masukkan Nama Pelanggan : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tipe Kamar (Standard/Deluxe/Suite) : ");
        String tipe = input.nextLine().trim();

        System.out.print("Masukkan Lama Menginap (malam) : ");
        int lama = input.nextInt();

        // Tentukan harga per malam berdasarkan tipe kamar
        int hargaPerMalam = 0;
        boolean tipeValid = true;
        switch (tipe.toLowerCase()) {
            case "standard" -> hargaPerMalam = 300000;
            case "deluxe"   -> hargaPerMalam = 500000;
            case "suite"    -> hargaPerMalam = 800000;
            default -> {
                System.out.println("Tipe kamar tidak valid. Menggunakan Standard.");
                hargaPerMalam = 300000;
                tipe = "Standard"; // perbaiki untuk output
                tipeValid = false;
            }
        }

        // Hitung total biaya sebelum diskon
        double totalBiaya = hargaPerMalam * lama;

        // Tentukan diskon berdasarkan durasi
        double diskonPersen = 0;
        if (lama > 5) {
            diskonPersen = 20;
        } else if (lama >= 3) {
            diskonPersen = 10;
        } else {
            diskonPersen = 0;
        }

        double potongan = totalBiaya * (diskonPersen / 100);
        double totalBayar = totalBiaya - potongan;

        // Output struk reservasi
        System.out.println("\n===== STRUK RESERVASI =====");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Tipe Kamar     : " + tipe);
        System.out.println("Lama Menginap  : " + lama + " malam");
        System.out.printf("Total Biaya    : Rp %,d\n", (int)totalBiaya);
        System.out.printf("Diskon         : Rp %,d\n", (int)potongan);
        System.out.printf("Total Bayar    : Rp %,d\n", (int)totalBayar);
        System.out.println("============================");

        input.close();
    }
    
}
