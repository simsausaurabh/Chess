package chess;

public class King extends Piece {
	
	public King( String p_name, boolean status, int x, int y )
	{
		this.p_name = p_name;
		this.status = status;
		this.x = x;
		this.y = y;
	}
	
	//overriding the method of super class Piece's method- isValidMove()
	public boolean isValidMove( int inx, int iny, int finx, int finy )
	{
		if( super.isValidMove(inx, iny, finx, finy) == false )
		{
			return false;
		}
		else if( ( finx == inx ) && ( ( finy == iny-1 ) || ( finy == iny ) || ( finy == iny+1 ) )  )
		{
			if( Board.tile[finx][finy].piece == null )
			{
				return true;
			}
			else if( !super.sub( Board.tile[inx][iny].piece.p_name, 0, 1 ).equals(super.sub( Board.tile[finx][finy].piece.p_name, 0, 1 ) ) )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else if( ( finx == inx-1 ) && ( ( finy == iny-1 ) || ( finy == iny ) || ( finy == iny+1 ) )  )
		{
			if( Board.tile[finx][finy].piece == null )
			{
				return true;
			}
			else if( !super.sub( Board.tile[inx][iny].piece.p_name, 0, 1 ).equals(super.sub( Board.tile[finx][finy].piece.p_name, 0, 1 ) ) )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else if( ( finx == inx+1 ) && ( ( finy == iny-1 ) || ( finy == iny ) || ( finy == iny+1 ) )  )
		{
			if( Board.tile[finx][finy].piece == null )
			{
				return true;
			}
			else if( !super.sub( Board.tile[inx][iny].piece.p_name, 0, 1 ).equals(super.sub( Board.tile[finx][finy].piece.p_name, 0, 1 ) ) )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
}
