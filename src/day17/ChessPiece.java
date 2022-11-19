package day17;

public enum ChessPiece {
    KING_WHITE(100,'\u265a'), KING_BLACK(100,'\u2654'),
    QUEEN_WHITE(9,'\u2655'), QUEEN_BLACK(9,'\u265b'),
    ROOK_WHITE(5, '\u2656'), ROOK_BLACK(5,'\u265c'),
    BISHOP_WHITE(3.5,'\u2657'), BISHOP_BLACK(3.5,'\u265d'),
    KNIGHT_WHITE(3,'\u2658'), KNIGHT_BLACK(3,'\u265e'),
    PAWN_WHITE(1,'\u2659'), PAWN_BLACK(1,'\u265f'),
    EMPTY(-1,'_');

    private double value;
    private char string_Value;

    ChessPiece(double value, char string_Value){
        this.value = value;
        this.string_Value = string_Value;
    }
    public char getString_Value(){
        return string_Value;
    }
}
