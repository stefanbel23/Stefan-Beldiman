package tema2;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("What is you name?");
        name = scan.nextLine();
        if (name.isEmpty()) {
            System.out.println("Hello, stranger!");
        } else System.out.println("Hello, " + name + "!");
    }
}
