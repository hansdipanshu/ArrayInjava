public class largestNo {
    public  static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;

        for (int i= 0 ; i<=number.length-1; i++) {
            if (number[i]>largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[]= {1, 2,3,46,98,};
        System.out.println("largest value is "+ getLargest(number));
    }
}
