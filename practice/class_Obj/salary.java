package clg.class_Obj;
import java.util.Scanner;
class emp{
    String name;
    float bp,hra,da,pf;
void getdata(String name,float bp){
    this.name=name;
    this.bp=bp;
}
void display(){
    hra=0.8f * bp;
    da=0.10f * bp;
    pf=0.20f * bp;
    System.out.println("**** "+ name +"'s salray ****");
    System.out.println("The hra is: "+hra);
    System.out.println("The da is: "+da);
    System.out.println("The pf is: "+pf);
}
}

public class salary {
    public static void main(String[] args) {
        
        String name;
        float bp;

        Scanner sal= new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=sal.nextLine();
        System.out.print("Enter your bp: ");
        bp=sal.nextFloat();
        emp emp1 = new emp();
        emp1.getdata(name,bp);
        emp1.display();
    }
}

    

