import java.util.Stack;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String toString () {
        return "Name: " + name + ", Age: " + age;
    }
}


class L4_Stack_02_complexData {
	public static void main(String[] args) {
		Stack<Student> stack = new Stack<>();

		stack.add(new Student ("Haj", 20));
        stack.add(new Student ("Raj", 19));
        stack.add(new Student ("Sar", 18));
        stack.add(new Student ("Kan", 17));

        for (Student list : stack) {
    		System.out.println(list);
    	}

    	System.out.println ("Stack size is " + stack.size ());

    	stack.pop();
    	stack.pop();

    	for (Student list : stack) {
    		System.out.println(list);
    	}

    	System.out.println ("Stack size is " + stack.size ());

	}
}


/*
OUTPUT: Name: Haj, Age: 20
		Name: Raj, Age: 19
		Name: Sar, Age: 18
		Name: Kan, Age: 17
		Stack size is 4
		Name: Haj, Age: 20
		Name: Raj, Age: 19
		Stack size is 2
*/