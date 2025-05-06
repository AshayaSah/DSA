public class BitManipulation1 {
    public static void main(String[] args) {
        // printBits(54);
        // oddEven(54);
        // int res1 = setIthBit(54, 6);
        // int res2 = toggleNthBit(54, 6);
        // int res3 = unSetNthBit(54, 1);
        // int res5 = unSetRightMostSetBit(23);
        // boolean res4 = isPowerOfTwo(128);

        printBits(23);
        System.out.println("");
        int res6 = noOfSetBits(23);
        System.out.println(res6);

    }

    public static void printBits(int num) {
        for (int i = 7; i >= 0; i--) {
            int bit = (num >> i) & 1;
            System.out.print(bit);

        }
    }

    public static void oddEven(int num) {
        boolean res = isBitSet(num, 0);
        System.out.println("");

        if (res) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    public static boolean isBitSet(int num, int bit) {
        int res = num & (1 << bit);

        return (res == 0) ? false : true;
    }

    public static int setIthBit(int num, int bit) {
        int res = num | (1 << bit);

        return res;
    }

    public static int toggleNthBit(int num, int bit) {
        int res = num ^ (1 << bit);

        return res;
    }

    public static int unSetNthBit(int num, int bit) {
        int res = num & ~(1 << bit);

        return res;
    }

    public static boolean isPowerOfTwo(int num) {
        int res = num & num - 1;

        return (res == 0) ? true : false;
    }

    public static int unSetRightMostSetBit(int num) {
        int res = num & num - 1;

        return res;
    }

    public static int noOfSetBits(int num) {
        int count = 0;
        while (num > 0) {
            num = unSetRightMostSetBit(num);
            count = count + 1;

        }

        return count;
    }
}
