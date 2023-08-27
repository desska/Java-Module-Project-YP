import java.util.Scanner;

public class Input {

    public int nextInt(Scanner scanner) {

        boolean isContinue = true;
        int val = 0;
        while (isContinue) {

            if (scanner.hasNextInt()) {
                val = scanner.nextInt();
                isContinue = false;
            } else {
                System.out.println("Значение некорректного типа");
                scanner.next();
            }

        }
        return val;
    }

    public double nextDouble(Scanner scanner) {

        boolean isContinue = true;
        double val = 0;
        while (isContinue) {

            if (scanner.hasNextDouble()) {
                val = scanner.nextDouble();
                isContinue = false;
            } else {
                System.out.println("Значение некорректного типа");
                scanner.next();
            }

        }
        return val;
    }

    public String next(Scanner scanner) {

        return scanner.next();

    }

}
