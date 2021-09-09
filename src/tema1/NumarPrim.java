package tema1;

import java.util.Scanner;

public class NumarPrim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int numar = scan.nextInt();
        double radical = Math.sqrt(numar);
        int limita = (int) Math.floor(radical);
        int i=2;
        int max = limita +1;
        boolean prim = true;


        while (i < max) {
            int rest = numar%i;
            if (rest == 0) {
                prim = false;
                break;
            }
            i++;
        }
        if (prim) {
            System.out.println("Numarul " + numar + " este prim.");
        } else {
            System.out.println("Numarul " + numar + " nu este prim.");
        }





    }
}
