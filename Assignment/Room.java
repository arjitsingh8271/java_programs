import java.util.*;

class Room
{
	public String colour;
	public String designtype;

	Room(String colour, String designtype)
	{
		this.colour = colour;
		this.designtype = designtype;
	}
}

class House
{
	private final List<Room> rooms;
		House (List<Room> rooms)
		{
			this.rooms = rooms;
		}

	public List<Room> getTotalRooms()
	{
		return rooms ;
	}

}

class Question2
{
	public static void main (String args[])
	{
		Room r1 = new Room ("Red", "Morden");
		Room r2 = new Room ("Orange", "Clasic");
		List<Room> room = new ArrayList<Room> ();
			room.add(r1);
			room.add(r2);

		House house = new House (room);
		List<Room> rooms = house.getTotalRooms();
		for(Room r:rooms)
		{
			System.out.println("Colour: " + r.colour + " and " + "Design: " + r.designtype);
		}
	}
}