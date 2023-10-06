package Ex3;

public class Ex3 {

    /*
      There are 2 large numbers. The numbers are represented as an array.
      1. calculate the sum. The numbers have the same number of digits. e.g., [1 3 0 0 0 0 0] + [8 7 0 0 0 0 0] = [1 0 0 0 0 0 0 0]
      2. calculate the difference. The numbers have the same number of digits. e.g., [8 3 0 0 0 0 0] - [5 4 0 0 0 0 0] = [2 9 0 0 0 0 0]
      3. calculate the multiplication. First number is a large number, second number is just a digit.
      E.g., [2 3 6 0 0 0 0] * 2 = [4 7 2 0 0 0 0]
      4. Calculate the integer division. First number is a large number, second number
      is just a digit.
      E.g., [2 3 6 0 0 0 0] / 2 = [1 1 8 0 0 0 0]
     */

    //1.
    public static int[] sum(int[] number1, int[] number2) {

        int[] result = new int[number1.length + 1];
        int carry = 0;
        int length = number1.length;

        for(int i = length - 1; i >= 0; i--) {
            int sum = number1[i] + number2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if(carry > 0) {
            int[] newResult = new int[length + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, length);

            result = newResult;
        }

        return result;
    }

    //2.
    public static int[] subtract(int[] number1, int[] number2) {
        int n = number1.length;
        int[] result = new int[n];
        int borrow = 0;

        for(int i = n - 1; i >= 0; i--) {
            int difference = number1[i] - number2[i] - borrow;

            if(difference < 0) {
                difference += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = difference;
        }

        return result;
    }

    public static int[] multiply(int[] number1, int digit) {
        int length = number1.length;
        int[] result = new int[length];
        int carry = 0;

        for(int i = length - 1; i >= 0; i--) {
            int product = number1[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        if(carry > 0) {
            int[] newResult = new int[length + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, length);
            result = newResult;
        }

        return result;
    }

    public static int[] divide(int[] num1, int divisor) {
        int n = num1.length;
        int[] result = new int[n];
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            int currentDigit = num1[i] + remainder * 10;
            result[i] = currentDigit / divisor;
            remainder = currentDigit % divisor;
        }

        return result;
    }


}
