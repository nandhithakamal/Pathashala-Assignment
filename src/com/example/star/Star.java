package com.example.star;

public class Star {
   public void printStar(){
       System.out.print("*");
    }

    public void printHorizontalLineOfStars(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
    }

    public void printVerticalLineOfStars(int n){
        for(int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

}



