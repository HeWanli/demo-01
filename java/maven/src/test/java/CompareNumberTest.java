import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by hewanli on 15-2-2.
 */
public class CompareNumberTest {
  @Test
  public void should_return_hi(){
      CompareNumber com = new CompareNumber();
      String result = com.hello();
      assertThat(result).isEqualTo("good");
  }
}
