package chess;

public class Chess {

    static String store = "♔♕♖♗♘♙♚♛♜♝♞♟";
    static char space1 = '█';
    static char space3 = '⎕';
    static char space4 = ' ';
    static char space2 = ' ';

    public static char[][] board = new char[8][8];
    public static King wking, bking;
    public static Queen wqueen, bqueen;
    public static Knight wknight1, wknight2, bknight1, bknight2;
    public static Bishop wbishop1, wbishop2, bbishop1, bbishop2;
    public static Rook wrook1, wrook2, brook1, brook2;
    public static Pawn wpawn1, wpawn2, wpawn3, wpawn4, wpawn5, wpawn6, wpawn7, wpawn8,
            bpawn1, bpawn2, bpawn3, bpawn4, bpawn5, bpawn6, bpawn7, bpawn8;

    public static void main(String[] args) {
        init();
        assign();
        draw();
    }// end of main

    public static void init() {
        //board[2][5] = wknight;
        wking = new King(0, 3, "w");
        bking = new King(7, 4, "b");
        wqueen = new Queen(0, 4, "w");
        bqueen = new Queen(7, 3, "b");
        wknight1 = new Knight(0, 1, "w");
        wknight2 = new Knight(0, 6, "w");
        bknight1 = new Knight(7, 1, "b");
        bknight2 = new Knight(7, 6, "b");
        wbishop1 = new Bishop(0, 2, "w");
        wbishop2 = new Bishop(0, 5, "w");
        bbishop1 = new Bishop(7, 2, "b");
        bbishop2 = new Bishop(7, 5, "b");
        wrook1 = new Rook(0, 0, "w");
        wrook2 = new Rook(0, 7, "w");
        brook1 = new Rook(7, 0, "b");
        brook2 = new Rook(7, 7, "b");
        wpawn1 = new Pawn(1, 0, "w");
        wpawn2 = new Pawn(1, 1, "w");
        wpawn3 = new Pawn(1, 2, "w");
        wpawn4 = new Pawn(1, 3, "w");
        wpawn5 = new Pawn(1, 4, "w");
        wpawn6 = new Pawn(1, 5, "w");
        wpawn7 = new Pawn(1, 6, "w");
        wpawn8 = new Pawn(1, 7, "w");
        bpawn1 = new Pawn(6, 0, "b");
        bpawn2 = new Pawn(6, 1, "b");
        bpawn3 = new Pawn(6, 2, "b");
        bpawn4 = new Pawn(6, 3, "b");
        bpawn5 = new Pawn(6, 4, "b");
        bpawn6 = new Pawn(6, 5, "b");
        bpawn7 = new Pawn(6, 6, "b");
        bpawn8 = new Pawn(6, 7, "b");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = 'x';
            }
        }
    }

    static void assign() {
        Piece[] plist = new Piece[32];
        plist[0] = wking;
        plist[1] = wqueen;
        plist[2] = wbishop1;
        plist[3] = wbishop2;
        plist[4] = wknight1;
        plist[5] = wknight2;
        plist[6] = wrook1;
        plist[7] = wrook2;
        plist[8] = wpawn1;
        plist[9] = wpawn2;
        plist[10] = wpawn3;
        plist[11] = wpawn4;
        plist[12] = wpawn5;
        plist[13] = wpawn6;
        plist[14] = wpawn7;
        plist[15] = wpawn8;
        plist[16] = wking;
        plist[17] = bqueen;
        plist[18] = bbishop1;
        plist[19] = bbishop2;
        plist[20] = bknight1;
        plist[21] = bknight2;
        plist[22] = brook1;
        plist[23] = brook2;
        plist[24] = bpawn1;
        plist[25] = bpawn2;
        plist[26] = bpawn3;
        plist[27] = bpawn4;
        plist[28] = bpawn5;
        plist[29] = bpawn6;
        plist[30] = bpawn7;
        plist[31] = bpawn8;
        for (int i = 0; i < plist.length - 1; i++) {
            int ax = plist[i].getX();
            int ay = plist[i].getY();
            board[ax][ay] = plist[i].getSymbol();
//            board[plist[i].getX()][plist[i].getY()] = '@';
        }
    }

    public static void draw() {
        for (int i = 0; i <= board[0].length - 1; i++) {
            for (int j = 0; j <= board[1].length - 1; j++) {
                if (j < board[1].length - 1) {
//                    if (board[i][j] != wking.getSymbol() && board[i][j] != wqueen.getSymbol()
//                            && board[i][j] != wrook1.getSymbol() && board[i][j] != wbishop1.getSymbol()
//                            && board[i][j] != wknight1.getSymbol() && board[i][j] != wpawn1.getSymbol()
//                            && board[i][j] != bking.getSymbol() && board[i][j] != bqueen.getSymbol()
//                            && board[i][j] != brook1.getSymbol() && board[i][j] != bbishop1.getSymbol()
//                            && board[i][j] != bknight1.getSymbol() && board[i][j] != bpawn1.getSymbol()) {
                    if (board[i][j] == 'x') {
                        if (j % 2 == 0) {
                            if (i % 2 == 0) {
                                System.out.print(space1);
                            } else {
                                System.out.print(space2);
                                System.out.print(space2);
                            }
                        } else if (i % 2 == 0) {
                            System.out.print(space2);
                            System.out.print(space2);
                        } else {
                            System.out.print(space1);
                        }
                    } else if (board[i][j] != 'x') {
                        if (i % 2 == 0) {
                            if (j % 2 == 0) {
                                System.out.print(space1);
                                System.out.print(board[i][j]);
//                                System.out.print(space2);
//                            System.out.print('⃣');
                            } else {
                                System.out.print(space2);
                                System.out.print(space2);
                                System.out.print(board[i][j]);
                            }
                        } else if (j % 2 == 0) {
                            System.out.print(space2);
                            System.out.print(space2);
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(space1);
                            System.out.print(board[i][j]);
//                        System.out.print('⃣');
                        }
                    }
                } else if (board[i][j] == 'x') {
                    if (j % 2 == 0) {
                        if (i % 2 == 0) {
                            System.out.println(space1);
                        } else {
                            System.out.print(space2);
                            System.out.print(space2);
                            System.out.println(space2);
                        }
                    } else if (i % 2 == 0) {
                        System.out.print(space2);
                        System.out.print(space2);
                        System.out.println(space2);
                    } else {
                        System.out.println(space1);
                    }
                } else if (board[i][j] != 'x') {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            System.out.print(space1);
                            System.out.println(board[i][j]);
                        } else {
                            System.out.print(space2);
                            System.out.print(space2);
                            System.out.println(board[i][j]);
                        }
                    } else if (j % 2 == 0) {

                        System.out.println(board[i][j]);
                    } else {
                        System.out.print(space1);
                        System.out.println(board[i][j]);
                    }
                }
            }
        }
    }
}
