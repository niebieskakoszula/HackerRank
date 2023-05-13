package Anagram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AnagramTest {

    @ParameterizedTest
    @MethodSource("anagramData")
    void isAnagram(String a, String b, boolean expected) {
        boolean actual = Anagram.isAnagram(a, b);
        assert actual == expected;
    }

    private static Stream<Arguments> anagramData() {
        return Stream.of(
                arguments("CAT", "ACT", true),
                arguments("CAT", "DOG", false),
                arguments("dormitory", "dirtyroom", true),
                arguments("dormitory", "dirtyrooms", false),
                arguments("debitcard", "badcredit", true),
                arguments("debitcard", "BADCREDIT", true)
        );
    }
}