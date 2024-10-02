package TicTacToe;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size=size;
        board=new PlayingPiece[size][size];
    }

    public boolean addPiece(int row,int col,PlayingPiece playingPiece){
        if(board[row][col]!=null){
            return false; //if the board is full
        }
        board[row][col]=playingPiece;
        return true;
    }
    
}
