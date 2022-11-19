package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;

        ChessPiece[] massive = new ChessPiece[] {
                pawnWhite,
                pawnWhite,
                pawnWhite,
                pawnWhite,
                rookBlack,
                rookBlack,
                rookBlack,
                rookBlack};

        for (ChessPiece x: massive) {
            System.out.print(x.getString_Value());
        }
    }
}
