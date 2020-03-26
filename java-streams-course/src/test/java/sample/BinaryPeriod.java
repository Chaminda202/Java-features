package sample;

public class BinaryPeriod {
    public static void main(String[] args){
        System.out.println(solution(955));
    }

    public static int solution(int n){
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = 0; p < l; p++) {
            if (p <= l / 2) {
                int i;
                boolean ok = true;
                for (i = 0; i < l - p; i++) {
                    if (d[i] != d[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    return p;
                }
            }
        }
        return -1;
    }
}
