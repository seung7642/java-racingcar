package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static racing.InputView.*;

public class RacingTest {
    @DisplayName("자동차 대수와 이동 횟수는 자연수이고 2대 이상이어야 함")
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5})
    void 입력값_확인(int input){
        validateInput(input);
    }

    @DisplayName("2개의 차가 달리고 2번째 차량이 움직인 경우 테스트")
    @Test
    void 정상_작동_확인(){
        Strategy strategy = new RandomStrategy();
        List<Car> carList = new ArrayList<>();
        for(int index = 0; index < 2; ++index){
            carList.add(new Car());
        }

        // 2번째 차량(index - 1)이 움직이도록 함
        while(carList.get(1).getMoveCount() < 2){
            carList.get(1).moveCar(strategy);
        }

        assertThat(carList.get(0).getMoveCount()).isEqualTo(1);
        assertThat(carList.get(1).getMoveCount()).isEqualTo(2);
    }
}