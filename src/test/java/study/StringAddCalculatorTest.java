package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class StringAddCalculatorTest {
    @Test
    void blankOrNullTo0() {
        assertThat(StringAddCalculator.sum("")).isZero();
        assertThat(StringAddCalculator.sum(null)).isZero();
    }

    @Test
    void singleWordPassInt() {
        assertThat(StringAddCalculator.sum("1")).isEqualTo(1);
    }

    @Test
    void splitByCommaBeforeSum() {
        assertThat(StringAddCalculator.sum("1,2")).isEqualTo(3);
    }

    @Test
    void splitByCommaOrColonBeforeSum() {
        assertThat(StringAddCalculator.sum("1,2:3")).isEqualTo(6);
    }

    @Test
    void splitByCustomDelimiterBeforeSum() {
        assertThat(StringAddCalculator.sum("//;\n1;2;3")).isEqualTo(6);
    }

    @Test
    void negativeInputCheckBeforeSum() {
        assertThatThrownBy(()->{StringAddCalculator.sum("-1,2,3");}).isInstanceOf(RuntimeException.class);
    }
}