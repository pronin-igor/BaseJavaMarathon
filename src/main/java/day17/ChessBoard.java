package day17;

public class ChessBoard {
    private ChessPiece cheess[][];

    public ChessBoard(ChessPiece chess[][]) {
        this.cheess = chess;
    }

    public void print() {
       for (int i = 0; i < cheess.length; i++) {
        for (int j = 0; j < cheess[i].length; j++) {
            System.out.print(cheess[j][i].getDesignation());
        }
        System.out.println();
       } 
    }
}
