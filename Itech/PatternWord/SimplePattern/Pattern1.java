package Itech.PatternWord.SimplePattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[]){

        //number angle triangle.
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data: ");
        n = sc.nextInt();

        for (int row=1; row<=n; row++){
            for (int col = n; col>=row; col--){
                System.out.print(col);
            }
            System.out.println(" ");
        }

    }
}
