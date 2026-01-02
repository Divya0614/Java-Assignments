package com.index;
import java.util.Scanner;

public class Positive {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = obj.nextInt();

        if (num > 0) {
            System.out.println("Postive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");
        }
    }
}
