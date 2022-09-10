public class Array {
    public int maxSum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array is null or empty.");
        }
        int result = array[0], mark = 0;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (mark >= 0) {
                mark += element;
            } else {
                mark = element;
            }
            if (mark > result) {
                result = mark;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Array Array = new Array();
        int maxSum = Array.maxSum(new int[]{60, -2, 3, 4, -8, 7, 1, -5});
        System.out.println(maxSum);
    }

}
