

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HYPE AMD
 */
import java.util.Scanner;
public class S2_ProgramKasirSederhana {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data pembelian
        System.out.print("Masukkan Nama Barang : ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan Harga Barang (Rp) : ");
        double harga = input.nextDouble();

        System.out.print("Masukkan Jumlah Beli : ");
        int jumlah = input.nextInt();

        // Hitung total belanja
        double totalBelanja = harga * jumlah;

        // Tentukan diskon
        double diskonPersen = 0;
        if (totalBelanja >= 500000) {
            diskonPersen = 15;
        } else if (totalBelanja >= 250000) {
            diskonPersen = 10;
        } else {
            diskonPersen = 0;
        }

        double potongan = totalBelanja * (diskonPersen / 100);
        double totalBayar = totalBelanja - potongan;

        // Output struk pembelian
        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Harga Barang   : Rp " + String.format("%,.0f", harga));
        System.out.println("Jumlah Beli    : " + jumlah);
        System.out.println("Total Belanja  : Rp " + String.format("%,.0f", totalBelanja));
        System.out.println("Diskon         : " + diskonPersen + "%");
        System.out.println("Potongan Diskon: Rp " + String.format("%,.0f", potongan));
        System.out.println("Total Bayar    : Rp " + String.format("%,.0f", totalBayar));
        System.out.println("===========================");

        input.close();
    }
    
}
