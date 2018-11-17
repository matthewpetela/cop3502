// extend SugarSmashPlayer as PremiumSugarSmashPlayer here
public class PremiumSugarSmashPlayer extends SugarSmashPlayer
{
    // declare private variables here
	private int boosters;
	

    public PremiumSugarSmashPlayer()
    {
        // add constructor code here
    	super();
    	boosters = 3;
    	
    }

    // override (public!) earnPoints() method here
    @Override
    public void earnPoints()
    {
        
    	// add method code here
    	int cur = getPoints();
    	if (boosters > 0){
    		
    		setPoints(cur+500);
    		boosters--;
    	}
    	else{
    		
    		setPoints(cur+100);
    		System.out.println("Out of boosters!");
    	}
    }

    public void buyBoosters()
    {
        boosters+=3;
    }
    
}