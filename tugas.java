package org.example;
import java.util.Scanner;// utk mengimport class scanner
import java.lang.*;

public class tugas {
    public static void main(String[] args) {
       while (true){//utk menjalankan kode yg ada di dlm ny jika kondisinya benar
           System.out.println("=== Lybrary System===");
           System.out.println("1. Login as Student");
           System.out.println("2. Login as Admin");
           System.out.println("3. Exit");
           System.out.print("Choose option(1-3): ");
           Scanner objInput = new Scanner(System.in);//di sini kita buat sebuah objek Scanner dengan nama objInput:
           int pilihan = objInput.nextInt();// kode utk menginputkan sebuah nilai int ke dlm variabrel pilihan
           String NIM, Admin,  Password;


           switch (pilihan){// utk percabangan lain dri if else
               case 1:
                   Scanner scannim = new Scanner(System.in);// = scanner objinput
                   System.out.print("Enter your NIM: ");
                   NIM = scannim.nextLine();//kode utk mengimputkan sebuah nilai string ke variabel nim
                   if (NIM.length() == 15 ){// Length = utk menghitung pjg karakter nim
                       System.out.println("Succesfull Login as student");
                   }else {
                       System.out.println("User not found");
                   }break;
               case 2:
                   Scanner scanadmin = new Scanner(System.in);// = scanner objinput
                   System.out.print("Enter your user name(admin): ");
                   Admin = scanadmin.nextLine();// = variaabel nim
                   System.out.print("Enter your password(admln): ");
                   Password = scanadmin.nextLine();
                   if (Admin.equals("admin")&&Password.equals("admln")){// jika variabel Admin = admin dan pass = admln mka dia akan mnjlnkn kode di bawahx
                       System.out.println("Succesfull Login as admin");
                   }else {
                       System.out.println("admin user not found");
                   }break;
               case 3:
                   System.out.println("adois");
                   System.exit(0);// utk keluar dri program
                   break;
               default:
                   System.out.println("Tidak ada pilihan");
           }
       }
    }
}