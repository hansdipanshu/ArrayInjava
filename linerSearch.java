public class linerSearch {


    public static int LinearSearch(int number[], int key) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                System.out.println("The key is found at this index " + i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {10, 2, 3, 7, 5, 8, 9};
        int key = 11;
        int index = LinearSearch(number, key);
        if (index == -1) {
            System.out.println("Element is not found");
        }
    }

}
