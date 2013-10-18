package player;

import org.junit.Test;

/**
 * Play piece1.abc, piece2.abc, piece3.abc. Make sure no exceptions thrown.
 * 
 * @category no_didit
 */
public class WarmUpTest {

    @Test
    public void playPiece1Test() {
        Main.play("sample_abc/piece1.abc");
    }

    @Test
    public void playPiece2Test() {
        Main.play("sample_abc/piece2.abc");
    }

    @Test
    public void playPiece3Test() {
        Main.play("sample_abc/piece3.abc");
    }
}