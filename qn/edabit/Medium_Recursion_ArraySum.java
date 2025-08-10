/*
Recursion: Array Sum

Write a function that finds the sum of an array. Make your function recursive.
Examples

sum([1, 2, 3, 4]) ➞ 10

sum([1, 2]) ➞ 3

sum([1]) ➞ 1

sum([]) ➞ 0

Notes

    Return 0 for an empty array.
    Check the Resources tab for info on recursion.
*/

public class Medium_Recursion_ArraySum {
    
    public static int sum(int[] arr) {
        return sumHelper(arr, 0);
    }

    private static int sumHelper(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumHelper(arr, index + 1);
    }


    public static void main(String[] args) {
    	
    	System.out.println(sum(new int[]{1, 2, 3, 4}));
    	System.out.println(sum(new int[]{-1, -1, -1}));
    	System.out.println(sum(new int[]{1}));
    	System.out.println(sum(new int[]{}));

    }
}
