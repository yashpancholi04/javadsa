public class bothlargestandsmallest {

    public static int[] getbothlarsmall(int num[]) {

        int largest = num[0];
        int smallest = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > largest) {
                largest = num[i];
            }

            if (num[i] < smallest) {
                smallest = num[i];
            }
        }

        return new int[]{largest, smallest};
    }

    public static void main(String args[]) {

        int num[] = {10, 48, 58, 75, 96, 348};

        int result[] = getbothlarsmall(num);

        System.out.println("Largest = " + result[0]);
        System.out.println("Smallest = " + result[1]);
    }
}
