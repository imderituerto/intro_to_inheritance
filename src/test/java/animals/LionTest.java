package animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {

    private Lion lion;

    @BeforeEach
    public void setUp(){
        lion = new Lion("Scar", false);
    }

    @Test
    public void makeNoise(){
        String expected = "Hello, my name is Scar."; //Arrange -- input the expected outcome.
        String actual = lion.makeNoise(); // Act -- call the method you want to test.
        assertEquals(expected, actual);
        // asserThat(actual).isEqualTo(expected)
    }

    @Test
    public void canEat(){
        String expected = "Mmm, that was tasty!";
        String actual = lion.eat();
        assertEquals(expected, actual);
    }
}
