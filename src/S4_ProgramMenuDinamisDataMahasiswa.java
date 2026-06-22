/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HYPE AMD
 */
import java.util.ArrayList;
import java.util.Scanner;

public class S4_ProgramMenuDinamisDataMahasiswa {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nimList = new ArrayList<>();
        ArrayList<String> namaList = new ArrayList<>();
        ArrayList<String> prodiList = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Cari Data Mahasiswa Berdasarkan NIM");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine(); // bersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM : ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Program Studi : ");
                    String prodi = input.nextLine();
                    nimList.add(nim);
                    namaList.add(nama);
                    prodiList.add(prodi);
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;

                case 2:
                    if (nimList.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        System.out.println("===== DATA MAHASISWA =====");
                        for (int i = 0; i < nimList.size(); i++) {
                            System.out.println("Mahasiswa ke-" + (i + 1));
                            System.out.println("NIM  : " + nimList.get(i));
                            System.out.println("Nama : " + namaList.get(i));
                            System.out.println("Prodi: " + prodiList.get(i));
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    if (nimList.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        System.out.print("Masukkan NIM yang dicari : ");
                        String cari = input.nextLine();
                        boolean ditemukan = false;
                        for (int i = 0; i < nimList.size(); i++) {
                            if (nimList.get(i).equals(cari)) {
                                System.out.println("Data ditemukan:");
                                System.out.println("NIM  : " + nimList.get(i));
                                System.out.println("Nama : " + namaList.get(i));
                                System.out.println("Prodi: " + prodiList.get(i));
                                ditemukan = true;
                                break;
                            }
                        }
                        if (!ditemukan) {
                            System.out.println("Mahasiswa dengan NIM " + cari + " tidak ditemukan.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        input.close();
    }
    
}
