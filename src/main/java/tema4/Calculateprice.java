package tema4;

import java.util.Scanner;

public class Calculateprice {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Pretul de baza (um):");
            float basePrice = scan.nextFloat();
            System.out.println("Valoarea TVA este __%:");
            float vat = scan.nextFloat();
            calculatePrice(basePrice,vat);
        }
        public static void calculatePrice(float price, float tax) {
           if (price != 0 &&  tax != 0) {
                 float result = price + price*(tax/100);
               System.out.println("Pretul final al produsului este: " + result + " um");

           }
            System.out.println("Valorile introduse nu sunt corecte");
        }
    }

