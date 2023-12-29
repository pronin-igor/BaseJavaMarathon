package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece chess[][] = {
                { ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.QUEEN_BLACK,
                        ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY },
                { ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,
                        ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY },
                { ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,
                        ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY },
                { ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE,
                        ChessPiece.BISHOP_BLACK, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY },
                { ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE,
                        ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY },
                { ChessPiece.ROOK_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,
                        ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.ROOK_WHITE },
                { ChessPiece.KING_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,
                        ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.KING_WHITE },
                { ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,
                        ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY }
        };
        ChessBoard chessBoard = new ChessBoard(chess);
        chessBoard.print();
    }
}
