package chess;

public class Rook extends Piece {

	public Rook( String p_name, boolean status, int x, int y )
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
		else if( finx == inx || finy == iny )
			{
				if( Board.tile[finx][finy].piece == null )
				{
					if( finx == inx )
					{
						if( finy<iny )
						{
							int c = 0;
							for( int i = iny-1; i>finy; i-- )
							{
								if( Board.tile[inx][i].piece !=null )
									c++;
							}
								if( c == 0 )
									return true;
								else
									return false;
						}
						else if( finy>iny )
						{
							int c = 0;
							for( int i = iny+1; i<finy; i++ )
							{
								if( Board.tile[inx][i].piece !=null )
									c++;
							}
								if( c == 0 )
									return true;
								else
									return false;
						}
					}
					else if( finy == iny )
					{
						if( finx<inx )
						{
							int c = 0;
							for( int i = inx-1; i>finx; i-- )
							{
								if( Board.tile[i][iny].piece !=null )
									c++;
							}
								if( c == 0 )
									return true;
								else
									return false;
						}
						else if( finx>inx )
						{
							int c = 0;
							for( int i = inx+1; i<finx; i++ )
							{
								if( Board.tile[i][iny].piece !=null )
									c++;
							}
								if( c == 0 )
									return true;
								else
									return false;
						}
					}
					else
						return false;
				}
				else if( !super.sub( Board.tile[inx][iny].piece.p_name, 0, 1 ).equals(super.sub( Board.tile[finx][finy].piece.p_name, 0, 1 ) ) )
				{
				if( finx == inx )
				{
					if( finy<iny )
					{
						int c = 0;
						for( int i = iny-1; i>finy; i-- )
						{
							if( Board.tile[inx][i].piece!=null )
								c++;
						}
						if( c == 0 )
							return true;
						else
							return false;
					}
					else if( finy>iny )
					{
						int c = 0;
						for( int i = iny+1; i<finy; i++ )
						{
							if( Board.tile[inx][i].piece!=null )
									c++;
						}
							if( c == 0 )
								return true;
							else
								return false;
					}
				}
				if( finy == iny )
				{
					if( finx<inx )
					{
						int c = 0;
						for( int i = inx-1; i>finx; i-- )
						{
							if( Board.tile[i][iny].piece!=null )
									c++;
						}
							if( c == 0 )
								return true;
							else
								return false;
					}
					else if( finx>inx )
					{
						int c = 0;
						for( int i = inx+1; i<finx; i++ )
						{
							if( Board.tile[i][iny].piece!=null )
									c++;
						}
							if( c == 0 )
								return true;
							else
								return false;
						}
					}
				}
			}
			else
			{
				return false;
			}
			return false;
	}
}