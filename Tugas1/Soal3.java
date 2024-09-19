package Tugas1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int total = 1;
        String kalimat;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan kalimat dengan camelCase : ");
        kalimat = input.next();

        char[] kalimatTerpisah = kalimat.toCharArray();
        for (char huruf : kalimatTerpisah) {
            if ((int)huruf >= 65 && (int)huruf <= 90){
                total++;
            }
        }
        System.out.println(total);
    }

}
