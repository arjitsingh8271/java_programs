import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;


class Iterator01 {
	public static void main(String[] args) {
		
		Collection<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);

		Iterator<Integer> values = num.iterator();

		while(values.hasNext())		// return boolean 
			System.out.println(values.next());	// return next element.

	}
}

// 2
// 3
// 4
// 5