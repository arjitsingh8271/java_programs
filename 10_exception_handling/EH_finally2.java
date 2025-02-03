class EH_finally2 {
    public static int testFinally() {
        try {
            return 10;
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Returned value: " + testFinally());
    }
}


/*
Finally block executed.
Returned value: 10
*/