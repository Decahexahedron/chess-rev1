package chess;

public class Bishop extends Piece {

    private int x, y;
    private char symbol;
    private String color;

    Bishop(int a, int b, String d) {
        this.x = a;
        this.y = b;
        this.color = d;
        if (this.color.equals("w")) {
            this.symbol = '♗';
        } else if (this.color.equals("b")) {
            this.symbol = '♝';
        }
    }

}
