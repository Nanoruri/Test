import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.UIManager.get;


public class RyuTest {
    @Test
    public void ryuTest(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10);//이거 for문 돌려서..?
//        list.size() = 이 사이즈는 자기 내부에 있는 것의 개수를 반환함

        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        for (int i = 0; i < list.size() ; i++ ){
//            if (i % 2 ==0){//2로 나눠서 나머지가 0과 같으면...
//
//            }

        System.out.println(list.get(2));
        }
    }

