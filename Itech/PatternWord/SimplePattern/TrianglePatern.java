package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class TrianglePatern {
    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        n = sc.nextInt();

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n ; c++) {

                if (c==1 || r==n || c==r){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println(" ");
        }
    }
}
