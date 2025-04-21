public class MathForDSA1 {

    public static void decimalToAnyBase(int num, int base) {
        int resNum = 0;
        int power = 0;

        while (num > 0) {
            int rem = num % base;
            num = num / base;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        System.out.println("Result is: " + resNum);
    }

    public static void anyBaseToDecimal(int num, int base) {
        int deciNum = 0;
        int power = 0;

        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;

            deciNum = deciNum + remainder * (int) Math.pow(base, power);
            power++;
        }

        System.out.println("Decimal Number is: " + deciNum);
    }

    public static void reverseNum(int num) {
        int result = 0;
        while (num > 0) {
            int remainder = num % 10;
            result = result * 10 + remainder;
            num = num / 10;
        }

        System.out.println("Reversed Num: " + result);
    }

    public static void fastExponentiation(int num, int power) {
        double res = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                res = res * num;
            }

            power = power / 2;
            num = num * num;
        }
        System.out.println("Power Result is : " + res);
    }

    public static void main(String[] args) {
        decimalToAnyBase(10, 2);
        anyBaseToDecimal(1010, 2);
        reverseNum(2345);
        fastExponentiation(5, 3);
    }
}