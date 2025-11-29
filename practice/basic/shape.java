package clg;

import java.io.*;
public class shape {
    public static void main(String[] args) throws IOException{
        float s,l,b,h,b1;
        double s_area,t_area,r_area;
        BufferedReader shapes = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the side:");
        s=Float.parseFloat(shapes.readLine());
        System.out.print("enter the length:");
        l=Float.parseFloat(shapes.readLine());
        System.out.print("enter the breadth:");
        b=Float.parseFloat(shapes.readLine());
        System.out.print("enter the height:");
        h=Float.parseFloat(shapes.readLine());
        System.out.print("enter the base:");
        b1=Float.parseFloat(shapes.readLine());
        s_area=s*s;
        t_area=0.5*(l*b1);
        r_area=l*b;
        System.out.println("Area of square is "+s_area);
        System.out.println("Area of rectangle is "+r_area);
        System.out.println("Area of triangle is "+t_area);


    }
    
}
