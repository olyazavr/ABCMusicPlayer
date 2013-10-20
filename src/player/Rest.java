package player;

/**
 * Basic ADT that represents a single rest. It has a length 
 * - the fraction of default note
 * 
 */
public class Rest implements Note {
    private final int length;

    public Rest(int length) {
        this.length = length;
      
    }       
    
    public boolean isRest(){
    	return true;
    }
    
    public int endTime(int startTime){
    	return startTime+length;
    }

}
