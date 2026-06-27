package day_7.classwork;

public class maxvalue {
    public static void main(String[] args){
        int[] num={92,76,8,99,7};
        int max=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Maximum value is:" + max);

    }
}
