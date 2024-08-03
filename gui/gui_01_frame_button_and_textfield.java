import java.awt.*;

class gui_01_frame_button_label_and_textfield
{
	public static void main(String[] args)
	{
		Frame f = new Frame("Frame_1");	// creating a frame
		f.setLayout(new FlowLayout());	// by default Layout is set as Border layout
										// we have to change in toto Flow layout


		Button b1 = new Button("Click Me");		// creating a button
		
		Label l1 = new Label("Enter Your Name:");		// creating a label
	
		TextField t1 = new TextField(20);		// creating a Text field
		

		f.add(l1);			// add label in frame
		f.add(t1);			// add Text Field in frame
		f.add(b1);			// add button in frame
		f.setSize(500,300);		// frame size (width, hieght)
		f.setVisible(true);		// frame visible is true
	}
}
