package chess;

public class Pawn extends Piece {
	
	boolean firstmove = true;
	
	public Pawn( String p_name, boolean status, int x, int y )
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
		else if( super.sub(Board.tile[inx][iny].piece.p_name, 0, 1).equals("P1") )
		{
			if( finx>inx )
			{
				if( this.firstmove == true )
				{
					if( ( finx == inx+1 ) && ( ( finy == iny-1 ) || ( finy == iny+1 ) ) )
					{
						if( Board.tile[finx][finy].piece == null )
						{
							return false;
						}
						else if( !(super.sub( Board.tile[finx][finy].piece.p_name, 0, 1 ).equals("P1")) )
						{
							this.firstmove = false;
							return true;
						}
						else
						{
							return false;
						}
					}
					else if( ( finx == inx+2 && finy == iny ) && ( Board.tile[inx+1][iny].piece == null ) && ( Board.tile[inx+2][iny].piece == null ) )
					{
						this.firstmove = false;
						return true;
					}
					else
					{
						return false;
					}
				}
				else
				{
					if( ( finx == inx+1 ) && ( ( finy == iny-1 ) || ( finy == iny+1 ) ) )
					{
						if( Board.tile[finx][finy].piece == null )
						{
							return false;
						}
						else if( !(super.sub( Board.tile[finx][finy].piece.p_name, 0, 1 ).equals("P1")) )
						{
							this.firstmove = false;
							return true;
						}
						else
						{
							return false;
						}
					}
					else if( ( finx == inx+1 && finy == iny ) && ( Board.tile[inx+1][iny].piece == null ) )
					{
						this.firstmove = false;
						return true;
					}
					else
					{
						return false;
					}	
				}
			}
			else
			{
				return false;
			}
		}
		else if( super.sub(Board.tile[inx][iny].piece.p_name, 0, 1).equals("P2") )
		{
			if( finx<inx )
			{
				if( this.firstmove == true )
				{
					if( ( finx == inx-1 ) && ( ( finy == iny-1 ) || ( finy == iny+1 ) ) )
					{
						if( Board.tile[finx][finy].piece == null )
						{
							return false;
						}
						else if( !(super.sub( Board.tile[finx][finy].piece.p_name, 0, 1 ).equals("P2")) )
						{
							this.firstmove = false;
							return true;
						}
						else
						{
							return false;
						}
					}
					else if( ( finx == inx-2 && finy == iny ) && ( Board.tile[inx-1][iny].piece == null ) && ( Board.tile[inx-2][iny].piece == null ) )
					{
						this.firstmove = false;
						return true;
					}
					else
					{
						return false;
					}
				}
				else
				{
					if( ( finx == inx-1 ) && ( ( finy == iny-1 ) || ( finy == iny+1 ) ) )
					{
						if( Board.tile[finx][finy].piece == null )
						{
							return false;
						}
						else if( !(super.sub( Board.tile[finx][finy].piece.p_name, 0, 1 ).equals("P2")) )
						{
							this.firstmove = false;
							return true;
						}
						else
						{
							return false;
						}
					}
					else if( ( finx == inx-1 && finy == iny ) && ( Board.tile[inx-1][iny].piece == null ) )
					{
						this.firstmove = false;
						return true;
					}
					else
					{
						return false;
					}	
				}
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