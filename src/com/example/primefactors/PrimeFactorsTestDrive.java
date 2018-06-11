package com.example.primefactors;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorsTestDrive {
    public static void main(String[] args) {
        PrimeFactors pf = new PrimeFactors();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> factors = new ArrayList<Integer>();
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        factors = pf.generate(n);
        System.out.println(factors);
    }
}
