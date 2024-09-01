/*
Given an array arr of size n which contains elements in range 
from 0 to n-1, you need to find all the elements occurring more 
than once in the given array. Return the answer in ascending order. 
If no such element is found, return list containing [-1]. 

Examples:

Input: n = 4, arr[] = [0,3,1,2]
Output: -1
Explanation: There is no repeating element in the array. Therefore output is -1.

Input: n = 5, arr[] = [2,3,1,2,3]
Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:

1 <= n <= 105
0 <= arr[i] <= 105, for each valid i
*/

import java.util.ArrayList;

class ArrayList_ArrayDuplicates {
	
    public static ArrayList<Integer> duplicates(int[] arr) {

        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j])
                    a.add(i);                           
            }
        }
        if(a.isEmpty()) {
        	a.add(-1);
        	return a;
        }
        else
        	return a;
    }


    public static void main(String[] args) {

    	int arr[] = {11,12,70,37,30,63,49,12,32,63,12,51,64,45,8,67,34,1,17,67,55,23,11,42,65,73,41,67,67,53,29,28,49,36,38,34,21,55,14,55,33,33,23,48,14,14,1,41,4,10,37,16,61,73,18,24,73,51,57,23,32,66,7,63,61,24,18,9,67,53,47,17,72,69};

    	System.out.println(duplicates(arr)); 
    }
}