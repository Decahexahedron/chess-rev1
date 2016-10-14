package chess;

public class Rook extends Piece {

    private int x, y;
    private char symbol;
    private final String color;

    Rook(int a, int b, String d) {
        this.x = a;
        this.y = b;
        this.color = d;
        if (this.color.equals("w")) {
            this.symbol = '♖';
        } else if (this.color.equals("b")) {
            this.symbol = '♜';
        }
    }

}
