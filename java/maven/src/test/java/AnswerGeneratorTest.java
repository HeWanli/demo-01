import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by hewanli on 15-2-3.
 */
public class AnswerGeneratorTest {
    @Test
    public void should_return_number() {
        AnswerGenerator answer = new AnswerGenerator();
        int result = answer.radomNum();
        assertThat(result).isEqualTo(1234);   //测试是否为4位数
    }
}
