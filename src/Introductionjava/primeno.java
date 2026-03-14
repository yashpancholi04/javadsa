package Introductionjava;

public class primeno {
    public static void main (String args []){
        int n=4;
        int div =2;
        int flag=0;

        while(div<=n-1){

            if(n%div==0){
                flag=1;
                break;
            }
            div++;
        }

        if(flag==1){
            System.out.println("this is not a prime number");
        }else{
            System.out.println("this is  an prime no");
        }
    }
}
