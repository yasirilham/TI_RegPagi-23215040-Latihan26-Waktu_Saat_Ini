/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Membuat Program Menampilkan Waktu Saat Ini
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Latihan26_Waktu_Saat_Ini {
   public static void main(String[] args) {
        Date sekarang = new Date();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));
        String tanggalFormatted = formatTanggal.format(sekarang);
        System.out.println("Hari ini adalah hari : " + tanggalFormatted);
    }
}
