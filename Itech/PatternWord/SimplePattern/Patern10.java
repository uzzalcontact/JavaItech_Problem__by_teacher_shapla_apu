package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Patern10 {

    public static void main(String args[]){

        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
        n = sc.nextInt();

        for (r = 3; r>=1; r--){
            for (c=1; c<=r; c++){
                System.out.print(c);
            }

            System.out.println(" ");
        }
    }
}
