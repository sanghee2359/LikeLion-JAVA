package Week9.Date1118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
 */
public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if(c == ' ') answer+=' '; // 공백 추가
            else if (c >= 'A' && c <= 'Z') {
                if (c + n > 'Z') {
                    answer += (char)(c+n - 26);
                } else answer += (char)(c + n);
            }
            else if (c >= 'a' && c <= 'z') {
                if (c + n > 'z') {
                    answer += (char)(c+n - 26);
                } else answer += (char)(c + n);
            }
        }
//        System.out.println('A'-'Z');
        return answer;
    }
    public static void main(String[] args) throws IOException {
        CaesarCipher T = new CaesarCipher();
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());*/
        System.out.println(T.solution("abcdefghijklmnopqrstuvwxyz",14));
    }
}
