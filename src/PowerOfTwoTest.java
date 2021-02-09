import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PowerOfTwoTest {
    int[] numberArray = {6, 15};
    boolean[] results = {false, false};

    @Test
    void testNumbers(){
        assertEquals(results[0], PowerOfTwo.isPowerOfTwo(numberArray[0]));
        assertEquals(results[1], PowerOfTwo.isPowerOfTwo(numberArray[1]));
    }

}