/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Arya
 */
public class Javaapplication1 {
 public static void main(String[] args) {
        Barang barang = new Barang();
        Member member = new Member();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();

        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);

        transaksi.prosesTransaksi(member, transaksi, barang);

        laporan.laporan(transaksi, barang);
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
    }
}
