package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.num;

/**
 * ADT that represents a voice. It has a name, and a list of Measures.
 * 
 * By default, there is one voice, but there can be multiple. This is used to
 * have several melodies play at once.
 * 
 */
public class Voice implements MusicPart{
    private final String name;
    private final List<Measure> measures;
    
    public Voice(String name, List<Measure> measures) {
        this.name = name;
        this.measures = new ArrayList<Measure>(measures);
    }
    
    public void addNotes(MusicPlayer player){
    	for (Measure measure:measures){
    		measure.addNotes(player);    		
    	}
    	
    }
    
    public int calculateTicksPerBeat(){
    	int LCM=1;
    	for (Measure measure:measures){
    		LCM=num.lcm(LCM, measure.calculateTicksPerBeat());
    	}
    	return LCM;
    }

    
}
