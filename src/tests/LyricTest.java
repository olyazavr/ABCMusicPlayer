package tests;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import adts.Lyric;

public class LyricTest
{
  @Test
  public void equalsTest()
  {
    Lyric lyric1 = new Lyric(Arrays.asList(new String[] { "A", "B123", " " }));
    Lyric lyric2 = new Lyric(Arrays.asList(new String[] { "A", "B123", " " }));
    Lyric lyric3 = new Lyric(new ArrayList<String>());
    
    Assert.assertEquals(lyric1, lyric1);
    Assert.assertEquals(lyric1, lyric2);
    Assert.assertNotEquals(lyric1, lyric3);
  }
  
  @Test
  public void hashCodeTest()
  {
    Lyric lyric1 = new Lyric(Arrays.asList(new String[] { "A", "B123", " " }));
    Lyric lyric2 = new Lyric(Arrays.asList(new String[] { "A", "B123", " " }));
    
    Assert.assertEquals(lyric1.hashCode(), lyric1.hashCode());
    Assert.assertEquals(lyric1.hashCode(), lyric2.hashCode());
  }
  
  @Test
  public void toStringTest()
  {
    Lyric lyric1 = new Lyric(Arrays.asList(new String[] { "Psy", "chic", "spies", "from", "China", "Try", "to", 
      "steal", "your", "mind's", "elation.", "Lit", "tle", "girls", "from", "Swe", "den", "Dream", "of", 
      "sil", "ver", "screen", "quo", "ta", "tions" }));
    Lyric lyric2 = new Lyric(Arrays.asList(new String[] { "A-", " ", "B123", "Woo-oop", " ", " ", "eeee" }));
    
    Assert.assertEquals(
      "Psy chic spies from China Try to steal your mind's elation. Lit tle girls from Swe den Dream of sil ver screen quo ta tions", 
      
      lyric1.toString());
    Assert.assertEquals("A-   B123 Woo-oop     eeee", lyric2.toString());
  }
  
  @Test
  public void isEmptyTest()
  {
    Lyric lyric1 = new Lyric(Arrays.asList(new String[] { "Psy", "chic", "spies", "from", "China", "Try", "to", 
      "steal", "your", "mind's", "elation.", "Lit", "tle", "girls", "from", "Swe", "den", "Dream", "of", 
      "sil", "ver", "screen", "quo", "ta", "tions" }));
    Lyric lyric2 = new Lyric(Arrays.asList(new String[] { " " }));
    Lyric lyric3 = new Lyric(new ArrayList());
    
    Assert.assertFalse(lyric1.isEmpty());
    Assert.assertFalse(lyric2.isEmpty());
    Assert.assertTrue(lyric3.isEmpty());
  }
  
  @Test
  public void getSyllableTest()
  {
    Lyric lyric1 = new Lyric(Arrays.asList(new String[] { "Psy", "chic", "spies", "from", "China", "Try", "to", 
      "steal", "your", "mind's", "elation." }));
    Lyric lyric2 = new Lyric(Arrays.asList(new String[] { " " }));
    
    Assert.assertEquals("Psy", lyric1.getSyllable(0));
    Assert.assertEquals("elation.", lyric1.getSyllable(10));
    Assert.assertEquals("Try", lyric1.getSyllable(5));
    Assert.assertEquals(" ", lyric2.getSyllable(0));
  }
}