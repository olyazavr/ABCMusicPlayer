package player;

/**
 * Basic ADT that represents a single rest. It has a weight (quarter note,
 * eighth note...)
 * 
 */
public class Rest implements Note {
    private final int length;

    public Rest(int length) {
        this.length = length;
      
    }   
    
    public int getLength(){
    	return length;
    }
    
    public boolean isRest(){
    	return true;
    }
    
    public int endTime(int startTime){
    	return startTime+length;
    }

}
