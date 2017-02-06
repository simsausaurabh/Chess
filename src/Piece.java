package chess;

public class Piece {
	String p_name;
	public int x;
	public int y;
	public boolean status;
	
	public boolean isValidMove( int inx, int iny, int finx, int finy )
	{
		if( inx<0 || iny<0 || finx>7 ||finy>7 || inx>7 || iny>7 || finx<0 ||finy<0 )
		{
			//to check whether index is out of bound or not
			return false;
		}
		else if( inx == finx && iny == finy )
			{
			//it is to ensure that initial and final positions are different
				return false;
			}
		else
			{
				return true;
			}
	}
	
	public String sub( String str, int start, int end )
	{
		String r = "";
		for( int i = start; i<=end; i++ )
		{
			r+=str.charAt(i);
		}
		return r;
	}
	
}