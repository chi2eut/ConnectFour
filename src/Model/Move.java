package Model;

public class Move {
    private String color;
    private int xCoordinate;

    public Move(String color, int xCoordinate) {
        this.color = color;
        this.xCoordinate = xCoordinate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

}
