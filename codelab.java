package org.example;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class codelab {
    public static void main(String[] args) {
        String Name;
        String jenisKelamin;
        Scanner objInput = new Scanner(System.in);

        System.out.print("Nama Anda: ");
        Name = objInput.nextLine();

        System.out.print("Jenis Kelamin(L/P): ");
        jenisKelamin = objInput.nextLine();

        System.out.print("Tanggal lahir (yyyy-mm-dd): ");
        String umur = objInput.nextLine();

        System.out.println("Nama: " + Name);
        if (jenisKelamin.equalsIgnoreCase("L")) {
           System.out.println("Jenis kelamin: Laki-laki");
        } else if (jenisKelamin.equalsIgnoreCase("P")) {
            System.out.println("Jenis kelamin: Perempuan");
        }else {
            System.out.println("Jenis kelamin tidak di temukan");
        }

        LocalDate usia = LocalDate.parse(umur);

        LocalDate umurSekarang = LocalDate.now();

        Period periods = Period.between(usia, umurSekarang);
        System.out.println("Umur Anda: " + periods.getYears() + " tahun " + periods.getMonths() + "bulan");
    }
}//
