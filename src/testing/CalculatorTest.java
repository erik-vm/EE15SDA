package testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class CalculatorTest {

    @Test
    @DisplayName("Add test 1")
    void add1() {
        //Given
        Calculator calculator = new Calculator();

        //When
        int result = calculator.add(4,5);

        //Then
        assertEquals(9, result);
    }
    @Test
    @DisplayName("Add test 2")
    void add2() {
        //Given
        Calculator calculator = new Calculator();

        //When
        int result = calculator.add(-4,5);

        //Then
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Sub test 1")
    void sub1() {
        //Given
        Calculator calculator = new Calculator();

        //When
        int result = calculator.sub(15,9);

        //Then

        assertEquals(6, result);
    }

    @Test
    @DisplayName("Sub test 2")
    void sub2() {
        //Given
        Calculator calculator = new Calculator();

        //When
        int result = calculator.sub(10,5);

        //Then

        assertThat(result).isNotEqualTo(5).isBetween(1,10);
    }
}