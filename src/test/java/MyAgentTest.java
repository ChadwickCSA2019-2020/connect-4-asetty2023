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
    }

    assertEquals(redAgent.iCanWin(), 1);

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

    assertEquals(redAgent.iCanWin(), 2);

  }

  // TODO: Write 2 test cases for testICanWinHorizontally

  //testTheyCanWinHorizontally#1
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
    assertEquals(redAgent.ICanWin(), 4);

    //testICanWinHorizontally#2
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

      assertEquals(redAgent.ICanWin(), 2);
    }
    // TODO: Write 2 test cases for testICanWinDiagonally

    //testICanWinDiagonally#1
    public void TestICanWinDiagonallyRight1() {
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

      assertEquals(redAgent.ICanWin(), 3);
    }

    //testICanWinDiagonally#2
    public void TestICanWinDiagonallyRight2() {
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

      assertEquals(yellowAgent.ICanWin(), 1);
    }

    @Test
    public void testTheyCanWin() {
      MyAgent redAgent = new MyAgent(game, true);
      MyAgent yellowAgent = new MyAgent(game, false);
      game.clearBoard();
      for (int i = 0; i < 3; i++) {
        redAgent.moveOnColumn(1);
        yellowAgent.moveOnColumn(2);
      }

      assertEquals(redAgent.theyCanWin(), 2);
    }

    // TODO: Write testTheyCanWinHorizontally

    //testTheyCanWinHorizontally#1
    @Test
    public void testTheyCanWinHorizontally1() {
      MyAgent redAgent = new MyAgent(game, true);
      MyAgent yellowAgent = new MyAgent(game, false);
      game.clearBoard();
      for (int i = 0; i < 4; i++) {
        redAgent.moveOnColumn(0);
        yellowAgent.moveOnColumn(2);
        redAgent.moveOnColumn(1);
        yellowAgent.moveOnColumn(1);
        redAgent.moveOnColumn(3);
        yellowAgent.moveOnColumn(2);
        redAgent.moveOnColumn(4);
        yellowAgent.moveOnColumn(0);


        assertEquals(redAgent.theyCanWin(), 3);
          }

      //testTheyCanWinHorizontally#2
      @Test
      public void testTheyCanWinHorizontally2() {
        MyAgent redAgent = new MyAgent(game, true);
        MyAgent yellowAgent = new MyAgent(game, false);
        game.clearBoard();
        for (int i = 0; i < 4; i++) {
                redAgent.moveOnColumn(0);
                yellowAgent.moveOnColumn(4);
          redAgent.moveOnColumn(0);
                yellowAgent.moveOnColumn(6);
          redAgent.moveOnColumn(1);
                yellowAgent.moveOnColumn(5);
              }

            assertEquals(redAgent.theyCanWin(), 3);
          }


      // TODO: Write testTheyCanWinDiagonally

      //testTheyCanWinDiagonally#1

      @Test
      public void testTheyCanWinDiagonally2() {
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
          redAgent.moveOnColumn(4)
          yellowAgent.moveOnColumn(3);
          redAgent.moveOnColumn(4);
          yellowAgent.moveOnColumn(3);
          redAgent.moveOnColumn(4);
              }
            assertEquals(redAgent.theyCanWin(), 4);
          }

      //testTheyCanWinDiagonally#2

      @Test
      public void testTheyCanWinDiagonally1() {
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
          redAgent.moveOnColumn(2)
          yellowAgent.moveOnColumn(3);
          redAgent.moveOnColumn(4);
          yellowAgent.moveOnColumn(3);
          redAgent.moveOnColumn(4);
          yellowAgent.moveOnColumn(2);
              }
            assertEquals(redAgent.theyCanWin(), 4);
          }



      // Tests you can win against a Beginner agent as Red
      @Test
      public void testRedWinningBeginnerAgent2() {
        Agent redAgent = new MyAgent(game, true);
        Agent yellowAgent = new BeginnerAgent(game, false);
        int numberOfWins = 0;
        for (int i = 0; i < 50; i++) {
          game.clearBoard();
          while(!game.boardFull() && game.gameWon() == 'N') {
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
          while(!game.boardFull() && game.gameWon() == 'N') {
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
          while(!game.boardFull() && game.gameWon() == 'N') {
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
          while(!game.boardFull() && game.gameWon() == 'N') {
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

      //BONUS testCases vs. IntermediateAgent
      @Test
      public void testYellowWinningIntermediateAgent() {
        Agent redAgent = new MyAgent(game, true);
        Agent yellowAgent = new IntermediateAgent(game, false);
        int numberOfWins = 0;
        for (int i = 0; i < 50; i++) {
          game.clearBoard();
          while(!game.boardFull() && game.gameWon() == 'N') {
            redAgent.move();
            if (game.gameWon() != 'R') {
              yellowAgent.move();
            }
          }

          if (game.gameWon() == 'Y') {
            numberOfWins++;
          }
        }
        System.out.println("You won: " + numberOfWins + " games as Yellow against Intermediate");
        assertTrue(numberOfWins >= 45);
      }
      // SUPER BONUS TODO: Write testCases to playAgainst AdvancedAgent
      //BONUS testCases vs. AdvancedAgent
      @Test
      public void testYellowWinningAdvencedAgent() {
        Agent redAgent = new MyAgent(game, true);
        Agent yellowAgent = new AdvancedAgent(game, false);
        int numberOfWins = 0;
        for (int i = 0; i < 50; i++) {
          game.clearBoard();
          while(!game.boardFull() && game.gameWon() == 'N') {
            redAgent.move();
            if (game.gameWon() != 'R') {
              yellowAgent.move();
            }
          }

          if (game.gameWon() == 'Y') {
            numberOfWins++;
          }
        }
        System.out.println("You won: " + numberOfWins + " games as Yellow against Advanced");
        assertTrue(numberOfWins >= 45);
      }
      // SUPER BONUS TODO: Write testCases to playAgainst BrilliantAgent
      //BONUS testCases vs. BrilliantAgent
      @Test
      public void testYellowWinningBrilliantAgent() {
        Agent redAgent = new MyAgent(game, true);
        Agent yellowAgent = new BrilliantAgent(game, false);
        int numberOfWins = 0;
        for (int i = 0; i < 50; i++) {
          game.clearBoard();
          while(!game.boardFull() && game.gameWon() == 'N') {
            redAgent.move();
            if (game.gameWon() != 'R') {
              yellowAgent.move();
            }
          }

          if (game.gameWon() == 'Y') {
            numberOfWins++;
          }
        }
        System.out.println("You won: " + numberOfWins + " games as Yellow against Brilliant");
        assertTrue(numberOfWins >= 45);
      }
    }
