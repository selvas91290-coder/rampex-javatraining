package day6.hometask;
import java.util.Scanner;
import java.util.Arrays;
public class markstotal_usingarray {
    public static void main(String[] args){
        int[] marks=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the  Candiadte name :");
        String name=sc.nextLine();
        for(int i=0;i< marks.length;i++){
            System.out.print("enter the marks :");
            marks[i]=sc.nextInt();
        }
        int totalmarks=0;
        for(int i=0;i<marks.length;i++){
            totalmarks=totalmarks + marks[i];
        }
        System.out.println("congrats " + "selva " + "you scored" + totalmarks);
        System.out.println("percentage is:" + totalmarks/5.0 );
        System.out.println(Arrays.toString(marks));

    }
}
