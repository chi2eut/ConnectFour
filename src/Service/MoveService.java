package Service;

import Model.Board;
import Model.DataCache;
import Model.Move;
import Response.MoveResponse;

public class MoveService {
    public MoveResponse move(Move move) {
        Board board = DataCache.getInstance().getBoard();
        int[] availableSpots = board.getAvailableSpots();

        String whoseTurn = (move.getColor().equals("red")) ? "yellow" : "red";

        board.getBoard()[move.getxCoordinate()][availableSpots[move.getxCoordinate()]] = move.getColor();
        availableSpots[move.getxCoordinate()]++;

        if (availableSpots[move.getxCoordinate()] > 5) {
            availableSpots[move.getxCoordinate()] = -1;
        }

        MoveResponse response;

        if (isFinished(board, move)) {
            response = new MoveResponse(board.getBoard(), availableSpots, whoseTurn, move.getColor(), true);
        } else {
            response = new MoveResponse(board.getBoard(), availableSpots, whoseTurn, "", false);
        }

        return response;
    }

    public boolean isFinished(Board board, Move move) {
        boolean finished = false;
        String player = move.getColor();
        int x = move.getxCoordinate();
        int y = board.getAvailableSpots()[x] - 1;

        // left

        for (int i = 1; i < 3; i++) {
            if ((x - i) < 0) {
                break;
            } else if (board.getBoard()[x - i][y].equals(player)) {
                break;
            }

            if (i == 2) return true;
        }

        // right

        for (int i = 1; i < 3; i++) {
            if ((x + i) > 6) {
                break;
            } else if (board.getBoard()[x - i][y].equals(player)) {
                break;
            }

            if (i == 2) return true;
        }

        // left up diagonal

        // right up diagonal

        // left bottom diagonal

        // right bottom diagonal

        return finished;
    }

}
