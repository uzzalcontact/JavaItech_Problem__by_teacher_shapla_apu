package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class PatternTest {

    public static void main(String args[]){

        int n, c, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        n = sc.nextInt();

        for (r=1; r<=n; r++){

           for (c=1; c<=n-r; c++){
               System.out.print(" ");
           }

           for (c=1; c<=(r*2)-1; c++){
               System.out.print("*");
           }

            System.out.println(" ");
        }

    }
}
