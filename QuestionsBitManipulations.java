public class QuestionsBitManipulations {
    public static void main(String[] args) {
        // printBits(53);
        // int res1 = clearLSB(53, 4);
        // printBits(res1);
        // int res2 = clearMSB(53, 4);
        // printBits(res2);
        // int res3 = clearMSBExclusive(53, 4);
        // printBits(res3);

        // char ch1 = capitalToSmall('A');
        // System.out.println(ch1);
        // char ch2 = smallToCapital('a');
        // System.out.println(ch2);

        // swap(5, 6);

        int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3, 5, 6 };
        // printOnlyUniqueElement(arr);
        printTwoUniqueElement(arr);
    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            int bit = (num >> i) & 1;
            System.out.print(bit);

        }
        System.out.println();
    }

    public static int clearLSB(int num, int bit) {
        int res = num & ~((1 << bit + 1) - 1);

        return res;
    }

    public static int clearMSB(int num, int bit) {
        int res = num & ((1 << bit) - 1);

        return res;
    }

    public static int clearMSBExclusive(int num, int bit) {
        int res = num & ((1 << bit + 1) - 1);

        return res;
    }

    public static char capitalToSmall(int num) {
        // char res = (char) (num | (1 << 5));

        // Space ascii key is 32 which is equivalent to 1<<5
        char res = (char) (num | ' ');

        return res;
    }

    public static char smallToCapital(int num) {
        // char res = (char) (num & ~(1 << 5));

        // Underscore is equivalent to ~(1<<5b )
        char res = (char) (num & '_');

        return res;
    }

    public static void swap(int num1, int num2) {
        System.out.println("Num1 :" + num1);
        System.out.println("Num2 :" + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("Num1 :" + num1);
        System.out.println("Num2 :" + num2);
    }

    public static void printOnlyUniqueElement(int arr[]) {
        int l = arr.length;
        int res = 0;

        for (int i = 0; i < l; i++) {
            res = res ^ arr[i];
        }

        System.out.println("Unique Number: " + res);

    }

    public static void printTwoUniqueElement(int arr[]) {
        int l = arr.length;
        int res = 0;

        for (int i = 0; i < l; i++) {
            res = res ^ arr[i];
        }

        int setBit = 0;
        int bit = 0;

        while (res > 0) {
            if ((res >> bit & 1) != 0) {
                setBit = bit;
                break;
            }
            bit++;
        }

        int res1 = 0;
        int res2 = 0;

        for (int i = 0; i < l; i++) {
            if ((arr[i] >> bit & 1) != 0) {
                res1 = res1 ^ arr[i];
            }

            // You can use this method as well
            // if ((arr[i] >> bit & 1) == 0) {
            // res2 = res2 ^ arr[i];
            // }
        }

        int num1 = res ^ res1;
        int num2 = num1 ^ res;

        System.out.println("Unique Numbers: " + num1 + " " + num2); 
    }
}
