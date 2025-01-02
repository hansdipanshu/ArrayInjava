public class BinarySearch {
    public static int findNo(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            } else if (number[mid] > key) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 1;
        System.out.println(" Element is found at is index : "+findNo(number, key));
    }
}
