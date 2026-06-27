package day_7.classwork;
import java.util.Scanner;
import java.util.Arrays;

public class markswith_grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name:");
        String name=sc.nextLine();
        System.out.print("enter the age:");
        int age=sc.nextInt();
        String[] subjects=new String[5];
        int[] marks=new int[5];
        for(int i=0;i< marks.length;i++){
            System.out.println("enter the subject name:" );
                subjects[i] = sc.next();
            System.out.println("enter the marks:");
            marks[i]=sc.nextInt();



        }



    }

}
