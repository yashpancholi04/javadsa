package Introductionjava;

public class Armstrongno {
    public static void main (String args[]){
         System.out.println(isArmstrong(131));
         printArmstrongno(100,500);
    }

    public static void printArmstrongno(int low,int high){
        for(int n =low;n<=high;n++){

            boolean res = isArmstrong(n);
            if(res==true){
                System.out.println(n);
            }
        }
        
    }

    public static boolean isArmstrong(int n){
        int nod = countdigits(n);
        int originalnum=n;
        int sum=0;
        while(n>0){
            int rem = n%10;//4
            sum+=Math.pow(rem,nod);//4^4
            n=n/10;
        }

        return sum==originalnum;
    }

    public static int countdigits(int n){
         int nod=0;

         while(n>0){
             n = n/10;
             nod++;
         }
         return nod;
    }
}
