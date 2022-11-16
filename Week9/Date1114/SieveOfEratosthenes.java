package Week9.Date1114;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        // N-1개 arr생성 후 개수 확인(N = 50)
        int N = 50;
        int [] sieve = new int[N-1];
        for (int i = 1; i < sieve.length; i++) {
            sieve[i] = i+1;
            System.out.println(sieve[i]);
        }

        //2를 제외한 2의 배수를 모두 지운다
        for (int i = 2; i < N ; i+=2) {
            if(sieve[i] % 2 == 0 && sieve[i]>2){
                sieve[i] = 0;
            }
        }

        //3를 제외한 3의 배수를 모두 지운다
        for (int i = 2; i<N ; i+=3) {
            if(sieve[i] % 3 == 0 && sieve[i]>3){
                sieve[i] = 0;
            }
        }

        //4를 제외한 4의 배수를 모두 지운다
        for (int i = 2; i< N ; i+=4) {
            if(sieve[i] % 3 == 0 && sieve[i]>3){
                sieve[i] = 0;
            }
        }

        for (int i = 0; i < 49; i++) {

            System.out.println("result: "+ sieve[i]);
        }
    }
}