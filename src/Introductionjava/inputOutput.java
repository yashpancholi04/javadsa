package Introductionjava;

import java.util.Scanner;

public class inputOutput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int number = sc.nextInt();

        System.out.println("your number is :" + number);
        // next() -- read a word from the user
        // nextLine() --read a line of a text from a user
        //val+=a --val=val+a

    }
}
