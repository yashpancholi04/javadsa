package Introductionjava;

public class Methods {
    public static void main(String args []){
        System.out.println("hello bete");

        Methods m1 =new Methods();
        m1.greet(); //method calling

        Methods m2 =new Methods();
        m2.greet(); //method calling

        m1.displayName("rahul","m1");
        m1.displayName("dustin","m2");

        String res = m1.otpGen();
        System.out.println(res);

        int sumValue = m1.sum(10,5);
        System.out.println(sumValue);


    }

    //type-1 no parameter , no return
    public void greet(){
        System.out.println("Good morning ....");
    }

    //type-2 with parameter,no return

    public void displayName(String name , String method){
        System.out.println("HEllo " + name + "-" +method);
    }

    //type-3 No parameter, returns something
    public String otpGen(){
        return "95893";
    }

    //type-4 with parameter and return
    public int sum(int a, int b){
        return a+b;
    }


}
