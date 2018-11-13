package pkg10117045.alifhermawan.tugas.oak;

import java.util.Scanner;
/**
 *
 * @author 
 * Nama : Alif Hermawan
 * NIM : 10117045
 * Kelas : IF-2
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan Binarymultiplication
 */

public class Utama {

    public static void main(String[] args) {
        int x;
        int y;
        char lagi;
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Operasi operation = new Operasi();

        do {
            System.out.println("Nama : Alif Hermawan");
            System.out.println("NIM : 10117045");
            System.out.println("Kelas : IF-2");
            System.out.println("Tugas Mata Kuliah OAK");
            System.out.println("");
            System.out.println("===== MULTIPLICATION (Positif) ======");
            System.out.print("Multiplicated (M) : ");
            x = scn1.nextInt();
            System.out.print("Multiplier   (Q)  : ");
            y = scn2.nextInt();
            System.out.println("\nRESULT = " + operation.multiplication(x, y));

            System.out.print("\nMau mencoba lagi (y/n) ? : ");
            lagi = scn3.next().charAt(0);
            System.out.println();
        } while (lagi == 'y');

    }
}
