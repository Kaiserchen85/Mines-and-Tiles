package main.test;

import main.model.Board;
import main.model.Tile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    public Board board;

    @BeforeEach
    public void setup() {
        board = new Board(11, 10, 25);
    }

    @Test
    public void constructorTest() {
        int mines = 0;
        assertEquals(11, board.getBoardTile().length);
        for(int i=0;i<11;i++) {
            for(int j=0;j<10;j++) {
                assertNotNull(board.getBoardTile()[i][j]);
                if(board.getBoardTile()[i][j].isMine()) {
                    mines++;
                }
            }
        }
        assertEquals(25, mines);
    }
}
