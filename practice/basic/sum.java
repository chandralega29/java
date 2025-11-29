package clg;

import java.io.*;

public class sum {
    public static void main(String[] args) throws IOException{
        String sname;
        String rollno;
        int tamil, english, maths, total;
        float avg;
        BufferedReader stuinfo= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter ur name:");
        sname= stuinfo.readLine();
        System.out.print("enter ur rollno:");
        rollno= stuinfo.readLine();
        System.out.print("enter tamil mark:");
        tamil= Integer.parseInt(stuinfo.readLine());
        System.out.print("enter english mark:");
        english= Integer.parseInt(stuinfo.readLine());
        System.out.print("enter maths mark:");
        maths= Integer.parseInt(stuinfo.readLine());
        total=tamil+english+maths;
        avg=total/3;
        System.out.println("total mark is:"+total);
        System.out.println("the average is:"+avg);

    }
    
}
