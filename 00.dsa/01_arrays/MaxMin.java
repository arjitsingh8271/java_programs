import java.util.ArrayList;

class MaxMin {

	static ArrayList<Integer> maxMinWithourDAC(int[] arr) {
		
		ArrayList<Integer> res = new ArrayList<>();
		res.add(arr[0]);
		res.add(arr[0]);

		for(int i=0; i<arr.length; i++) {
			if(arr[i] < res.get(0))
				res.set(0, arr[i]); // Update min
			else if (arr[i] > res.get(1))
				res.set(1, arr[i]); // Update mxn
		}

		return res;
	}


	static ArrayList<Integer> maxMinWithDAC(int[] arr, int low, int high) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Base Case: If there is only one element
        if (low == high) {
            result.add(arr[low]); // Min
            result.add(arr[low]); // Max
            return result;
        }

        // Base Case: If there are two elements
        if (high == low + 1) {
            result.add(Math.min(arr[low], arr[high])); // Min
            result.add(Math.max(arr[low], arr[high])); // Max
            return result;
        }

        // Divide the array into two halves
        int mid = (low + high) / 2;

        // Recursively find min and max in left and right halves
        ArrayList<Integer> leftResult = maxMinWithDAC(arr, low, mid);
        ArrayList<Integer> rightResult = maxMinWithDAC(arr, mid + 1, high);

        // Conquer: Combine the results
        result.add(Math.min(leftResult.get(0), rightResult.get(0))); // Overall Min
        result.add(Math.max(leftResult.get(1), rightResult.get(1))); // Overall Max

        return result;
    }


	public static void main(String[] args) {
		
		int[] arr = {3,2,1,4,5};

		System.out.println(maxMinWithourDAC(arr));
		System.out.println(maxMinWithDAC(arr, 0, arr.length - 1));
	}
}