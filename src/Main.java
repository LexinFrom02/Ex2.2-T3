import javax.security.sasl.SaslClient;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double credit;
        double period;
        double percentage;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какую сумму Вы хотите взять в кредит? (рублей)");
        credit = scanner.nextDouble();
        System.out.println("На какой срок Вы хотите взять кредит? (месяцев)");
        period = scanner.nextDouble();
        System.out.println("Какую процентную ставку Вам одобрил банк?");
        percentage = scanner.nextDouble();

        CreditPaymentService creditPaymentService = new CreditPaymentService();

        double result = creditPaymentService.creditPayment(credit, period, percentage);

// Какими способами можно это вывести в консоль более лаконично? Спасибо
        System.out.print("Сумма Вашего ежемесячного платежа составляет (руб) - ");
        System.out.format("%.0f", result);
    }
}
