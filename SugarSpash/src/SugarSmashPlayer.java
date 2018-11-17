public class SugarSmashPlayer
{
    // add private variables here
	private int id;
	private String playerName;
	private int points;
	

    public SugarSmashPlayer()
    {
        id = 0001;
        playerName = "PlsNoMoreCengage";
        points = 0;
    }
    public void setIdNumber(int num)
    {
        // add method code here
    	id = num;
    }
    public void setName(String player)
    {
        // add method code here
    	playerName = player;
    }
    public void setPoints(int pts)
    {
        // add method code here
    	points = pts;
    }
    public void earnPoints()
    {
        // add method code here
    	points+=100;
    }
    public int getIdNumber()
    {
        // add method code here
    	return id;
    }
    public String getName()
    {
        // add method code here
    	return playerName;
    }
    public int getPoints()
    {
        // add method code here
    	return points;
    }
}