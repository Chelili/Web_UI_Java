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
    void negativeSquareCalcTest3() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> assertEquals(TriangleArea.calculateArea(-2,5,3), "Некорректный треугольник!!"));
    }

    @Test
    @DisplayName("Второй негативный тест")
    void negativeSquareCalcTest4() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> assertEquals(TriangleArea.calculateArea(1,0,3), "Некорректный треугольник!!"));
    }

}



