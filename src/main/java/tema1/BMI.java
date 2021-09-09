package tema1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti greutatea dvs. in kg: ");
        double greutate = scan.nextDouble();
        System.out.println(("Introduceti inaltimea dumneavoastra in metri: "));
        double inaltime = scan.nextDouble();
        double bmi = greutate/Math.pow(inaltime, 2);
        String rezultat="";



        if (bmi <= 18.49) {
            rezultat = "Subponderal";
        } else if (bmi > 18.49 && bmi < 25) {
            rezultat = "Greutate normala";
        } else if (bmi > 24.99 && bmi < 30) {
            rezultat = "Supraponderal";
        } else if (bmi > 29.99 && bmi < 35) {
            rezultat = "Obezitate (gradul I)";
        } else if (bmi > 34.99 && bmi < 40) {
            rezultat = "Obezitate (gradul II)";
        } else {
            rezultat = "Obezitate morbida";
        }


        System.out.println("Indicele dvs. de masa corporala este: " + String.format("%.2f", bmi) + "." + "Va incadrati in clasa: " + rezultat + ".");

    }
}
