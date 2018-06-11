package com.example.primefactors;

import java.util.ArrayList;

public class PrimeFactors {
    boolean isPrime(int n){
        for(int i = 2; i < n/2 + 1; i++){
            if((n % i) == 0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> generate(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        if(n == 0 || n == 1){
            return factors;
        }
        for(int i = 2; i < n/2 + 1; i++) {
            if ((n % i) == 0) {
                if (isPrime(i)) {
                    factors.add(i);
                }
            }
        }
        return factors;
    }

}
