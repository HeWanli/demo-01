import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

/**
 * Created by hewanli on 15-2-4.
 */
public class GameProcessTest {
    @Test
    public void should_print_welcome_first_when_game_start(){
        PrintStream out = mock(PrintStream.class);
        GameProcess game = new GameProcess(out);
        verify(out,never()).println("welcome!");
        game.start();
        verify(out).println("welcome!");
    }

}
