import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyAgentTest {

	Connect4Game game;


	@Before
	public void setUp() throws Exception {
		game = new Connect4Game(7, 6);
	}

	@Test
	public void testICanWinVerticallySimple() {
		MyAgent redAgent = new MyAgent(game, true);
		MyAgent yellowAgent = new MyAgent(game, false);
		game.clearBoard();
		for (int i = 0; i < 3; i++) {
			redAgent.moveOnColumn(1);
			yellowAgent.moveOnColumn(2);
			redAgent.moveOnColumn(1);
			yellowAgent.moveOnColumn(2);
			redAgent.moveOnColumn(1);
			yellowAgent.moveOnColumn(2);
		}
	}

	@Test
	public void testICanWinVerticallyTop4() {
		MyAgent redAgent = new MyAgent(game, true);
		MyAgent yellowAgent = new MyAgent(game, false);
		game.clearBoard();
		for (int i = 0; i < 2; i++) {
			redAgent.moveOnColumn(1);
			yellowAgent.moveOnColumn(2);
		}

		for (int i = 0; i < 3; i++) {
			redAgent.moveOnColumn(2);
			yellowAgent.moveOnColumn(1);
		}
	}

	// TODO: Write 2 test cases for testICanWinHorizontally
	// testTheyCanWinHorizontally#1
	@Test
	public void testICanWinHorizontally1() {
	  MyAgent redAgent = new MyAgent(game, true);
	  MyAgent yellowAgent = new MyAgent(game, false);
	  game.clearBoard();
	      redAgent.moveOnColumn(1);
	      yellowAgent.moveOnColumn(1);
	      redAgent.moveOnColumn(2);
	      yellowAgent.moveOnColumn(2);
	      redAgent.moveOnColumn(3);
	      yellowAgent.moveOnColumn(3);
	  }

	// testICanWinHorizontally#2
	@Test
	public void testICanWinHorizontally2() {
	  MyAgent redAgent = new MyAgent(game, true);
	  MyAgent yellowAgent = new MyAgent(game, false);
	  game.clearBoard();
	      yellowAgent.moveOnColumn(1);
	      redAgent.moveOnColumn(5);
	      yellowAgent.moveOnColumn(4);
	      redAgent.moveOnColumn(4);
	      yellowAgent.moveOnColumn(3);
	      redAgent.moveOnColumn(3);
	  }
	// TODO: Write 2 test cases for testICanWinDiagonally

	// testICanWinDiagonally#1
	@Test
	public void TestICanWinDiagonally1() {
	  MyAgent redAgent = new MyAgent(game, true);
	  MyAgent yellowAgent = new MyAgent(game, false);
	  game.clearBoard();
	      redAgent.moveOnColumn(0);
	      yellowAgent.moveOnColumn(1);
	      redAgent.moveOnColumn(1);
	      yellowAgent.moveOnColumn(2);
	      redAgent.moveOnColumn(2);
	      yellowAgent.moveOnColumn(3);
	      redAgent.moveOnColumn(2);
	      yellowAgent.moveOnColumn(3);
	      redAgent.moveOnColumn(4);
	      yellowAgent.moveOnColumn(3);
	  }

	// testICanWinDiagonally#2
	@Test
	public void TestICanWinDiagonally2() {
	  MyAgent redAgent = new MyAgent(game, true);
	  MyAgent yellowAgent = new MyAgent(game, false);
	  game.clearBoard();

	      redAgent.moveOnColumn(5);
	      yellowAgent.moveOnColumn(4);
	      redAgent.moveOnColumn(6);
	      yellowAgent.moveOnColumn(2);
	      redAgent.moveOnColumn(3);
	      yellowAgent.moveOnColumn(3);
	      redAgent.moveOnColumn(2);
	      yellowAgent.moveOnColumn(2);
	      redAgent.moveOnColumn(1);
	      yellowAgent.moveOnColumn(1);
	      redAgent.moveOnColumn(1);
	}

	// TODO: Write testTheyCanWinHorizontally

	//testTheyCanWinHorizontally#1
	@Test
	public void testTheyCanWinHorizontally1() {
	  MyAgent redAgent = new MyAgent(game, true);
	  MyAgent yellowAgent = new MyAgent(game, false);
	  game.clearBoard();
	      redAgent.moveOnColumn(0);
	      yellowAgent.moveOnColumn(1);
	      redAgent.moveOnColumn(1);
	      yellowAgent.moveOnColumn(2);
	      redAgent.moveOnColumn(2);
	      yellowAgent.moveOnColumn(3);
	  }

	//testTheyCanWinHorizontally#2
	@Test
	public void testTheyCanWinHorizontally2() {
	  MyAgent redAgent = new MyAgent(game, true);
	  MyAgent yellowAgent = new MyAgent(game, false);
	  game.clearBoard();
	  	  redAgent.moveOnColumn(0);
	  	  yellowAgent.moveOnColumn(6);
	  	  redAgent.moveOnColumn(0);
	      yellowAgent.moveOnColumn(6);
	      redAgent.moveOnColumn(5);
	      yellowAgent.moveOnColumn(5);
	      redAgent.moveOnColumn(4);
	      yellowAgent.moveOnColumn(4);
	      redAgent.moveOnColumn(3);
	  }
	/* make copy of connect 4 game
	 * type variable = new type(parameters);
	 * Connect4Game gamecopy = new Connect4Game(myGame);
	 * make an agent that is playing the copy
	 * MyAgent agentCopy = new MyAgent(gameCopy, iAmRed);
	 * have that agent move on a column
	 * check to see if you won
	 * if you won, return the column you move at
	 *
	 * if you never win return -1
	 * wrap all ^this^ in a for loop
	 */
	// TODO: Write testTheyCanWinDiagonally

	//testTheyCanWinDiagonally#1
	  @Test
	  public void testTheyCanWinDiagonally1() {
	      MyAgent redAgent = new MyAgent(game, true);
	      MyAgent yellowAgent = new MyAgent(game, false);
	      game.clearBoard();
	      for (int i = 0; i < 4; i++) {
	        redAgent.moveOnColumn(0);
	        yellowAgent.moveOnColumn(1);
	        redAgent.moveOnColumn(2);
	        yellowAgent.moveOnColumn(2);
	        redAgent.moveOnColumn(3);
	        yellowAgent.moveOnColumn(1);
	        redAgent.moveOnColumn(4);
	        yellowAgent.moveOnColumn(3);
	        redAgent.moveOnColumn(4);
	        yellowAgent.moveOnColumn(3);
	        redAgent.moveOnColumn(4);
	      }
	    }

	//testTheyCanWinDiagonally#2
	@Test
	public void testTheyCanWinDiagonally2() {
	    MyAgent redAgent = new MyAgent(game, true);
	    MyAgent yellowAgent = new MyAgent(game, false);
	    game.clearBoard();
	    for (int i = 0; i < 4; i++) {
	      redAgent.moveOnColumn(5);
	      yellowAgent.moveOnColumn(4);
	      redAgent.moveOnColumn(6);
	      yellowAgent.moveOnColumn(3);
	      redAgent.moveOnColumn(2);
	      yellowAgent.moveOnColumn(3);
	      redAgent.moveOnColumn(2);
	      yellowAgent.moveOnColumn(3);
	      redAgent.moveOnColumn(4);
	      yellowAgent.moveOnColumn(3);
	      redAgent.moveOnColumn(4);
	      yellowAgent.moveOnColumn(2);
	    }
	  }
	// Tests you can win against a Beginner agent as Red
	@Test
	public void testRedWinningBeginnerAgent() {
		Agent redAgent = new MyAgent(game, true);
		Agent yellowAgent = new BeginnerAgent(game, false);
		int numberOfWins = 0;
		for (int i = 0; i < 50; i++) {
			game.clearBoard();
			while(!game.boardFull() || game.gameWon() == 'N') {
				redAgent.move();
				if (game.gameWon() != 'R') {
					yellowAgent.move();
				}
			}

			if (game.gameWon() == 'R') {
				numberOfWins++;
			}
		}
		System.out.println("You won: " + numberOfWins + " games as Red against Beginner");
		// Test that you win over 90% of your games
		assertTrue(numberOfWins >= 45);
	}

	// Tests you can win against a Beginner agent as Yellow
	@Test
	public void testYellowWinningBeginnerAgent() {
		Agent redAgent = new BeginnerAgent(game, true);
		Agent yellowAgent = new MyAgent(game, false);
		int numberOfWins = 0;
		for (int i = 0; i < 50; i++) {
			game.clearBoard();
			while(!game.boardFull() || game.gameWon() == 'N') {
				redAgent.move();
				if (game.gameWon() != 'R') {
					yellowAgent.move();
				}
			}

			if (game.gameWon() == 'Y') {
				numberOfWins++;
			}
		}
		System.out.println("You won: " + numberOfWins + " games as Yellow against Beginner");
		// Test that you win over 90% of your games
		assertTrue(numberOfWins >= 45);
	}

	// Tests you can win against a Random agent as Red
	@Test
	public void testRedWinningRandomAgent() {
		Agent redAgent = new MyAgent(game, true);
		Agent yellowAgent = new RandomAgent(game, false);
		int numberOfWins = 0;
		for (int i = 0; i < 50; i++) {
			game.clearBoard();
			while(!game.boardFull() || game.gameWon() == 'N') {
				redAgent.move();
				if (game.gameWon() != 'R') {
					yellowAgent.move();
				}
			}

			if (game.gameWon() == 'R') {
				numberOfWins++;
			}
		}
		System.out.println("You won: " + numberOfWins + " games as Red against Random");
		// Test that you win over 90% of your games
		assertTrue(numberOfWins >= 45);
	}

	//Tests you can win against a Random agent as Red
	@Test
	public void testYellowWinningRandomAgent() {
		Agent redAgent = new RandomAgent(game, true);
		Agent yellowAgent = new MyAgent(game, false);
		int numberOfWins = 0;
		for (int i = 0; i < 50; i++) {
			game.clearBoard();
			while(!game.boardFull() || game.gameWon() == 'N') {
				redAgent.move();
				if (game.gameWon() != 'R') {
					yellowAgent.move();
				}
			}

			if (game.gameWon() == 'Y') {
				numberOfWins++;
			}
		}
		System.out.println("You won: " + numberOfWins + " games as Yellow against Random");
		// Test that you win over 90% of your games
		assertTrue(numberOfWins >= 45);
	}

// BONUS TODO: Write testCases to play against IntermediateAgent

// SUPER BONUS TODO: Write testCases to playAgainst AdvancedAgent

// SUPER BONUS TODO: Write testCases to playAgainst BrilliantAgent

}
