public class array_1d_qn_MinMaxElement {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element in the array is: " + largest);
        System.out.println("Smallest element in the array is: " + smallest);
    }
}
