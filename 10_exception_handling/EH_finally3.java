import java.io.FileInputStream;
import java.io.IOException;

class EH_finally3 {
    public static void main(String[] args) {
        FileInputStream f = null; 	// Declare outside try block

        try {
            f = new FileInputStream("abc.txt");
        } 
        catch (Exception e) {
            System.out.println("File not Found.");
        } 
        finally {
            if (f != null) { 	// Check if file opened successfully
                try {
                    f.close(); 	// Close file safely
                    System.out.println("File closed");
                } 
                catch (IOException e) {
                    System.out.println("Error closing file: " + e);
                }
            } 
            else {
                System.out.println("File not Found.");
            }
        }
    }
}


/*
If file is present:
File closed

If file is not present:
File not Found.
File not Found.
*/