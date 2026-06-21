/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HYPE AMD
 */
import java.util.Scanner;
public class S1_ProgramHitungNilaiAkhirMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nilai Tugas (0-100) : ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis (0-100) : ");
        double kuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS (0-100) : ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS (0-100) : ");
        double uas = input.nextDouble();

        // Hitung nilai akhir berdasarkan bobot
        double nilaiAkhir = (tugas * 0.20) + (kuis * 0.15) + (uts * 0.30) + (uas * 0.35);

        // Tentukan grade
        String grade;
        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 55) {
            grade = "C";
        } else if (nilaiAkhir >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Output hasil
        System.out.println("\n===== HASIL AKHIR =====");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.printf("Nilai Akhir    : %.2f\n", nilaiAkhir);
        System.out.println("Grade          : " + grade);

        input.close();
    }
    
}
