package day_7.classwork;
import java.util.Scanner;
import java.util.Arrays;
public class arrays_user {
    public static void main(String[] args){
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("enter the value: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
