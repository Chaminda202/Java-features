package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class Lecture3 {

  @Test
  public void min() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    Integer minVal = numbers.stream()
            .min((number1, number2) -> number1 > number2 ? 1 : -1)
            .get();

    assertThat(minVal).isEqualTo(1);

    Integer minValue = numbers.stream()
            .min(Comparator.naturalOrder())
            .get();

    assertThat(minVal).isEqualTo(1);
  }

  @Test
  public void max() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

    Integer mxValue = numbers.stream()
            .max(Comparator.naturalOrder())
            .get();

    assertThat(mxValue).isEqualTo(100);
  }
}
