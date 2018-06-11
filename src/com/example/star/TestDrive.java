package com.example.star;


import java.util.Scanner;

public class TestDrive{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nStar");
        Star s = new Star();
        s.printStar();

        System.out.println();
        System.out.println("\nHorizontal line of stars");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        s.printHorizontalLineOfStars(n);

        System.out.println();
        System.out.println("\nVertical line of stars");
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        s.printVerticalLineOfStars(n);
        System.out.println();

        System.out.println("\nRight triangle");
        RightTriangle rt = new RightTriangle();
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        rt.printTriangle(n);
    }
}
