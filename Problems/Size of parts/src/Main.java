import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int tooLarge = 0;
        int tooSmall = 0;
        int perfect = 0;
        for (int i = 0; i < n; i++) {
            int detectorReading = scanner.nextInt();
            if (detectorReading == 0) {
                perfect += 1;
            } else if (detectorReading == 1) {
                tooLarge += 1;
            } else if (detectorReading == -1) {
                tooSmall += 1;
            }
        }
        System.out.print(perfect + " "  + tooLarge + " " + tooSmall);
    }
}