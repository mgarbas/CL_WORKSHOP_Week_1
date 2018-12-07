package pl.coderslab.game1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Random r = new Random();
        int a = r.nextInt(100);

        Scanner scan = new Scanner(System.in);

        System.out.println("Pick a number");

        int counter = 0;

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("That's not a number or you're out of range");
            counter++;
        }

        while (true) {
            int pick = scan.nextInt();
            if (pick > a) {
                System.out.println("Too high!");
            } else if (pick < a) {
                System.out.println("Too low!");
            }else {
                System.out.println("That's correct!!!");
                break;
            }
        }

    }
}

