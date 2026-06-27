package day_7.classwork;

public class minvalue {
    public static void main(String[] args){
        int[] num={8,9,4,-3,5};
        int min=1000;
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];

            }
        }
        System.out.println("Minimum value:"+ min);


    }
}
