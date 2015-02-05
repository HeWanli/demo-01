import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

/**
 * Created by hewanli on 15-2-4.
 */
public class GameProcessTest {
    private PrintStream out;
    private GameProcess game;
    private BufferedReader reader;
    private NumberGenerator numberGenerator;
    private InOrder inOrder;

    @Before
    public void set_up() throws IOException {
        out = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        numberGenerator = mock(NumberGenerator.class);
        CompareNumber compareNumber = new CompareNumber();
        given(reader.readLine()).willReturn("1234");
        given(numberGenerator.generate()).willReturn("4321");

        game = new GameProcess(out,reader,numberGenerator,compareNumber);
    }

    @Test
    public void should_print_welcome_first_when_game_start() throws IOException {
        verify(out,never()).println("Welcome!");
        game.start();
        verify(out).println("Welcome!");
    }

    @Test
    public void should_be_print_please_input_your_answer_second_when_game_start() throws IOException{
        game.start();
        inOrder = inOrder(out);
        inOrder.verify(out).println("Welcome!");
        inOrder.verify(out).println("Please input your answer(6):");
    }

    @Test
    public void should_be_print_compare_result_when_answer_is_wrong() throws IOException{
        game.start();
        inOrder.verify(out).println("Welcome!");
        inOrder.verify(out).println("Please input your answer(6):");
        inOrder.verify(out).println("0A4B");
    }
}
