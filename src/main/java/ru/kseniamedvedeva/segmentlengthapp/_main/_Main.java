package ru.kseniamedvedeva.segmentlengthapp._main;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers for 1 coordinates:");
        if (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
            if (scanner.hasNextInt()) {
                num2 = scanner.nextInt();
                System.out.println("Enter 2 numbers for 2 coordinates:");
                if (scanner.hasNextInt()) {
                    num3 = scanner.nextInt();
                    if (scanner.hasNextInt()) {
                        num4 = scanner.nextInt();
                    } else {
                        System.out.println("You entered not number!");
                    }
                } else {
                    System.out.println("You entered not number!");
                }
            } else {
                System.out.println("You entered not number!");
            }
        } else {
            System.out.println("You entered not number!");
        }
        scanner.close();
        if (num1 != 0 && num2 != 0 && num3 != 0 && num4 != 0) {
            System.out.println("Segment length = ");
        }
    }
}