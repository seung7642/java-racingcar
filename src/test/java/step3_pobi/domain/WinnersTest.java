package step3_pobi.domain;

import org.junit.jupiter.api.Test;
import step3_pobi.domain.Car;
import step3_pobi.domain.Winners;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class WinnersTest {

    @Test
    void 우승자_구하기() {
        List<Car> cars = Arrays.asList(
                new Car("pobi", 3),
                new Car("jason", 3)
        );
        List<Car> winners = Winners.findWinners(cars);
        assertThat(winners.size()).isEqualTo(2);
    }
}