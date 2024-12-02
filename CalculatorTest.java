import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CalculatorTest {

    @Test
    void testSingleNumber() {
        List<Float> numbers = new ArrayList<>(List.of(5.0f));
        List<String> operations = new ArrayList<>();
        
        Calculate(numbers, operations);
        
        assertEquals(5.0f, numbers.get(0));
        assertEquals(1, numbers.size());
        assertTrue(operations.isEmpty());
    }

    @Test
    void testAddition() {
        List<Float> numbers = new ArrayList<>(List.of(2.0f, 3.0f));
        List<String> operations = new ArrayList<>(List.of("+"));
        
        Calculate(numbers, operations);
        
        assertEquals(5.0f, numbers.get(0));
        assertEquals(1, numbers.size());
        assertTrue(operations.isEmpty());
    }

    @Test
    void testSubtraction() {
        List<Float> numbers = new ArrayList<>(List.of(10.0f, 3.0f));
        List<String> operations = new ArrayList<>(List.of("-"));
        
        Calculate(numbers, operations);
        
        assertEquals(7.0f, numbers.get(0));
        assertEquals(1, numbers.size());
        assertTrue(operations.isEmpty());
    }

    @Test
    void testMultiplication() {
        List<Float> numbers = new ArrayList<>(List.of(4.0f, 2.0f));
        List<String> operations = new ArrayList<>(List.of("*"));
        
        Calculate(numbers, operations);
        
        assertEquals(8.0f, numbers.get(0));
        assertEquals(1, numbers.size());
        assertTrue(operations.isEmpty());
    }

    @Test
    void testDivision() {
        List<Float> numbers = new ArrayList<>(List.of(8.0f, 2.0f));
        List<String> operations = new ArrayList<>(List.of("/"));
        
        Calculate(numbers, operations);
        
        assertEquals(4.0f, numbers.get(0));
        assertEquals(1, numbers.size());
        assertTrue(operations.isEmpty());
    }

    @Test
    void testMixedOperations() {
        List<Float> numbers = new ArrayList<>(List.of(6.0f, 2.0f, 3.0f));
        List<String> operations = new ArrayList<>(List.of("/", "*"));
        
        Calculate(numbers, operations);
        
        assertEquals(4.0f, numbers.get(0)); // 6 / 2 = 3, then 3 * 3 = 9
        assertEquals(1, numbers.size());
        assertTrue(operations.isEmpty());
    }
}