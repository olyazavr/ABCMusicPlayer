package player;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface that will help build all of the ADT components. Everything will be
 * immutable.
 * 
 */
public class MusicPiece implements Msuic {
    private Signature signature;
    private List<Voice> voices;
    
    public MusicPiece(Signature signature, List<Voice> voices){
    	this.signature=signature;
    	this.voices=new ArrayList<Voice>(voices);
    }
    public addNotes(MusicPlayer player, int ticksPerBeat){
    	for (Voice voice:voices){
    		voice.addNotes(player, ticksPerBeat);
    	}
    	
    }
    
}
