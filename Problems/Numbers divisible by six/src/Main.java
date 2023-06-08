import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        final int six = 6;
        int countOfNumbersDivisibleBySix = 0;
        final int minCountOfNumberDivisibleBySix = 1;
        int sumOfNumbersDivisibleBySix = 0;

        Scanner sc = new Scanner(System.in);
        int amountOfNumbers = sc.nextInt();

        for (int i = 0; i < amountOfNumbers; i++) {
            int numberEntered = sc.nextInt();
            if (numberEntered % six == 0) {
                countOfNumbersDivisibleBySix += 1;
                sumOfNumbersDivisibleBySix += numberEntered;
            }

            if (i == amountOfNumbers - 1) {
                if (countOfNumbersDivisibleBySix >= minCountOfNumberDivisibleBySix) {
                    System.out.println(sumOfNumbersDivisibleBySix);
                }
            }
        }
    }
}