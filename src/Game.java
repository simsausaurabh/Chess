package chess;

import java.util.*;

public class Game {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Creating object of Board class or starting a new game
		Board B = new Board();
		
		//inx, iny are initial positions and finx, finy are final positions to move a piece
		int inx , iny , finx , finy, c = 0;
		
		boolean player1Turn = true;
		System.out.println( " P1's Turn\n" );
		B.display();
		inx = sc.nextInt();
		iny = sc.nextInt();
		finx = sc.nextInt();
		finy = sc.nextInt();
		
		//after taking input checking whether game is over or not 
		//game will be played till its over
		//or any one of the king dies
		
		while( !B.gameOver( inx ,iny ,finx ,finy ) )
			{
			if( ( player1Turn ) && ( B.tile[inx][iny].piece.p_name.substring(0, 2).equals("P1") ) )
			{
				//player1 playing having its turn
				B.move( inx ,iny ,finx ,finy );
				B.display();
				player1Turn = false;
				System.out.println( " P2's Turn\n" );
			}
			else if( !( player1Turn ) && ( B.tile[inx][iny].piece.p_name.substring(0, 2).equals("P2") ) )
			{
				//player2 playing having its turn
				B.move( inx ,iny ,finx ,finy );
				B.display();
				player1Turn = true;
				System.out.println( " P1's Turn\n" );
			}
			else
			{
				System.out.println( "Not your turn! \n Input again!" );
			}
			if( !B.gameOver( inx ,iny ,finx ,finy ) )
				//next time input will be taken if and only if game is not over
				inx = sc.nextInt();
				iny = sc.nextInt();
				finx = sc.nextInt();
				finy = sc.nextInt();
			}
		// closing scanner object to stop leaking of resource
		sc.close();
	}
	
}