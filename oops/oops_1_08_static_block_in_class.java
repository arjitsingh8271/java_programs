class A
{
    // static variables
    static int a = 2;
    static int b;
    static int c;

    // static blocks
    static {
        System.out.println("First Static block.");
        b = a * 2;
    }
    static {
        System.out.println("Second Static block.");
        c = 30;
    }

    // static method
    static void display() {

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

class oops_1_08_static_block_in_class 
{
    public static void main(String[] args) {
        // calling the static method
        A.display();
    }
}

/*
OUTPUT: First Static block.
        Second Static block.
        a = 2
        b = 4
        c = 30
*/