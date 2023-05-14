package Instanceof;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InstanceOFTutorialTest {

    @Test
    void count() {
        //Arrange
        InstanceOFTutorial instanceOFTutorial = new InstanceOFTutorial();
        var data = new ArrayList<>();
        data.add(new Student());
        data.add(new Rockstar());
        data.add(new Hacker());
        data.add(new Student());
        //Act
        String actual = instanceOFTutorial.count(data);
        //Assert
        assert actual.equals("2 1 1");
    }
}