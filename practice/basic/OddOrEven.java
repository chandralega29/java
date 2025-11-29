package clg;

import java.io.*;
public class OddOrEven {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader OE = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the number:");
        n=Integer.parseInt(OE.readLine());
        if(n%2==0)
        System.out.println("the number is even");
        else
        System.out.println("the number is odd");
    }
    
}
