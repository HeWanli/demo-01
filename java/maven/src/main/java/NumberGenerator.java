import java.util.Random;
/**
 * Created by hewanli on 15-2-4.
 */
public class NumberGenerator {
    private Random random;

    public NumberGenerator(Random random) {
        this.random = random;
    }

    public String generate() {
        StringBuilder digits = new StringBuilder();
        while (digits.length() < 4){
            String num = String.valueOf(random.nextInt(10));
            if(digits.indexOf(num) == -1){
                digits.append(num);
            }
        }
        return digits.toString();
    }
}
