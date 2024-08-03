import java.awt.*;

class gui_03_creating_frame_class extends Frame
{
	Label l1;
	TextField t1;
	Button b1;

	public gui_03_creating_frame_class()
	{
		super("Frame_1");
		setLayout(new FlowLayout());

		l1 = new Label("Enter Your Name:");
		t1 = new TextField(20);
		b1 = new Button("Click me");

		add(l1);
		add(t1);
		add(b1);
	}


	public static void main(String[] args)
	{
		gui_03_creating_frame_class f1 = new gui_03_creating_frame_class();
		f1.setSize(500,300);	// we can write in myFrame Constructor also
		f1.setVisible(true);	// we can write in myFrame Constructor also
	}
}