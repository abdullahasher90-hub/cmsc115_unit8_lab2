public class NumberProgram {

    public static void main(String[] args) {
        int[] values = {3, 7, 2, 9, 4};

        int result = findResult(values);

        System.out.println("Result: " + result);
    }

    public static int findResult(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
