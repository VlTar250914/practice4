import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FirstTaskTest {
    @ParameterizedTest
    @MethodSource("testFirstArgs")
    void testFirst(int[] expected, int[] inputArray, int[] queries) {
        Assertions.assertArrayEquals(expected, FirstTask.firstTask(inputArray, queries));
    }

    static Stream<Arguments> testFirstArgs() {
        return Stream.of(
                Arguments.of(new int[]{35, 50, -1}, new int[]{10, 20, 35, 50}, new int[]{21, 50, 70})
        );
    }
}