package Week10.Date1122;
// array말고 list를 쓴 이유를 생각 해보세요.
// 값을 꺼내면서 list에 값이 없어지면? 탈출조건을 만들 수 있기 때문일 것 같다
// 탈출 조건이 있으나 탈출 조건에 도달하지 못하면 stack overFlow가 발생하기도 한다.
import java.util.ArrayList;
import java.util.List;

public class ArraySum {
    static int sum = 0;
    public static int sum(List<Integer> nums){
        if(nums.size() == 0) {
            return 0;
        }
        else {
            int idx = nums.size() - 1;
            sum += nums.get(idx);
            System.out.println(sum);
            return sum(nums);
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        sum(nums);
    }
}