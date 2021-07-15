package twostrings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import twostrings.Result;

@DisplayName("testing")
public class SolutionTest {

    @Test
    void solution_test(){

        Assertions.assertThat(Result.twoStrings("DADO", "DFUX")).isEqualTo("YES");
        Assertions.assertThat(Result.twoStrings("DADO", "UUUUU")).isEqualTo("NO");
        Assertions.assertThat(Result.twoStrings("DAFO", "WEPOWEMXCPJEPIM")).isEqualTo("YES");
        Assertions.assertThat(Result.twoStrings("DAFO", "WEPOWEMXCPJEPIM")).isEqualTo("NO");
        Assertions.assertThat(Result.twoStrings("hello", "world")).isEqualTo("YES");
    }

}
