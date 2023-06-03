package Response;

public class MoveResponse {
    private String[][] board;
    private int[] availableSpots;
    private String whoseTurn;
    private String whoWon;
    private boolean finished;

    public MoveResponse(String[][] board, int[] availableSpots, String whoseTurn, String whoWon, boolean finished) {
        this.board = board;
        this.availableSpots = availableSpots;
        this.whoseTurn = whoseTurn;
        this.whoWon = whoWon;
        this.finished = finished;
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

    public String getWhoseTurn() {
        return whoseTurn;
    }

    public void setWhoseTurn(String whoseTurn) {
        this.whoseTurn = whoseTurn;
    }

    public String getWhoWon() {
        return whoWon;
    }

    public void setWhoWon(String whoWon) {
        this.whoWon = whoWon;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
