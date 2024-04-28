/*
Create a class representing a "Book" with attributes 
such as title, author, and price. Implement a 
parameterized constructor to initialize these 
attributes and methods to displaybook details.
*/

public class asgmt_1_Book 
{
    private String title;
    private String author;
    private double price;

    // Parameterized constructor
    public asgmt_1_Book(String title, String author, double price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() 
    {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) 
    {
        asgmt_1_Book myBook = new asgmt_1_Book("Limitless", "Jim Kwik", 12.99);
        myBook.display();
    }
}



/*
OUTPUT:	Book Title: Limitless
		Author: Jim Kwik
		Price: $12.99
*/