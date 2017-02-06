package chess;

public class Player {
	
	String colour1;
	String colour2;
	
	Player(String colour)
	{
		/*when game is started two players come into existence
		  by this constructor*/ 
		if( colour.equals("White") )
		{ 
			//setting up player1
			this.colour1 = colour;
			setWhite();
		}
		if( colour.equals("Black") )
		{
			//setting up player2
			this.colour2 = colour;
			setBlack();
		}
		
	}
	
	public void setWhite()
	{
		//initializing pieces for player1
		Board.tile[0][0].piece = new Rook( "P1R1", true, 0, 7 );
		Board.tile[0][7].piece = new Rook( "P1R2", true, 0, 7 );
		Board.tile[0][1].piece = new Knight( "P1K1", true, 0, 1 );
		Board.tile[0][6].piece = new Knight( "P1K2", true, 0, 6 );
		Board.tile[0][2].piece = new Bishop( "P1B1", true, 0, 2 );
		Board.tile[0][5].piece = new Bishop( "P1B2", true, 0, 5 );
		Board.tile[0][3].piece = new King( "P1K ", true, 0, 3 );
		Board.tile[0][4].piece = new Queen( "P1Q ", true, 0, 4 );
		Board.tile[1][0].piece = new Pawn( "P1P1", true, 1, 0 );
		Board.tile[1][1].piece = new Pawn( "P1P2", true, 1, 1 );
		Board.tile[1][2].piece = new Pawn( "P1P3", true, 1, 2 );
		Board.tile[1][3].piece = new Pawn( "P1P4", true, 1, 3 );
		Board.tile[1][4].piece = new Pawn( "P1P5", true, 1, 4 );
		Board.tile[1][5].piece = new Pawn( "P1P6", true, 1, 5 );
		Board.tile[1][6].piece = new Pawn( "P1P7", true, 1, 6 );
		Board.tile[1][7].piece = new Pawn( "P1P8", true, 1, 7 );
		}
	
	public void setBlack()
	{	
		//initializing pieces for player2
		Board.tile[7][0].piece = new Rook( "P2R1", true, 7, 0 );
		Board.tile[7][7].piece = new Rook( "P2R2", true, 7, 7 );
		Board.tile[7][1].piece = new Knight( "P2K1", true, 7, 1 );
		Board.tile[7][6].piece = new Knight( "P2K2", true, 7, 6 );
		Board.tile[7][2].piece = new Bishop( "P2B1", true, 7, 2 );
		Board.tile[7][5].piece = new Bishop( "P2B2", true, 7, 5 );
		Board.tile[7][4].piece = new King( "P2K ", true, 7, 4 );
		Board.tile[7][3].piece = new Queen( "P2Q ", true, 7, 3 );
		Board.tile[6][0].piece = new Pawn( "P2P1", true, 6, 0 );
		Board.tile[6][1].piece = new Pawn( "P2P2", true, 6, 1 );
		Board.tile[6][2].piece = new Pawn( "P2P3", true, 6, 2 );
		Board.tile[6][3].piece = new Pawn( "P2P4", true, 6, 3 );
		Board.tile[6][4].piece = new Pawn( "P2P5", true, 6, 4 );
		Board.tile[6][5].piece = new Pawn( "P2P6", true, 6, 5 );
		Board.tile[6][6].piece = new Pawn( "P2P7", true, 6, 6 );
		Board.tile[6][7].piece = new Pawn( "P2P8", true, 6, 7 );
	}
	
}