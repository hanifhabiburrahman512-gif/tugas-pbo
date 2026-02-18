/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author hanif
 */

import java.util.Scanner;
public class Mavenproject1 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- NOMOR 1: Operasi Aritmatika Bilangan Bulat ---
        System.out.println("=== NOMOR 1: ARITMATIKA BULAT ===");
        System.out.print("Masukkan Bilangan Bulat Pertama: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan Bilangan Bulat Kedua: ");
        int bil2 = input.nextInt();

        System.out.print("Masukkan Bilangan Bulat Ketiga: ");
        int bil3 = input.nextInt();

        System.out.println("Hasil Penjumlahan (+) = " + (bil1 + bil2 + bil3));
        System.out.println("Hasil Pengurangan (-) = " + (bil1 - bil2 - bil3));
        System.out.println("Hasil Perkalian   (*) = " + (bil1 * bil2 * bil3));
        System.out.println("Hasil Pembagian   (/) = " + (bil1 / bil2 / bil3));
        System.out.println();

        // --- NOMOR 2: Logika Beli Gorengan ---
        System.out.println("=== NOMOR 2: LOGIKA BELI GORENGAN ===");
        System.out.print("Masukkan jumlah uang Anda: ");
        int uang = input.nextInt();

        System.out.print("Apakah hari ini hujan? (true/false): ");
        boolean hujan = input.nextBoolean();

        // Ekspresi logika sesuai soal: (uang > 5000) && (!hujan)
        boolean beliGorengan = (uang > 5000) && (!hujan);
        System.out.println("Keputusan Beli Gorengan: " + beliGorengan);
        System.out.println();

        // --- NOMOR 3: Penjumlahan ASCII Karakter '1' dan '2' ---
        System.out.println("=== NOMOR 3: JUMLAH ASCII KARAKTER ===");
        char char1 = '1';
        char char2 = '2';

        int ascii1 = (int) char1;
        int ascii2 = (int) char2;
        int hasilAscii = ascii1 + ascii2;

        System.out.println("Kode ASCII dari '" + char1 + "' = " + ascii1);
        System.out.println("Kode ASCII dari '" + char2 + "' = " + ascii2);
        System.out.println("Jumlah kedua kode ASCII = " + hasilAscii);

        input.close();
    }
}
