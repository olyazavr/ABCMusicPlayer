package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.num;

/**
 * ADT that represents the complete music piece. It has a Signature and and list
 * of Voices. The Voices then have the notes and lyrics.
 * 
 */
public class MusicPiece implements MusicPart {
    private final Signature signature;
    private final List<Voice> voices;
    
    
    public MusicPiece(Signature signature, List<Voice> voices){
    	this.signature=signature;
    	this.voices=new ArrayList<Voice>(voices);    	
    }
    public void addNotes(MusicPlayer player){
    	for (Voice voice:voices){
    		voice.addNotes(player);
    		player.resetTime();
    	}
    	
    }
    
    public int calculateTicksPerBeat(){
    	int LCM=1;
    	for (Voice voice:voices){
    		LCM=num.lcm(LCM, voice.calculateTicksPerBeat());
    	}
    	return LCM;
    }
    
    
}
