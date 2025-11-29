package clg;

import java.io.*;

public class paybill {
    public static void main(String[] args)throws IOException {
        double bp,hra,da,pf,np;
        BufferedReader pay = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the basic pay:");
        bp=Double.parseDouble(pay.readLine());
        hra=(0.08*bp);
        da=(0.30*bp);
        pf=(0.10*bp);
        System.out.println("The HRA is"+hra);
        System.out.println("The DA is"+da);
        System.out.println("The PF is"+pf);
        np=bp+hra+da-pf;
        System.out.print("The NETPAY is"+np);
 
    }
    
}
