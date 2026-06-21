

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HYPE AMD
 */
import java.util.Scanner;
public class S3_ProgramPengolahanNilaiMahasiswaDenganArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMahasiswa = 10;
        double[] nilai = new double[jumlahMahasiswa];

        // Input 10 nilai mahasiswa
        System.out.println("Masukkan nilai " + jumlahMahasiswa + " mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextDouble();
        }

        // Inisialisasi variabel untuk tertinggi, terendah, dan total
        double tertinggi = nilai[0];
        double terendah = nilai[0];
        double total = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
            total += nilai[i];
        }

        double rataRata = total / jumlahMahasiswa;

        // Output hasil
        System.out.println("\n===== HASIL PENGOLAHAN =====");
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);
        System.out.println("Rata-rata       : " + rataRata);

        // Tampilkan nilai di atas rata-rata
        System.out.println("Nilai di atas rata-rata:");
        boolean adaNilaiDiAtas = false;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilai[i] > rataRata) {
                System.out.println(nilai[i]);
                adaNilaiDiAtas = true;
            }
        }

        if (!adaNilaiDiAtas) {
            System.out.println("Tidak ada nilai yang di atas rata-rata.");
        }

        input.close();
    }
    
}
