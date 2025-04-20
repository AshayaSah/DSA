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

    public static void main(String[] args) {
        int number = 153;

        armstrongNum(number);
        printAllDivisors(64);
    }
}