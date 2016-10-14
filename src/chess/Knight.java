package chess;

public class Knight  extends Piece {

    private int x, y;
    private char symbol;
    private final String color;

    Knight(int a, int b, String d) {
        this.x = a;
        this.y = b;
        this.color = d;
        if (this.color.equals("w")) {
            this.symbol = '♘';
        } else if (this.color.equals("b")) {
            this.symbol = '♞';
        }
    }

}
