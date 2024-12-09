class MarioGame {
	public void up() { System.out.println("Jump");}
	public void down() { System.out.println("Go into a Hole");}
	public void left() { System.out.println("Go back");}
	public void right() { System.out.println("Accelerate");}
}

class SuperContraGame  {
	public void up() { System.out.println("Up");}
	public void down() { System.out.println("Sit down");}
	public void left() { System.out.println("Go back");}
	public void right() { System.out.println("Shoot a bullet");}
}

class GameRunner {

	private MarioGame game;
	//private SuperContraGame game;

	GameRunner(MarioGame game) {
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


class TightCoupling {
	public static void main(String[] args) {
		
		MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		
		GameRunner playGame = new GameRunner(game);
		playGame.run();
	}
}

/*
NOTE: if we want to run SuperContraGame 
then we have add 'private SuperContraGame game' and change Constructor of GameRunner class.
Then only we can run SuperContraGame game.
Because both game is tightly coupled with GameRunner class.
*/