import java.util.Arrays;

public class MathForJava {

    public static void armstrongNum(int num) {
        int orgNum = num;
        int result = 0;

        while (num > 0) {
            int mod = num % 10;
            result = result + (int) Math.pow(mod, 3);
            num = num / 10;
        }

        System.out.println("IsArmstrongNumber: " + (result == orgNum));
    }

    public static void lengthOfNum(int num) {
        int length = (int) Math.log10(num) + 1;
        System.out.println("The length of num: " + length);
    }

    public static void printAllDivisors(int num) {
        int count = 1;
        int sqrtNum = (int) Math.sqrt(num);

        while (count <= sqrtNum) {
            if (num % count == 0) {
                System.out.println(count + " divides the num by " + (num / count));
            }
            count++;
        }
    }

    public static void isPrimeNumber(int num) {
        int count = 2;
        int sqrtNum = (int) Math.sqrt(num);

        while (count <= sqrtNum) {
            if (num == 2) {
                System.out.println("2 is neither prime not composite.");
                return;
            }
            if (num % count == 0) {
                System.out.println(num + " is not a prime number cause it is divisible by " + count);
                return;
            }
            count++;
        }
        System.out.println(num + " is a prime number.");
    }

    public static void seiveAlgorithm(int num) {
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        int count = 2;

        while (count <= (int) Math.sqrt(num)) {
            if (arr[count] == true) {
                for (int factor = count + count; factor <= num; factor += count) {
                    arr[factor] = false;
                }
            }
            count++;
        }

        int counter = 2;
        while (counter <= num) {
            if (arr[counter]) {
                System.out.println(counter + " " + arr[counter]);
            }
            counter++;
        }

    }

    public static double manualSquareRoot(int num) {
        double tolorance = 0.1;
        double root = num;
        double x = num;

        while (true) {
            root = 0.5 * (x + (num / x));
            double ans = x - root;

            if (ans <= tolorance) {
                break;
            }
            x = root;

        }

        return root;
    }

    public static void gcd(int num1, int num2) {
        int count = ((num1 >= num2) ? num2 : num1) / 2;

        while (count > 0) {
            if (num1 % count == 0 && num2 % count == 0) {
                System.out.println(count + " is the greatest common divisor.");
                return;
            }
            System.out.println("itteration");
            count--;
        }

        System.out.println("There is no common divisor.");
    }

    public static int euclideanGCD(int num1, int num2) {
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 > num2) ? num2 : num1;
        int remainder;

        while (max > 0) {
            remainder = max % min;
            if (remainder == 0) {
                System.out.println(min + " is GCD.");
                return min;
            }

            max = min;
            min = remainder;
        }

        return 0;
    }

    public static void lcm(int num1, int num2) {
        int lcm = (num1 * num2) / euclideanGCD(num1, num2);
        System.out.println("LCM of num1 and num2 is: " + lcm);
    }

    public static void calcFactorial(int num) {
        int factorial = 1;
        while (num > 0) {
            factorial = factorial * num;
            num--;
        }
        System.out.println("The factorial of num is: " + factorial);
    }

    public static void trailingZeroFactorial(int num) {
        int res = 0;
        for (int i = 5; i <= num; i = i * i) {
            res = res + num / i;
        }
        System.out.println("Trailing zeros: " + res);
    }

    public static void main(String[] args) {

        // armstrongNum(153);

        // lengthOfNum(545);

        // printAllDivisors(64);

        // isPrimeNumber(17);

        // seiveAlgorithm(40);

        // double sqrt = manualSquareRoot(24);
        // System.out.println(sqrt);

        // Greaest Common Divisor
        // gcd(0, 5);
        // int gcd = euclideanGCD(48, 18);
        // System.out.println(gcd);

        // lcm
        // lcm(24, 36);

        // Factorial
        // calcFactorial( 5);

        trailingZeroFactorial(30);

    }
}