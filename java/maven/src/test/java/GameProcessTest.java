import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

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

    @Test
    public void should_be_print_please_input_your_answer_second_when_game_start(){
        PrintStream out = mock(PrintStream.class);
        GameProcess game = new GameProcess(out);
        game.start();
        InOrder inOrder = inOrder(out);
        inOrder.verify(out).println("welcome!");
        inOrder.verify(out).println("Please input your answer(6):");
    }
}
