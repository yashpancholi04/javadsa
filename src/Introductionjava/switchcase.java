package Introductionjava;

public class switchcase {
    public static void main (String args []){

        int number = 30;
        String size;

        switch(number){

            case 28 : size = "small";
            break;

            case 29 : size = "medium";
            break;

            case 30 : size = "large";
            break;

            default : size = "unknown";
            break;
        }
        System.out.println(size);
    }
}
