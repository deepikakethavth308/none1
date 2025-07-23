public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        int count = 10;

        for (int i = 1; i <= count; i++) {
            sum += i;
        }

        double average = (double) sum / count;

        System.out.println("Sum of first " + count + " numbers is: " + sum);
        System.out.println("Average of first " + count + " numbers is: " + average);
    }
}

