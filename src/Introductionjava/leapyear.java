package Introductionjava;

import java.util.Scanner;

public class leapyear {
    public static void main (String args []){

        Scanner sc = new Scanner(System.in );
        int year = sc.nextInt();
        //a year is considered as leap year
        //1.if(year  is exactly divisible by 4 and not divisible by 100)
        //or if year is divisible by 400

        if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
            System.out.println("leap year");
        }

            else{
                System.out.println("Not a leap year");
            }
        }
    }

