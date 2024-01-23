/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester;

import java.util.Scanner;

/**
 *
 * @author Arya
 */
public class Home {
      public static void main(String[] args) {
           Scanner input = new Scanner(System.in); 
        Pewarisan bangunDatar = new Pewarisan();
        
        
        Persegi persegi = new Persegi();
          System.out.print("Masukan Nilai Sisi Persegi : ");
          persegi.sisi = input.nextInt();
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukan Nilai Rusuk Lingkaran : ");
        lingkaran.r = input.nextInt();
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.print("Masukan Nilai Panjang PersegiPanjang : ");
        persegiPanjang.panjang = input.nextInt();
        System.out.print("Masukan Nilai Lebar PersegiPanjang : ");
        persegiPanjang.lebar = input.nextInt();
        
        Segitiga mSegitiga = new Segitiga();
        System.out.print("Masukan Nilai Alas Segitiga : ");
        mSegitiga.alas = input.nextInt();
        System.out.print("Masukan Nilai Tinggi Segitiga : ");
        mSegitiga.tinggi = input.nextInt();
        
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
