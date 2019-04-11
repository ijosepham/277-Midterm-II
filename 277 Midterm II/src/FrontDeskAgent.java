
public class FrontDeskAgent {
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
}
