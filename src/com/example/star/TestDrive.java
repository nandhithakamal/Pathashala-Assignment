package com.example.star;


import java.util.Scanner;

public class TestDrive{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Star s = new Star();
        s.printStar();

        System.out.println();
        System.out.print("Enter a number (for the horizontal line): ");
        int n = scanner.nextInt();
        s.printHorizontalLineOfStars(n);

        System.out.println();
        System.out.print("Enter a number (for the vertical line): ");
        n = scanner.nextInt();
        s.printVerticalLineOfStars(n);
    }
}
