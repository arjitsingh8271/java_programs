public class RBinarySearch {
    
    public static int rBinarySearch(int[] arr, int low, int high, int x) {
        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            return mid;
        }

        if (arr[mid] > x) {
            return rBinarySearch(arr, low, mid - 1, x);
        }

        return rBinarySearch(arr, mid + 1, high, x);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        
        System.out.println(rBinarySearch(arr, 0, arr.length - 1, 22));
    }
}
