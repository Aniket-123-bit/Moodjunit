package moodanalser;
import static org.junit.jupiter.api.Assertions.*;


public class MoodAanalyserTest {

    public void test() {
        MoodAanalyser test=new MoodAanalyser();
        String output = test.moodcheck("sad");
        assertEquals("sad",output);;
    }

}
