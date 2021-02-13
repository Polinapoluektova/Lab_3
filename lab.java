package com.company;
import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        double results = 0;
        if (n>=1) {
            for (int s = 1; s<=n; s++)
            {
                results += Math.sin(Math.pow(x, s));
            }
        }
    }
}
