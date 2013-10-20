package player;

import sound.MusicPlayer;

public interface MusicPart extends Music {
	/**
	    * Adds the containing notes to the music player given the number of ticks per beat
	    * @param player is a valid MusicPlayer
	    * @param ticksPerBeat is a valid integer 
	    */
	   public void addNotes(MusicPlayer player);
}
