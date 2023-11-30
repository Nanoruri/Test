import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.UIManager.get;


public class RyuTest {
    @Test
    public void ryuTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);//이거 for문 돌려서..?
//        list.size() = 이 사이즈는 자기 내부에 있는 것의 개수를 반환함

       List<Integer> result = new ArrayList<Integer>();//???이거 왜 두번 싸여져있었지


        for (int i = 0; i <= list.size(); i++) {//지금 size는 10..그냥 숫자 10으로 넣어도 되지않나??
            int zzaksu = list.get(i);//1,2,3,4,5,6,7,8,9,10...을
            if (i % 2 == 0 ){//2로 나눠서 나머지가 0과 같으면...result값에 추가 하면 될듯 = 짝수만 담겨짐
            result.add(zzaksu);
            }



            System.out.println(result);
        }
    }
}

