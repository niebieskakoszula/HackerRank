package StringReverse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StringReverseTest {

    @ParameterizedTest
    @MethodSource("stringReverseData")
    void main(String input, String expected) {
        String actual = StringReverse.CheckPalindrome(input);
        assert actual.equals(expected);

    }
    private static Stream<Arguments> stringReverseData() {
        return Stream.of(
                arguments("madam", "Yes"),
                arguments("java", "No"),
                arguments("test", "No"),
                arguments("racecar", "Yes"),
                arguments("12321", "Yes"),
                arguments("12345", "No")
        );
    }
}