package com.example.star;

public class EngravedDiamond extends Diamond {
    public void printDiamond(int n) {
        int limit = 2 * n - 1;
        int mid = limit / 2;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = mid - i; j <= mid + i; j++) {
                System.out.print("*");
            }
            for (int j = mid + i + 1; j < limit; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Nandhitha");
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = mid - i; j <= mid + i; j++) {
                System.out.print("*");
            }
            for (int j = mid + i + 1; j < limit; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
