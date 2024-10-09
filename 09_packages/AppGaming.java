import game.GameRunner;
import game.MarioGame;
import game.SuperContraGame;
import game.PacManGame;

class AppGaming {
	
	public static void main(String[] args) {
		
		var game1 = new MarioGame();
		var gameRunner1 = new GameRunner(game1);
		gameRunner1.run();
		System.out.println();

		var game2 = new SuperContraGame();
		var gameRunner2 = new GameRunner(game2);
		gameRunner2.run();
		System.out.println();

		var game3 = new PacManGame();
		var gameRunner3 = new GameRunner(game3);
		gameRunner3.run();
	}
}