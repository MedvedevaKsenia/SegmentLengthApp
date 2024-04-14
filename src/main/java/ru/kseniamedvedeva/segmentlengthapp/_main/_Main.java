package ru.kseniamedvedeva.segmentlengthapp._main;

import ru.kseniamedvedeva.segmentlengthapp.service.SegmentLength;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers for 1 coordinates:");
        if (scanner.hasNextInt()) {
            x1 = scanner.nextInt();
            if (scanner.hasNextInt()) {
                y1 = scanner.nextInt();
                System.out.println("Enter 2 numbers for 2 coordinates:");
                if (scanner.hasNextInt()) {
                    x2 = scanner.nextInt();
                    if (scanner.hasNextInt()) {
                        y2 = scanner.nextInt();
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
        if (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0) {
            System.out.println("Segment length = " + SegmentLength.calculatingLenghtOfSegment(x1,y1,x2,y2));
        }
    }
}