import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the first number");
//        int first = scanner.nextInt();
//
//        System.out.println("Enter the second number");
//        int second = scanner.nextInt();
//
//        System.out.println("Enter the third number");
//        int third = scanner.nextInt();
        System.out.println("Enter three numbers");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int a = 75;
        int third = scanner.nextInt();

        int sum = first + second + third;
        double average = ((double) sum) / 3;

        int diff1 = first - second;
        int diff2 = first - third;
        int diff3 = second - third;

        System.out.printf("The numbers are %d, %d, %d\n", first, second, third);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
