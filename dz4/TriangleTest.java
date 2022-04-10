import homework4.TriangleArea;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleTest {
    @Test
    @DisplayName("Первый позитивный тест")
    void successCalculationTest1() throws Exception {
        assertEquals(TriangleArea.calculateArea(3,3,3), 2);
    }

    @Test
    @DisplayName("Второй позитивный тест")
    void successCalculationTest2() throws Exception {
        assertEquals(TriangleArea.calculateArea(3,4,5), 6);
    }

    @Test
    @DisplayName("Первый негативный тест")
    void successCalculationTest3() throws Exception {
        assertEquals(TriangleArea.calculateArea(3,4,5), 2);
    }

    @Test
    @DisplayName("Второй негативный тест")
    void successCalculationTest4() throws Exception {
        assertEquals(TriangleArea.calculateArea(4,5,0), 2);
    }

}



