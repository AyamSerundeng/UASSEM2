
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void display() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
    }
}

/**
 *
 * @author HYPE AMD
 */
public class S4 {
private static ArrayList<Mahasiswa> daftar = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Cari Data Mahasiswa Berdasarkan NIM");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    cariData();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }

    private static void inputData() {
        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Program Studi : ");
        String prodi = input.nextLine();

        Mahasiswa m = new Mahasiswa(nim, nama, prodi);
        daftar.add(m);
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    private static void tampilkanData() {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }
        System.out.println("===== DATA MAHASISWA =====");
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            daftar.get(i).display();
            System.out.println();
        }
    }

    private static void cariData() {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }
        System.out.print("Masukkan NIM yang dicari : ");
        String cariNim = input.nextLine();
        boolean ditemukan = false;
        for (Mahasiswa m : daftar) {
            if (m.nim.equals(cariNim)) {
                System.out.println("Data ditemukan:");
                m.display();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + cariNim + " tidak ditemukan.");
        }
    }
    
}
