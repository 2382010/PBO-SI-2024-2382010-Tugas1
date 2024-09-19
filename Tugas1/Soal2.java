package Tugas1;

public class Soal2 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < (n - i) ) {

                }else {
                    System.out.println("#");
                }
            }
            System.out.println("\n");
        }
    }
}
