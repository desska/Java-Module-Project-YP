import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("На скольких человек делить счет?");

        Scanner scanner = new Scanner(System.in);
        Input input = new Input();

        int personsAmount = input.nextInt(scanner);

        while (!isCorrectPersonsAmount(personsAmount)) {
            System.out.println("Введенное значение некорректно. Повторите ввод");
            personsAmount = input.nextInt(scanner);
        }

        if (!isNeedToDistribute(personsAmount)) {
            System.out.println("Для одного человека делить ничего не требуется.");
            return;
        }

        Calc calc = new Calc();

        boolean isContinue = true;

        while (isContinue) {

            System.out.println("Введите наименование товара");
            String itemName = input.next(scanner);

            System.out.println("Введите цену для товара " + itemName);
            double itemPrice = input.nextDouble(scanner);
            while (! isCorrectPrice(itemPrice)) {
                System.out.println("Введенная цена должна быть больше нуля");
                itemPrice = input.nextDouble(scanner);
            }

            Item item = new Item(itemName, itemPrice);
            calc.addItem(item);

            System.out.println("Вы хотите добавить еще один товар? Если нет, введите \"" + finishAddComand() + "\" Для завершения ввода");

            String command = scanner.next();
            isContinue = !isFinishAddCommand(command);

        }

        System.out.println("Добавленные товары:\n" + calc.getItemsList());

        double sum = calc.getSum();
        double distributedSum = calc.distributedSum(sum, personsAmount);
        Formatter formatter = new Formatter();
        System.out.println("Распределенная на каждого сумма: " + formatter.getFormatSum(distributedSum));

    }

    static boolean isCorrectPersonsAmount(int personsAmount) {
        return personsAmount >= 1;
    }

    static boolean isNeedToDistribute(int personsAmount) {
        return personsAmount > 1;
    }

    static boolean isFinishAddCommand(String command) {
        return command.equalsIgnoreCase(finishAddComand());
    }

    static boolean isCorrectPrice(double price) {
        return price > 0;
    }
    static String finishAddComand() {
        return "завершить";
    }

}



