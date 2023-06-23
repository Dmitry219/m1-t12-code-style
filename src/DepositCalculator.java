import java.util.Scanner;
import java.util.Math;


public class DepositCalculator {
    double calculateComplexPercent(double a, double y,int d ) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return сalculateRound(pay, 2);
    }

    double calculateSimplePercentFunction(double amount, double yearRate, int depositPeriod) {
        return сalculateRound(amount + amount * yearRate * depositPeriod, 2);
    }

    double сalculateRound(double value, int places) {
        double ScaLe = Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
    }

    void calculateTtheValueOfTheContribution() {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");

        int amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");

        period = scanner.nextInt( );

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");

        action = scanner.nextInt();

        double out = 0;

        if (action == 1) {
            out = calculateSimplePercentFunction(amount, 0.06, period);
        } else if (action == 2) {
            out = calculateComplexPercent(amount, 0.06, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }

    public static void main(String[] args) {
        new DepositCalculator().calculateTtheValueOfTheContribution();
    }

}
