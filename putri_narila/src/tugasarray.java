/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ACENKCOM
 */
public class tugasarray {
   
   public static void main(String[] args) {
       Scanner masuk = new Scanner(System.in);
       System.out.print("Jumlah Mahasiswa : ");
        int n=masuk.nextInt();
       String mahasiswa[][] = new String[n][4];
        for(int i= 0; i<n; i++)
     {
            System.out.println("");
            System.out.println("Data Mahasiswa ke "+(i+1));
            for(int j=0;j<1;j++)

       System.out.print("Masukkan jumlah absen: ");
       int absen = masuk.nextInt();

       System.out.print("Masukkan nilai tugas: ");
       int tugas = masuk.nextInt();

       System.out.print("Masukkan nilai UTS: ");
       int uts = masuk.nextInt();

       System.out.print("Masukkan nilai UAS: ");
       int uas = masuk.nextInt();

       double nilaiAkhir = 0.1 * absen + 0.2 * tugas + 0.3 * uts + 0.4 * uas;

       System.out.println();
       System.out.println("Jumlah absen: " + absen);
       System.out.println("Nilai tugas: " + tugas);
       System.out.println("Nilai UTS: " + uts);
       System.out.println("Nilai UAS: " + uas);
       System.out.println("Total nilai: " + nilaiAkhir);

       String grade;
       if (nilaiAkhir >= 80) {
           grade = "A";
       } else if (nilaiAkhir >= 70) {
           grade = "B";
       } else if (nilaiAkhir >= 60) {
           grade = "C";
       } else if (nilaiAkhir >= 50) {
           grade = "D";
       } else {
           grade = "E";
       }
       System.out.println("Grade: " + grade);
     }}}
   


      

