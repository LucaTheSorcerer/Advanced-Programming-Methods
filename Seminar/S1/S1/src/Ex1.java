public class Ex1 {

    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    //multiply function without using *

    public double multiply(int x, int y) {
        double result = 0;
        for (int i = 0; i < y; i++) {
            result += x;
        }
        return result;
    }

}