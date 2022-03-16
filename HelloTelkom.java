/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellotelkom;

import java.util.Scanner;

/**
 *
 * @author JaneshPutra
 */
public class HelloTelkom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hello");
        //System.out.println("Selamat Belajar di Program Java");
        
        //int nilai_pbo, nilai_web;
        //nilai_pbo = 90;
        //nilai_web = 80;
        //System.out.println("Variabel yang terdapat dalam program :");
        //System.out.println("Nilai_pbo = "+nilai_pbo );
        //System.out.println("Nilai_web = "+nilai_web);
        
        //int bil_a, bil_b, hasil;
        //bil_a = 454;
        //bil_b = 546;
        //hasil = bil_a + bil_b;
        //System.out.print("Hasil Penjumlahan kedua bilangan : ");
        //System.out.println(hasil);
        
        //int p = 5;
        //int l = 10;
        //int t = 5;
        //System.out.println("Nialai Panjang Balok : "+p);
        //System.out.println("Nilai Lebar Balok : "+l);
        //System.out.println("Nilai Tinggi Balok : "+t);
        //System.out.println("===============================");
        //System.out.println("Menghitung Luas Permukaan Balok");
        //System.out.println("===============================");
        //System.out.println("Luas Permukaan Balok = "+((2*p*l)+(2*p*t)+(2*l*t)));
        
        Scanner myobj = new Scanner(System.in);
        System.out.print("Silhakan Pilih angka 1-3 : ");
        int angka =  myobj.nextInt();
        switch (angka) {
            case 1 :
                System.out.println("Satu");
                break;
            case 2 :
                System.out.println("Dua");
                break;
            case 3 :
                System.out.println("Tiga");
        }
    }
        
        
    }

   

