package Introductionjava;

public class arraybasic {
    public static void main(String args []){
        int num[] = {10,20,30,40};
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]-1);
        }

        String fruits[] = {"apple","banana","pineapple"};
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }

    }

}
