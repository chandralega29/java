package clg;

import java.io.*;

public class PositiveOrNegative {
    public static void main(String[] args)throws IOException {
        int n;
        BufferedReader PE = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        n = Integer.parseInt(PE.readLine());
        if(n>0)
        System.out.print("The number is positive");
        else if(n<0)
        System.out.print("The number is negative");
        else
        System.out.print("The number is zero");


    }
    
}
