package chess;

public class Tile {
	
	Piece piece;
	int x;
	int y;
	
	public Tile( Piece piece, int x, int y )
	{
		this.piece = piece;
		this.x = x;
		this.y = y;
	}
	
	//returns current tile
	public Piece getTile()
	{
		if( piece == null )
		{
			return null;
		}
		else
		{
			return piece;
		}
	}
	
}
