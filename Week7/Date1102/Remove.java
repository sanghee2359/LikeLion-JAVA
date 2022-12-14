package Week7.Date1102;

/*
만든 리스트에서 2를 제외한 모든 2의 배수 지우기
리스트에 있는 원소의 개수와 원소 출력 해보기 – 잘 지웠는지 확인 하기 위함 - 1단계 9:40까지
만든 리스트에서 3을 제외한 모든 3의 배수 지우기
*/


import java.util.ArrayList;
import java.util.List;

public class Remove {
    public int solution(int N) {
        List<Integer> list = new ArrayList<>();

        for(int i = 2; i<= N; i++) {
            list.add(i);
        }
        for(int j = 2; j*j <= N; j++){
            for(int i = 0;i<list.size(); i++) {
                if (list.get(i) % j == 0 && list.get(i) > j) list.remove(i);
            }
            //System.out.printf(j+""+list+"\n");
        }
        return list.size();
    }
    public static void main(String[] args) {
        Remove r = new Remove();
        System.out.println(r.solution(50));
    }
}
