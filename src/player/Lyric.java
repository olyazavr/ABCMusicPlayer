package player;

import java.util.ArrayList;
import java.util.List;

/**
 * ADT that represents a line of syllables. It has a list of syllables.
 * 
 */
public class Lyric {
	private List<String> syllables;

	public Lyric(List<String> syllables) {
		this.syllables = new ArrayList<String>(syllables);
	}

	public String getSyllable(int i) {
		return syllables.get(i);
	}

	public void addSyllable(String syllable) {
		syllables.add(syllable);
	}

}
