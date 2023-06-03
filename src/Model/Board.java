package Model;

import Response.MoveResponse;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Board {
    private String[][] board;
    private int[] availableSpots;

    public Board() {
        board = new String[7][6];
        for (String[] strings : board) {
            Arrays.fill(strings, "blank");
        }

        Arrays.fill(availableSpots, 0);
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public int[] getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int[] availableSpots) {
        this.availableSpots = availableSpots;
    }
}
