package SubstringComparisons;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class SubstringComparisonTest {

    @ParameterizedTest
    @MethodSource("substringComparisonData")
    void getSmallestAndLargest(String input, int length, String expectedSmallest, String expectedLargest) {
        String actual = SubstringComparison.getSmallestAndLargest(input, length);
        String[] actualArray = actual.split("\n");
        String actualSmallest = actualArray[0];
        String actualLargest = actualArray[1];
        System.out.println("actualSmallest = " + actualSmallest);
        System.out.println("actualLargest = " + actualLargest);
        assert actualSmallest.equals(expectedSmallest);
        assert actualLargest.equals(expectedLargest);
    }

    private static Stream<Arguments> substringComparisonData() {
        return Stream.of(
                arguments("welcometojava", 3, "ava", "wel"),
                arguments("welcometojava", 4, "come", "welc"),
                arguments("welcometojava", 2, "av", "we"),
                arguments("testTest", 4, "Test", "test"),
                arguments("aBcAbc", 2, "Ab", "cA")
        );
    }
}