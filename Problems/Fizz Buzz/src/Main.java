import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startOfTheInterval = sc.nextInt();
        int endOfTheInterval = sc.nextInt();
        final int fizz = 3;
        final int buzz = 5;

        for (int i = startOfTheInterval; i <= endOfTheInterval; i++) {
            if (i % fizz == 0 && i % buzz == 0) {
                System.out.println("FizzBuzz");
            } else if (i % fizz == 0) {
                System.out.println("Fizz");
            } else if (i % buzz == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}