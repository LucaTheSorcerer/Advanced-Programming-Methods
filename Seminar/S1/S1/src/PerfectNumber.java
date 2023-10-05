public class PerfectNumber {

    public boolean isPerfect(int x) {
        int s = 1;
        for(int i = 2; i < x; i ++) {
            if(x % i == 0) {
                s += i;
            }
        }

        return x == s;
    }
}
