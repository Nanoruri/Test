import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RyuTest {
    @Test
    public void ryuTest(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10);
        List<Integer> result = list.stream()//와우, 스트림이라는 반복 연산을 자동으로 해주는 개쩌는 친구가 있구나
                .filter(number -> number % 2 == 0)//연산 식이고
                .collect(Collectors.toList());//거르고 남은 짝수친구들을 collect해서 리스트로 다시 반영해줌
        System.out.println(result);
    }
}
