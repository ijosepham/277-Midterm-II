
public abstract class Agent {
    protected static Agent agent; 
    
    private Agent ( ) { } 
  
    // private constructor to force use of 
    // getInstance() to create only one agent
    
    public abstract void update();
}
