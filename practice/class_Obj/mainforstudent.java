package clg.class_Obj;

import java.util.Scanner;
    class student_info {  //for run PS C:\Users\User\Desktop\emcjava> javac clg/class_Obj/mainforstudent.java
                        //PS C:\Users\User\Desktop\emcjava> java clg.class_Obj.mainforstudent     
    String name,rollno;
    int tamil,english,maths,science,social,total;
    float avg; 
    void getdata(String name,String rollno,int tamil,int english,int maths,int science,int social){
        this.name=name;
        this.rollno=rollno;
        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;
    }
        
        void display(){
            total=tamil+english+maths+science+social;
            avg=total/5f;
            System.out.println("*****" + name +" MARK INFORMATION*****");
            System.out.println("student name is: "+name);
            System.out.println("student rollno is: "+rollno);
            System.out.println("student tamil mark is: "+tamil);
            System.out.println("student english mark is: "+english);
            System.out.println("student maths mark is: "+maths);
            System.out.println("student science mark is: "+science);
            System.out.println("student social mark is : "+social);
            System.out.println("Total mark is: "+total);
            System.out.println("Average mark is: "+avg);
            
        }

}


class mainforstudent{
    public static void main(String [] args){
        String name,rollno;
        int tamil,english,maths,science,social;

        Scanner info = new Scanner(System.in);
        System.out.print("enter your name:");
        name=info.nextLine();
        System.out.print("enter your rollno:");
        rollno=info.nextLine();
        System.out.print("enter your tamil:");
        tamil=info.nextInt();
        System.out.print("enter your english:");
        english=info.nextInt();
        System.out.print("enter your maths:");
        maths=info.nextInt();
        System.out.print("enter your science:");
        science=info.nextInt();
        System.out.print("enter your social:");
        social=info.nextInt();
        student_info s1 = new student_info();
        s1.getdata(name,rollno,tamil,english,maths,science,social);
        s1.display();

    }
}
