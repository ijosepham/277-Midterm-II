
public class FrontDeskAgent extends Agent {
    private static FrontDeskAgent agent; 
    
    private FrontDeskAgent ( ) { } 
  
    // private constructor to force use of 
    // getInstance() to create only one agent
    public static FrontDeskAgent getInstance ( ) { 
        if ( agent == null ) { 
            agent = new FrontDeskAgent ( );  
        }
        return agent;
    }
    
    public void update ( Guest g ) {
    	
    }
    
    public void registerGuest ( Guest g ) {
    	
    }

    public void checkInGuest ( Guest g ) {
	
    }
    
    public void checkOutGuest ( Guest g ) {
    	
    }
    
    public void upgradeAmenities() {
    	
    }
    
    public void editStayLength(Guest g) {
    	
    }
    
    public void cancelRegistration(Guest g) {
    	
    }  
}
