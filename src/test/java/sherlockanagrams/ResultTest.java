package sherlockanagrams;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("result_test")
public class ResultTest {

    @Test
    void duplcate_counter() {
        Assertions.assertThat(Result.hasDuplicate("daiek")).isFalse();
        Assertions.assertThat(Result.hasDuplicate("dado")).isTrue();
    }

    @Test
    void anagrams_counter_test() {
        Assertions.assertThat(Result.sherlockAndAnagrams("ifailuhkqq")).isEqualTo(3);
        Assertions.assertThat(Result.sherlockAndAnagrams("kkkk")).isEqualTo(10);

    }
}
