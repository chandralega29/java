package clg;

import java.io.*;

public class Greatest3no {
    public static void main(String[] args) throws IOException{
        int a,b,c;
        BufferedReader g = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the first number:");
        a=Integer.parseInt(g.readLine());
        System.out.print("enter the second number:");
        b=Integer.parseInt(g.readLine());
        System.out.print("enter the third number:");
        c=Integer.parseInt(g.readLine());
        if((a>b)&&(a>c))
        System.out.print(a+ "is greatest:");
        else if(b>c)
        System.out.print(b+ "is greatest:");
        else
        System.out.print(c+ "is greatest:");
        


    }

}
