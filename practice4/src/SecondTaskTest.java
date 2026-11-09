import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SecondTaskTest {
    @ParameterizedTest
    @MethodSource("testSecondArgs")
    void testFirst(String[] expected, int[] inputArray, String[] queries) {
        Assertions.assertArrayEquals(expected, SecondTask.secondTask(inputArray, queries));
    }

    static Stream<Arguments> testSecondArgs() {
        return Stream.of(
                Arguments.of(new String[]{"10 20 20 35 50", "YES", "4", "10 15 20 35 50"}, new int[]{20, 10, 35, 20, 50}, new String[]{"ADD 15", "CONTAINS 35", "COUNT_RANGE 15 35", "REMOVE 20", "PRINT"})
        );
    }
}