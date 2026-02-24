/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewClass;
/**
 *
 * @author hanif
 */
import java.util.Scanner;

public class NewClass{
    
    public static boolean isVokal(char c) {
        return c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o';
    }
    
    public static boolean isKonsonan(char c) {
        return c >= 'a' && c <= 'z' && !isVokal(c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tiga huruf kecil tanpa spasi: ");
        String huruf = input.next();
        
        if (huruf.length() != 3) {
            System.out.println("Input harus tepat 3 huruf!");
        } else {
            char h1 = huruf.charAt(0);
            char h2 = huruf.charAt(1);
            char h3 = huruf.charAt(2);
            
            if (isKonsonan(h1) && isVokal(h2) && isKonsonan(h3)) {
                System.out.println("Memenuhi pola Konsonan-Vokal-Konsonan (K-V-K)");
            } else {
                System.out.println("Tidak memenuhi pola K-V-K");
            }
        }
        
        input.close();
    }
}