package unitTests.com.example;

import com.example.findbugs.ScaryRankBugs;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by ittiel on 6/19/17.
 */
public class TestWebApp {

    @Test
    public void testWebApp(){
        assertEquals(ScaryRankBugs.incorrectAssignmentInIfCondition(true), "true");


    }
}
