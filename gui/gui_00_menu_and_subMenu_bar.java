import java.awt.*;

class myFrame extends Frame
{
	Menu file, sub;
	MenuItem open, save1, save2, close, closeall;
	CheckboxMenuItem auto;

	public myFrame()
	{
		super("Frame_1");
		setLayout(new FlowLayout());

		open = new MenuItem("Open");
		save1 = new MenuItem("Save");
		save2 = new MenuItem("Save as");
		close = new MenuItem("Close");
		closeall = new MenuItem("Close All");

		auto = new CheckboxMenuItem("Auto Save");

		file = new Menu("File");
		sub = new Menu("Close");

		file.add(open);
		file.add(save1);
		file.add(save2);
		file.add(sub);
		file.add(auto);

		sub.add(close);
		sub.add(closeall);

		MenuBar mb = new MenuBar();
		mb.add(file);
		setMenuBar(mb);
	}
}


class gui_00_menu_and_subMenu_bar
{
	public static void main(String[] args)
	{
		myFrame f1 = new myFrame();
		f1.setSize(500,300);	// we can write in myFrame Constructor also
		f1.setVisible(true);	// we can write in myFrame Constructor also
	}
}