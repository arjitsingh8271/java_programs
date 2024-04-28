/*
Using static method with the implementation of constructor write
the program to implement counter.
*/


public class asgmt_15_Counter 
{
    private static int count = 0;

    // Constructor increments the count each time an object is created
    public asgmt_15_Counter() 
    {
        count++;
    }

    // Static method to get the current count
    public static int getCount() 
    {
        return count;
    }

    public static void main(String[] args) 
    {
        // Create multiple instances of asgmt_15_Counter
        asgmt_15_Counter counter1 = new asgmt_15_Counter();
        asgmt_15_Counter counter2 = new asgmt_15_Counter();
        asgmt_15_Counter counter3 = new asgmt_15_Counter();

        // Get and display the current count
        System.out.println("Current count: " + asgmt_15_Counter.getCount());
    }
}
