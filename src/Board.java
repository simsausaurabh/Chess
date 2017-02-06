package chess;

public class Board {
	
	static Tile[][] tile = new Tile[8][8];
	
	Player player1;
	Player player2;
	
	public Board()
	{
		//initializing all tiles when game is started
		for( int i = 0; i<8; i++)
		{
			for( int j = 0; j<8; j++ )
			{
				tile[i][j] = new Tile( null, i, j );
			}
		}
		
		//call for setup of two players
		
		Player P1 = new Player("White");
		this.player1 = P1;
		Player P2 = new Player("Black");
		this.player2 = P2;
	}
	
	//display method
	public void display()
	{
		for( int i = 0; i<8; i++ )
		{
			for( int j = 0; j<8; j++ )
			{
				if( tile[i][j].piece != null )
				{
					System.out.print(" "+tile[i][j].piece.p_name);
				}
				else
					System.out.print(" -   ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	//checks whether game is over or not or any king is dead or both are alive
	public boolean gameOver( int inx ,int iny ,int finx ,int finy )
	{
		int c = 0;
		String p1 = "";
		String p2 = "";
		for( int i = 0; i<8; i++ )
		{
			for( int j = 0; j<8; j++ )
			{
				if( tile[i][j].piece!=null )
				{
					if( tile[i][j].piece.p_name.substring(0, 4).equals("P2K ") )
						{
							p2 = "P2K ";
							c = c+1;
						}
					if( tile[i][j].piece.p_name.substring(0, 4).equals("P1K ") )
						{
							p1 = "P1K ";
							c = c+1;
						}
				}
			}
		}
		if( c == 2 )
			{
				return false;
			}
		else
			{
				if( p1 == "P1K " )
					System.out.println("Game Over!");
				else if( p2 == "P2K " )
					System.out.println("Game Over!");
				return true;
			}
	}
	
	//it does the move of piece and checks few conditions
	public void move( int inx ,int iny ,int finx ,int finy )
	{
		if( inx<0 || iny<0 || finx>7 ||finy>7 || inx>7 || iny>7 || finx<0 ||finy<0 )
		{
			System.out.println("Index Out of Bound!\n");
		}
		else if( tile[inx][iny].piece == null && tile[finx][finy].piece == null )
		{
			System.out.println("No piece to Move!\n");
		}
		else if( tile[inx][iny].piece == null && tile[finx][finy].piece != null )
		{
			System.out.println("Null can't be moved to a piece!\n");
		}
		else if( tile[inx][iny].piece.isValidMove(inx, iny, finx, finy) )
		{
			tile[finx][finy].piece = tile[inx][iny].piece;
			tile[inx][iny].piece = null;
		}
		else
		{
			System.out.println("Invalid Move!\n");
		}
	}
	
}