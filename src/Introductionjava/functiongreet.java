package Introductionjava;

public class functiongreet {
    public static void main(String args []){
        System.out.println("lets gets started");
        greetcustomer();
        addnumbers(5,5);
    }


    public static void greetcustomer(){
        System.out.println("hello to you");
        System.out.println("hope you are having a good day");
    }

    public static void addnumbers(int a ,int b){
        int sum=a+b;
        System.out.println(sum);
    }
}
