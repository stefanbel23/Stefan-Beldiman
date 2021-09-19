package tema4;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int num = scan.nextInt();
        long result;
        if (num > 1) {
            result = fact(num);
            System.out.println("'" + num + "'" + " factorial" + " este:" + result);
        } else {
            System.out.println("Numarul introdus este mai mic ca 1");
        }

    }
    public static long fact(int num) {
        if (num==1) {
            return num;
        }
        return num*fact(num-1);
    }
}

