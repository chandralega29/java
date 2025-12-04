package clg.class_Obj;
import java.util.Scanner;
class transaction{
    String name;
    int current_amt,min,creadit,debit;

    void getdata(String name, int min,int creadit,int debit){
        this.name=name;
        this.min=min;
        this.creadit=creadit;
        this.debit=debit;
    }
    void display(){
        
        current_amt=(min+creadit)-debit;
        System.out.println("name of the customer: "+ name );
        System.out.println("current amount in his/her account is : "+ current_amt );
        System.out.println("minimum amount in his/her account is : "+ min );
        System.out.println("creadited amount in his/her account is : "+ creadit );
        System.out.println("debited amount in his/her account is : "+ debit );
        
    }
}

public class BankMain {
        public static void main(String[] args) {

            String name;
            int min,creadit,debit;
            Scanner bm = new Scanner(System.in);
            System.out.print("Enter your name : " );
            name=bm.nextLine();
            System.out.print("minimum amount : " );
            min=bm.nextInt();
            System.out.print("creadited amount : " );
            creadit=bm.nextInt();
            System.out.print("debited amount : " );
            debit=bm.nextInt();
            transaction t1 = new transaction();
            t1.getdata(name,min,creadit,debit);
            t1.display();
        }
    }
    
