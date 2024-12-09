interface GameConsole {
    public void up();
    public void down();
    public void left();
    public void right();

}
class MarioGame implements GameConsole {
	public void up() { System.out.println("Jump");}
	public void down() { System.out.println("Go into a Hole");}
	public void left() { System.out.println("Go back");}
	public void right() { System.out.println("Accelerate");}
}

class SuperContraGame implements GameConsole  {
	public void up() { System.out.println("Up");}
	public void down() { System.out.println("Sit down");}
	public void left() { System.out.println("Go back");}
	public void right() { System.out.println("Shoot a bullet");}
}

class GameRunner {

	private GameConsole game;
	//private SuperContraGame game;

	GameRunner(GameConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}


class LooseCoupling {
	public static void main(String[] args) {
		
		//MarioGame game = new MarioGame();
		SuperContraGame game = new SuperContraGame();
		
		GameRunner playGame = new GameRunner(game);
		playGame.run();
	}
}

/*
NOTE: if we want to run SuperContraGame 
then we have to pass the object of SuperContraGame in GameRunner class.
Because both game is tightly coupled with GameRunner class.
*/