import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average;
        int count = 10;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= count; i++) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        average = (double) sum / count;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}

