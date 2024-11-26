package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void t1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void t2() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertThat(rs).isEqualTo(12);
    }

    @Test
    @DisplayName("20 + 10 = 30")
    public void t3() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(20, 10);

        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("20 - 10 = 10")
    public void t4() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(20, 10);

        assertThat(rs).isEqualTo(10);
    }

    @Test
    @DisplayName("3 * 2 = 6")
    public void t5() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(3, 2);

        assertThat(rs).isEqualTo(6);
    }

    @Test
    @DisplayName("6 / 2 = 3")
    public void t6() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(6, 2);

        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("8 % 4 = 0")
    public void t7() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.reminder(8, 4);

        assertThat(rs).isEqualTo(0);
    }
}
