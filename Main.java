package com.cabang;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
   
   System.out.println("•••JENIS JENIS PERCABANGAN•••");
   System.out.println("1.percabangan IF");
   System.out.println("2.percabangan IF/ELSE");
   System.out.println("percabangan IF/ELSE/IF atau SWITCH CASE");
   
   System.out.println("•••PERCABANGAN IF•••");
   
   int belanja = 0;
   Scanner scan = new Scanner(System.in);
   // mengambil input
   System.out.println("Total belanja: Rp ");
   belanja = scan.nextInt();
   
   // cek apakah dia belanja di atas 10000
   if (belanja > 100000){
     System.out.println("Selamat anda mendapatkan hadiah: ");
   }
     System.out.println("Zonk");
     
     System.out.println("•••PERCABANGAN IF/ELSE•••");
     int nilai;
     String nama;
     
     // mengambil input
     Scanner scn = new Scanner(System.in);
     System.out.println("Nama : ");
     nama = scn.nextLine();
     System.out.println("Nilai : ");
     nilai = scn.nextInt();
     
     // cek apakah dia lulus atau tidak
     if (nilai > 60){
       System.out.println("Selamat " + nama + " anda lulus");
     } else {
       System.out.println("Mohon maaf " + nama + " anda tidak lulus");
     }
       
     System.out.println("•••PERCABANGAN IF ELSE DAN SWITCH CASE•••");
     int nilaimu;
     String grade;
     
     // input
     Scanner ipk = new Scanner(System.in);
     System.out.println("Inputkan nilaimi: ");
     nilaimu = ipk.nextInt();
     
     // hitung gradenya
     if (nilaimu >= 100){
       grade = "A";
     } else if (nilaimu >= 90){
       grade = "B";
     } else if (nilaimu >= 80){
       grade = "C";
     } else if (nilaimu >= 70){
       grade = "E";
     }
  }
}
