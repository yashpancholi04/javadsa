package Introductionjava;

public class kadanemaxsubarraysum {

    public static void kadanes(int num[]){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            currsum = currsum+ num[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum= Math.max(currsum,maxsum);
        }
        System.out.println("The max subarray sum is:"+ maxsum);
    }
    public static void main(String[] args){
        int num[] = {4,-2,7,-9,8,9};
        kadanes(num);
    }
}
