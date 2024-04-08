package ProjectCalc;

import java.util.Scanner;

public class ViewCalculator {

    LogServis logServis = new LogServis();

    InterfaceOperation interfaceOperation = new ClassOperation();

    IOperation additionOperation = interfaceOperation.createAdditionOperation();
    IOperation divisionOperation = interfaceOperation.createDivisionOperation();
    IOperation multiplicationOperation = interfaceOperation.createMultiplicationOperation();
    IOperation subtractionOperation = interfaceOperation.createSubtractionOperation();

    public void run() {
        while (true) {
            int real1 = scannerInt("введите действительное число: ");
            int imaginary1 = scannerInt("введите мнимое число: ");

            // while (true) {
            String operator = scannerString(
                    "введите оператор: '*' - умножить,  '/' - разделить, '-' - вычесть, '+' - прибавить");
            switch (operator) {
                case "+":
                    viewCalc(real1, imaginary1, additionOperation);
                    break;
                case "-":
                    viewCalc(real1, imaginary1, subtractionOperation);
                    break;
                case "*":
                    viewCalc(real1, imaginary1, multiplicationOperation);
                    break;
                case "/":
                    viewCalc(real1, imaginary1, divisionOperation);
                    break;
                default:
                    logServis.logError("Не верный оператор. Попробуйте еще раз!");
                    break;

            }
            String question = scannerString("Новый расчет Y/N?");
            if (question.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }

    private void viewCalc(int real1, int imaginary1, IOperation operator) {
        int real2 = scannerInt("введите 2-ое действительное число: ");
        int imaginary2 = scannerInt("введите 2-ое мнимое число: ");
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

        Calculate calculate = new Calculate(operator);
        ComplexNumber result = calculate.calculate(num1, num2);
        System.out.println("результат операции: " + result);
        System.out.println();

    }

    /************* */
    private String scannerString(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        String scan = scanner.nextLine();
        return scan;
    }

    private int scannerInt(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        int scan = Integer.parseInt(scanner.nextLine());
        return scan;
    }
}
