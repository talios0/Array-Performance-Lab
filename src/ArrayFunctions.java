public class ArrayFunctions {
    public static int GetLeast(Integer[] numbers) {
        int least = numbers[0];
        int j = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < least) {
                least = numbers[i];
                j = i;
            }
        }
        return j;
    }

    public static int GetSecondLeast(Integer[] numbers) {
        int least = numbers[0];
        int j = 0;
        int k = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < least) {
                least = numbers[i];
                k = j;
                j = i;
            }
        }
        return k;
    }
}
