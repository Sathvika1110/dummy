import java.util.Scanner;

public class summ{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        average = sum / 10.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

