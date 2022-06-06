package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int numberOfPieces = 0;

    private Pawn[][] pieces;

    public ChessBoard() {
        this.pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(numberOfPieces > MAX_BOARD_HEIGHT + 1 + MAX_BOARD_WIDTH + 1) return;
        pawn.setXCoordinate(xCoordinate);
        pawn.setYCoordinate(yCoordinate);
        int i = pawn.getXCoordinate();
        int j =  pawn.getYCoordinate();
        //ChessBoard[][] tabla[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT]=Pawn.getChessBoard();
        //Pawn.chessBoard[i][j]=1;
        numberOfPieces++;
        if(IsLegalBoardPosition(i, j)){
            this.pieces[i][j]=pawn;
        }
        else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }

        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate>=MAX_BOARD_WIDTH || yCoordinate>=MAX_BOARD_HEIGHT || yCoordinate <0 || xCoordinate < 0){
            return false;
        } else return true;


        //throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }
}
