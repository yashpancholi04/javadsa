public class largestinarray {

    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int num[] = {10,38,85,407};
        System.out.println("largest no is:" + getLargest(num));
    }
}
