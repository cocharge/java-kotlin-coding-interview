import org.example.Game;
import org.example.enums.Move;
import org.example.enums.Result;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testDraws() {
        Game game = new Game();
        assertEquals(Result.DRAW, game.play(Move.ROCK, Move.ROCK));
        assertEquals(Result.DRAW, game.play(Move.PAPER, Move.PAPER));
        assertEquals(Result.DRAW, game.play(Move.SCISSORS, Move.SCISSORS));
        assertEquals(Result.DRAW, game.play(Move.Spock, Move.Spock));
        assertEquals(Result.DRAW, game.play(Move.Lizard, Move.Lizard));
    }

    @Test
    void testPlayerAWins() {
        Game game = new Game();
        assertEquals(Result.WIN, game.play(Move.ROCK, Move.SCISSORS));
        assertEquals(Result.WIN, game.play(Move.ROCK, Move.Lizard));

        assertEquals(Result.WIN, game.play(Move.PAPER, Move.ROCK));
        assertEquals(Result.WIN, game.play(Move.PAPER, Move.Spock));

        assertEquals(Result.WIN, game.play(Move.SCISSORS, Move.PAPER));
        assertEquals(Result.WIN, game.play(Move.SCISSORS, Move.Lizard));

        assertEquals(Result.WIN, game.play(Move.Lizard, Move.Spock));
        assertEquals(Result.WIN, game.play(Move.Lizard, Move.PAPER));

        assertEquals(Result.WIN, game.play(Move.Spock, Move.ROCK));
        assertEquals(Result.WIN, game.play(Move.Spock, Move.SCISSORS));


    }

    @Test
    void testPlayerBWins() {
        Game game = new Game();
        assertEquals(Result.LOSE, game.play(Move.SCISSORS, Move.ROCK));
        assertEquals(Result.LOSE, game.play(Move.Lizard, Move.ROCK));

        assertEquals(Result.LOSE, game.play(Move.ROCK, Move.PAPER));
        assertEquals(Result.LOSE, game.play(Move.Spock, Move.PAPER));

        assertEquals(Result.LOSE, game.play(Move.PAPER, Move.SCISSORS));
        assertEquals(Result.LOSE, game.play(Move.Lizard, Move.SCISSORS));

        assertEquals(Result.LOSE, game.play(Move.Spock, Move.Lizard));
        assertEquals(Result.LOSE, game.play(Move.PAPER, Move.Lizard));

        assertEquals(Result.LOSE, game.play(Move.ROCK, Move.Spock));
        assertEquals(Result.LOSE, game.play(Move.SCISSORS, Move.Spock));

    }

    // Additional Test: Zero rounds

}
