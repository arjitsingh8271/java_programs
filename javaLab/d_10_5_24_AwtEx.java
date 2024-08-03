import  java.awt.*;

public class d_10_5_24_AwtEx extends Frame
{
	d_10_5_24_AwtEx()
	{  
      	// creating a TextField  
      	TextField T = new TextField();

      	// creating a Button  
      	Button B = new Button("Submit");  
  
      	// Size
      	T.setBounds(30, 100, 100, 30);  
      	B.setBounds(30, 80, 80, 30);

      	add(T);
      	add(B);

      	setSize(500, 500);
      	setTitle("First AWT Page");   
      	setLayout(null);   
      	setVisible(true); 
      	} 

      	public static void main(String args[]) 
		{   
			d_10_5_24_AwtEx AE = new d_10_5_24_AwtEx(); 
		}   
	
}