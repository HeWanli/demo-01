import java.io.PrintStream;

/**
 * Created by hewanli on 15-2-5.
 */
public class GameProcess {
    private PrintStream out;
    public GameProcess(PrintStream out) {
        this.out = out;
    }

    public void start(){
        out.println("welcome!");
    }
}
