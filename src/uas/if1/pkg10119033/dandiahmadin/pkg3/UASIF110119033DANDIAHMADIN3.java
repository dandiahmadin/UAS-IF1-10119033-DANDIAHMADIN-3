/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119033.dandiahmadin.pkg3;

import java.util.Scanner;

/**
 *
 * @author 
 * NIM : 10119033
 * Nama : Dandi Ahmadin
 * kelas : IF-1
 * Tanggal : 20 Februari 2021
 * Hari : Sabtu
 */
public class UASIF110119033DANDIAHMADIN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan Umur Anda : ");
        int umur = scan.nextInt();
        boolean dewasa = false;
        
        if(umur >= 17) {
            dewasa = true;
        }
        
        System.out.println("Status Dewasa: " + dewasa);
    }
    
}
