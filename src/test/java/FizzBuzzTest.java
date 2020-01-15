import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
      @ParameterizedTest
          @CsvSource({
                  "1,'1'",
                  "3,'fizz'",
                  "5,'buzz'",
                  "15,'fizzbuzz'",
          })
          void test(int in,String s){
              assertThat(new FizzBuzz().print(in)).isEqualTo(s);
          }
}
